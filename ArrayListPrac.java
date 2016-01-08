import java.util.ArrayList;

public class ArrayListPrac {
    /*
    // version 1: does not use generics: unsafe
    public static void populate(ArrayList L) {
	L.add(5);
	L.add(10);
	L.add(1);
	L.add(0);
	// L.add("abe"); still runs
    }
    
    
    //version 2: does use generics: safe
    public static void populate(ArrayList<Comparable> L) {
	L.add(5);
	L.add(10);
	L.add(1);
	L.add(0);
	// compiler catches it because not all comparables are integers
    }
    */

    // version 3
    public static void populate(ArrayList<Integer> L) {
	L.add(5);
	L.add(10);
	L.add(1);
	L.add(0);
    }
    /*
    // version 1: unsafe
    public static Comparable max(ArrayList L) {
	Comparable sup = (Comparable) L.get(0);
	for (int i = 1; i < L.size(); i++) {
	    Comparable temp = (Comparable) L.get(i);
	    if (sup.compareTo(temp) < 0) sup = temp;
	}
	return sup;
    }*/

    // version 2: safe
    public static Integer max2(ArrayList<Integer> L) {
	Integer sup = L.get(0);
	for (int i = 1; i < L.size(); i++) 
	    if(sup < L.get(i)) sup = L.get(i);
	return sup;
    }

    public static void reverse(ArrayList<Integer> L) {
	for (int i = 0; i < L.size()/2; i++)
	    L.set(L.size() - i - 1, L.set(i, L.get(L.size() - i - 1)));
    }

    public static List<Integer> merge(List<Integer> x, List<Integer> y) {
	List<Integer> ans = new ArrayList<Integer>();
	int i = 0;
	int j = 0;
	while (i < x.size() && j < y.size()) {
	    if (x.get(i) < y.get(j)) {
		ans.add(x.get(i));
		i++
	    } else {
		ans.add(y.get(j));
		j++;
	    }
	}
	while (i < x.size()) ans.add(x.get(i++));
	while (j < y.size()) ans.add(y.get(j++));
	return ans;
    }

    public static void main(String[] args) {
	ArrayList<Integer> L = new ArrayList<Integer>();
	populate(L);
	System.out.println(L);
	System.out.println(max2(L));
	reverse(L);
	System.out.println(L);
    }

}
