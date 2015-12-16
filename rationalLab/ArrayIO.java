public class ArrayIO{

    // precondition: 0 < n
    // postcondition: returns an array of integers
    //                {0,1,2,...,n-2,n-1}
    //                intArray(5) -> {0,1,2,3,4,5}
    public static Integer[] intArray(int n){
	Integer[] ret = new Integer[n];
	for (int i = 0; i < n; i++) {
	    ret[i] = i;
	}
	return ret;
    }

    public static void printArray(Object[] x){
	for (int i = 0; i < x.length; i++)
	    System.out.print(x[i] + " ");
       System.out.println();
    }

    public static void printArray(Object[][] x){
	for (int i = 0; i < x.length; i++)
	    printArray(x[i]);
    }

}
