public class SortTester{

    // pre: n >= 0
    // post: factorial(0) = factorial(1) = 1
    public static int factorial(int a){
	if (a < 2) return 1;
	return a * factorial(a-1);
    }

    public static void main(String[] args){
	int N = Integer.parseInt(args[0]);
	int M = Integer.parseInt(args[1]);
	int count = 0;

	for (int i = 0; i < M; i++) {
		Integer[] a = ArrayIO.intArray(N);
		Sorts.shuffle(a);
		if (Sorts.isSorted(a)) count++;
	}

	System.out.println("Probability of array of size N is sorted after 1 shuffle is " + count*1.0/M);

	String[] names = {"abe", "mary", "betty", "michael"};
	Integer[] ages = {3, 19, 4, 11};
	Double[] heights = {0.2, 3.0, 1.2, 1.1};

	//ArrayIO.printArray(names);
	//ArrayIO.printArray(ages);
	//ArrayIO.printArray(heights);

	//Sorts.shuffle(ages);

	Double[][] test = { {1.2, 1.3, 1.4}, {1.5, 1.6}, {1.7}};

	//ArrayIO.printArray(test);

	Integer x = new Integer(5);
	Double y = 2.5;

	//System.out.println(x > y);
	//System.out.println("ape" < "bat");
	
	Sorts.bubbleSort(heights);
	ArrayIO.printArray(heights);
    }

}
