public class Stats{

    public static double mean(int[] a){
	int N = a.length;
	int sum = 0;

	for (int i = 0; i < N; i++) {
	    sum += a[i];
	}
	return sum*1.0/N;
    }

    public static double variance(int[] a){
	double mean = mean(a);
	int N = a.length;
	double sos = 0;
	for (int i = 0; i < N; i++) {
	    sos += (mean - a[i]) * (mean - a[i]);
	}
	return sos / (N - 1);
    }

    public static double stdDeviation(int[] a){
	return Math.sqrt(variance(a));
    }

}
