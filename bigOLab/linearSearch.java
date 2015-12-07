public class linearSearch{

    //Test cases:
    //x = {"cat","hat","mat"};
    //linearSearch(x,"hat") -> 1
    //linearSearch(x,"Hat") -> -1

// precondition: x != null
// postconditon: returns the index position of the first occurrence of key
//               returns -1 if not found
     public static int linearSearch(Object[] x, Object key){
	 int N = x.length;
	 for (int i = 0; i < N; i++) {
	     if (x[i].equals(key)) return i;
	 }
	 return -1;
     }
}