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

    public static void bogoSort(Comparable [] x){
	while (!isSorted(x)) shuffle(x);
    }

}
