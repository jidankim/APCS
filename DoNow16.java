import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class DoNow16 {

    // pre condition: list is empty, n > 0
    public static void initialize(List<Integer> list, int n) {
	for (int i = 0; i < n; i++)
	    list.add(i);
    }

    public static void addDoubles(List<Integer> list) {
	int N = list.size();
	for (int i = 0; i < N; i++) //O(N)
	    list.add(2*i+1, 2*list.get(2*i)); //O(N)
	/*
	  for (int i = 0; i < list.size(); i+=2)
	  list.add(i+1, 2*list.get(i));
	 */
    }

    public static void removeEvens(List<Integer> list) {
	Iterator<Integer> iter = list.iterator();
	while (iter.hasNext()) {
	    Integer n = iter.next();
	    if (n%2 == 0) 
		iter.remove();
	}
    }
    
    public static void main(String[] args) {
	List<Integer> L = new ArrayList<Integer>();
	System.out.println(L); // []
	initialize(L, 5); // [0,1,2,3,4]
	System.out.println(L);
	addDoubles(L); // [0,0,1,2,2,4,3,6,4,8]
	System.out.println(L);
	removeEvens(L); // [1,3]
	System.out.println(L);
    }

}
