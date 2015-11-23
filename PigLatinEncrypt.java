public class PigLatinEncrypt{
    

    // precondition: w != null and w is not empty
    //               w contains only lwoer case letteres
    // postcondition: returns true if w beigns with either a, e, i, o, u.
    //                returns false otherwise
    public static boolean beginsWithVowel(String w){

    }

    // precondition: w may be null ir nay be an empty string
    //               w contains only lower case letters
    public static String pigLatin(String w){
	if (w == null || w.length() == 0) return ""; // short-circuit eval
	if (beginsWithVowel(w)) return w += "ay";
	return w;
    }
    
    public static void main(String[] args){
	
	while(!StdIn.isEmpty()){
	    String word = StdIn.readString();
	    word = null;
	    System.out.println(pigLatin(word));
	}
	System.out.println();
    }

}
