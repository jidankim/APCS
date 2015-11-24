public class PigLatinEncrypt{
    

    // precondition: w != null and w is not empty
    //               w contains only lwoer case letteres
    // postcondition: returns true if w beigns with either a, e, i, o, u.
    //                returns false otherwise
    public static boolean beginsWithVowel(String w){
	String vowels = "aeiou";
	return beginsWithVowel(w, vowels);
    }

    // precondition: w != null and w is not empty
    //
    public static boolean beginsWithVowel(String w, String vowels){
    	if (vowels == null) return false;
	return vowels.indexOf(w.substring(0,1)) != -1;
    }

    // pre: w != null and w does not begin with a vowel
    // post: returns the index position of the first vowel.
    //       assume the vowels are a, e, i, o, u, or y.
    public static int firstVowelPos(String w){
	String vowels = "aeiouy";
	for (int i = 1; i < w.length(); i++){
		if (vowels.indexOf(w.substring(i,i+1)) != -1) return i;
	}
	return -1;
    }

    // precondition: w may be null ir nay be an empty string
    //               w contains only lower case letters
    public static String pigLatin(String w){
	if (w == null || w.length() == 0) return ""; // short-circuit eval
	if (beginsWithVowel(w)) return w += "ay";
	else{
		int pos = firstVowelPos(w);
		if (pos != -1) w = w.substring(pos) + w.substring(0, pos) + "ay";
		else w += "ay";
	}
	return w;
    }
    
    public static void main(String[] args){
	
	while(!StdIn.isEmpty()){
	    String word = StdIn.readString();
	//  word = null;
	    System.out.println(pigLatin(word));
	}
	System.out.println();
    }

}
