public class removeDuplicates{

    public static String removeDuplicates(String w) {
	String ans = "";
	int N = w.length();
	for (int i = 0; i < N; i++) {
	    String curr = w.substring(i, i+1);
	    if (ans.indexOf(curr) == -1) ans += curr;
	}
	return ans;
    }

    public static int binarySeaerch(Comparable[] x, Comparable key) {
	return binarySearchR(0, x.length, x, key);
    }

    private static int binarySearchR(int low, int upper, Comparable[] x, Comparable key) {
	int mid = (upper - low)/2;
	if (key.compareTo(x[mid]) == 0) return mid;
	else if (key.compareTo(x[mid]) > 0) return binarySearchR(mid, upper, x, key);
	return binarySearchR(low, mid, x, key);
    }


    public static void main(String[] args) {
        
    }

}
