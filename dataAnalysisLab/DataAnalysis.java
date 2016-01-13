public class DataAnalysis {

        // precondition: 0 < k < data.length
	 public static boolean isMode(int[] data, int k){
	     return data[k] > data[k+1] && data[k] > data[k-1];
	 }

    public static int modeIndex(int[] data) {
// precondition:  data is unimodal and data.length ≥ 3
	int ans = -1;
	for (int i = 0; i < data.length; i++) 
	    if (isMode(data, i)) ans = i;
    }
}
