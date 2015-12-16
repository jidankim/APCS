public class RationalNumber implements Comparable{

    private int _n, _d;

    // constructor
    // assume d != 0
    public RationalNumber(int n, int d) {
	if (d == 0) throw new ArithmeticException("denominator can't be 0");
	//	boolean isPos = n * d >= 0;
	// 	if (isPos) n = Math.abs(n);
	//        else n = -1 * Math.abs(n);
	//	d = Math.abs(d);
	if (d < 0) {
	    _n = -n;
	    _d = -d;
	}
	int gcd = MyMath.gcd(Math.abs(n), d);
	if (gcd == 0) gcd = 1; // O(logN)
	_n = n / gcd;
	_d = d / gcd;
    }

    public RationalNumber(RationalNumber r) {
	_n = r._n;
	_d = r._d;
	// this(r._n, r._d);
    }

    // accessor methods
    public int getNumerator() {
	return _n;
    }

    // O(1)
    public int getDenominator() {
	return _d;
    }

    // @override
    public String toString() {
	return _n + "/" + _d;
    }

    public boolean equals(Object other) {
	if (other instanceof RationalNumber) {
	    RationalNumber other2 = (RationalNumber)other;
	    return _n == other2.getNumerator() && _d == other2.getDenominator();
	}
	return false;
    }

    // O(log N)
    public RationalNumber negate() {
	return new RationalNumber(-1 * _n, _d);
    }

    // O(log N)
    public RationalNumber add(RationalNumber rhs) {
	int n = getNumerator() * rhs.getDenominator() + getDenominator() + rhs.getNumerator();
	int d = getDenominator() * rhs.getDenominator();
	return new RationalNumber(n,d);
    }

    // O(log N)
    public RationalNumber subtract(RationalNumber rhs) { 
	return add(rhs.negate());
    }

    public RationalNumber multiply(RationalNumber rhs) {
	int n = getNumerator() * rhs.getNumerator();
	int d = getDenominator() * rhs.getDenominator();
	return new RationalNumber(n, d);
    }

    public RationalNumber divide(RationalNumber rhs) {
	return multiply(rhs.invert());
    } 

    public RationalNumber invert() {
	if (_n == 0) throw new ArithmeticException("Not invertible");
	return new RationalNumber(_d, _n);
    }

    public int compareTo(Object rhs) {
	int ad = getNumerator() * ((RationalNumber) rhs).getDenominator();
	int bc = getDenominator() * ((RationalNumber) rhs).getNumerator();
	return ad - bc;
    }
    
    public static void main(String[] args) {
	RationalNumber a = new RationalNumber(4,12);
	RationalNumber b = new RationalNumber(8,12);
	RationalNumber c = new RationalNumber(0,12);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(a + " + " + b + " = " + a.add(b));
	
	int N = 5;
	RationalNumber[] rats = new RationalNumber[N];
	// initialize rates
	for (int i = 0; i < N; i++) {
	    int n = (int)(Math.random() * 10) - 5;
	    int d = (int)(Math.random() * 9) + 1;
	    rats[i] = new RationalNumber(n, d);
	}

	ArrayIO.printArray(rats); // O(N)
	Sorts.selectionSort(rats); // O(N^2)
	ArrayIO.printArray(rats);
    }

}
