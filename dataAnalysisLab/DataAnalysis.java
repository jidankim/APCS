public class DataAnalysis {

        // precondition: 0 < k < data.length
	 public static boolean isMode(int[] data, int k){
	     return data[k] > data[k+1] && data[k] > data[k-1];
	 }

    public static int modeIndex(int[] data) {
// precondition:  data is unimodal and data.length ≥ 3
	int ans = -1;
	for (int i = 0; i < data.length - 1; i++) 
	    if (isMode(data, i)) ans = i;
	return ans;
    }

    public static void printHistogram(int[] data, int longestBar, String barChar) {
// precondition:  data is unimodal and data.length ≥ 3;
//                data[k] ≥ 0 for 0 ≤ k < data.length
	for (int i = 0; i < data.length; i++) {
	    int barLength = data[i] * longestBar / data[modeIndex(data)];
	    System.out.print(barLength + " ");
	    for (int j = 0; j < barLength; j++)
		System.out.print(barChar);
	    System.out.println();
	}
    }

    public static void main(String[] args) {
	int[] data = {3,5,9,10,12,11,9,4};
	System.out.println("mode index: " + modeIndex(data));
	printHistogram(data, 20, "X");
    }
}
