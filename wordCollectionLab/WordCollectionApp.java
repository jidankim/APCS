public class WordCollectionApp {

    public static int occurrences(WordCollection C, String word) {
	int ans = 0;
	for (int i = 0; i < C.size(); i++) {
	    if (C.findKth(i).equals(word)) ans++;
	    else if (C.findKth(i).compareTo(word) > 0) break;
	}
	return ans;
    }

    // postcondition: if word is present in C, all but once occurrence
    // is removed; otherwise, C is unchanged
    public static void removeDuplicates(WordCollection C, String word) {
	while (occurrences(C.word) > 1)
	    C.remove(word);
    }
    
    public static String mostCommon(WordCollection C) {
	int temp = 0;
	String ans = "";
	for (int i = 0; i < C.size(); i++) {
	    int current = occurrences(C,C.findKth(i));
	    if (current > temp) {
		temp = current;
		ans = findKth(i);
	    }
	}
	return ans;
    }
    
    public static void main(String[] args) {
	String[] words = {"cat","zebra","dog","cat","pig","cat"};
	WordCollection wc = new WordCollection(words);
	System.out.println(wc);
	/*
	  System.out.println("occurrences of cat: "+ occurrences(wc,"cat"));
	  removeDuplicates(wc,"cat");
	  System.out.println(mostCommon(wc));
	*/
    }
}
