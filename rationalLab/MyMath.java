public class MyMath{

    public static int abs(int x){
	if (x < 0) return -x;
        return x;
	// System.out.println("hi"); Dead Code - unreachable
    }

    // overload abs
    public static double abs(double x){
	if (x < 0) return -x;
	return x;
    }

    public static double sqrt(double x){
	if (x < 0) return Double.NaN;
	double guess = 1.0;
	while (abs (guess - x/guess) > 1e-15*guess)
	    guess = (guess + x / guess) / 2.0;
	return guess;
	
    }

    public static boolean isOdd(int n){
	return n % 2 == 1;
    }

    public static boolean isEven(int n){
	return !isOdd(n);
    }

    public static boolean isPrimte(int n){
	if (n < 2) return false;
	for (int d = 2; d <= n/d; d=+)
	    if (n % d == 0) return false;
	return true;
    }

    // pre: n >= 1
    // post: 2^log(n) <= n
    public static int log(int n) {
	int e = 0;
	while (Math.pow(2, e) <= n) {
	    e++;
	}
	return e-1;

	/*
	  int ans = 0;
	  while (n != 1) {
	      ans++;
	      n/=2;
	  }
	  return ans;
	 */
    }

    // pre: a and ba are both positive integers
    public static int gcd(int a, int b) {
	if (b == 0) return a;
	return gcd(b, a%b);
    }

    public static void main(String [] args){
	int N = args.length;
	double [] a = new double[N];

	for (int i = 0; i < N;  i++)
	    a[i] = Double.parseDouble(args[i]);

	//test the functions (static methods)
	for (int i  = 0 ; i < N; i++){
	    double x = sqrt( a[i]);
	    System.out.println("sqrt(" + a[i] + ") = " + x);
	}

    }

}
