public class RationalNumber{

    private int _n, _d;

    // constructor
    // assume d != 0
    public RationalNumber(int n, int d) {
	if (d == 0) throw new ArithmeticException("denominator can't be 0");
	boolean isPos = n * d >= 0;
	if (isPos) n = Math.abs(n);
        else n = -1 * Math.abs(n);
	d = Math.abs(d);
	_n = n;
	_d = d;
    }

    public RationalNumber(RationalNumber r) {
	_n = r._n;
	_d = r._d;
    }

    // @override
    public String toString() {
	return _n + "/" + _d;
    }

    public RationalNumber negate() {
	return new RationalNumber(-1 * _n, _d);
    }

    public static void main(String[] args) {
	RationalNumber a = new RationalNumber(3,9);
        RationalNumber b = new RationalNumber(a);
	System.out.println(a);  // 3/9
	System.out.println(b); // 3/9
	b = a.negate();
	System.out.println(a);  // 3/9
	System.out.println(b); // -3/9	RationalNumber a = new RationalNumber(3,9);
    }

}
