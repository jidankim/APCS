public class Sorts{

    public static void shuffle(Object[] x){
	int N = x.length;
	for (int i = 0; i < N; i++){
	    int r = (int)(Math.random()*(N-i)) + i;
	    Object temp = x[i];
	    x[i] = x[r];
	    x[r] = temp;
	}
    }

    // precondition:  x != null
    // postcondition: returns true if x is empty or is sorted
    //                in ascending order; false otherwise.
    // isSorted({1,2,2,3,4}) -> true
    // isSorted({"a","c","b"}) -> false
    // isSorted({0.2, 1.4, 1.0}) -> false
    public static boolean isSorted(Comparable [] x){
	for (int i = 0; i < x.length - 1; i++){
	    if (x[i].compareTo(x[i+1]) > 0) 
		return false;
	}
	return true;
    }

    // precondition : x != null
    // postcondtion : sorts the array in ascending order by
    //                shuffling the array until it is sorted.
    //               bogoSort({1,5,3}) -> {1,3,5}

    public static int bogoSort(Comparable [] x){
	int count = 0;
	while (!isSorted(x)) {
		shuffle(x);
		count++;
	}
	return count;
    }

    public static void bubbleSort(Comparable[] x){
	int N = x.length;
	for (int i = 0; i < N - 1; i++) {
	    for (int j = 0; j < N - i - 1; j++) {
		if (x[j].compareTo(x[j+1]) > 0) {
 		    Comparable temp = x[j+1];
		    x[j+1] = x[j];
		    x[j] = temp;
		}
	    }
	}
    }

    public static void bubbleSortModified(Comparable[] x){
	int N = x.length;
	for (int i = 0; i < N - 1; i++) {
	    boolean sorted = true;
	    for (int j = 0; j < N - i - 1; j++) {
		if (x[j].compareTo(x[j+1]) > 0) {
 		    Comparable temp = x[j+1];
		    x[j+1] = x[j];
		    x[j] = temp;
		    sorted = false;
		}
	    }
	    if (sorted) break;
	}	
    }

    public static void selectionSort(Comparable[] x){
	int N = x.length;
	for (int pass = 0; pass < N - 1; pass++){
	    int curMin = pass;
	    for (int j = pass + 1; j < N; j++){
		if (x[curMin].compareTo(x[j]) > 0) curMin = j;
	    }
	    Comparable temp = x[pass];
	    x[pass] = x[curMin];
	    x[curMin] = temp;
	}
    }

    public static void insertionSort(Comparable[] x){
	int N = x.length;
	for (int i = 0; i < N; i++){
	    for (int j = i; j > 0; j--){
		if (x[j].compareTo(x[j-1]) < 0) {
		    Comparable temp = x[j];
		    x[j] = x[j-1];
		    x[j-1] = temp;
		}
		else break;
	    }
	}
    }

}
