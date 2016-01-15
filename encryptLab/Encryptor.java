public class Encryptor {
       
   // private instance variables
   private String[][] _myMat;       
   
   final private static String LETTERS_DIGITS = "STUVWXYZ0123456789ABCDEFGHIJKLMNOPQR";

   // fills the matrix with the 26 letters of the alphabet       
   // and the 10 digits ’ 0 ’ through ’ 9 ’
   public Encryptor(){
       _myMat = new String[6][6];
       for (int i = 0; i < 6; i++)
	   for (int j = 0; j < 6; j++)
	       _myMat[i][j] = LETTERS_DIGITS.substring(6*i + j, 6*i + j + 1);
   }

   // returns an encrypted form of the word
   public String encryptWord(String word){
       String ans = "";
       for (int i = 0; i < word.length(); i+=2) {
	   ans += encryptTwo(word.substring(i,i+2));
       }
       return ans;
   }

   // returns an encrypted form of the pair
   public String encryptTwo(String pair){
       Point f = getCoordinate(pair.substring(0,1));
       Point s = getCoordinate(pair.substring(1,2));
       if (f.getRow() == s.getRow() || f.getCol() == s.getCol())
	   return pair.reverse();
       else {
	   String fe = _myMat[f.getRow()][s.getCol()];
	   String se = _myMat[s.getRow()][f.getCol()];
	   return fe + se;
       }
   }

   // returns the coordinates of ch in the 2-dimensional array
   public Point getCoordinates(String ch){
       int row = -1;
       int col = -1;
       for (int i = 0; i < 6; i++){
	   for (int j = 0; j < 6; j++){
	       if (_myMat[i][j].equals(ch)){ 
		   row = i;
		   col = j;
		   return new Point(row,col);
	       }
	   }
       }
   }

    public String toString(){
	String ans = "";
	for (int i = 0; i < _myMat.length; i++){
	    for (int j = 0; j < _myMat[i].length; j++)
		ans += _myMat[i][j] + " ";
	    ans += "\n";
	}
	return ans;
    }

 public static void main(String [] args){
	Encryptor key = new Encryptor();
	System.out.println(key);
	
	Point p1 = key.getCoordinates("P");
	Point p2 = key.getCoordinates("8");
	Point p3 = key.getCoordinates("M");
	System.out.println("coordinates of P: " + p1);
	System.out.println("coordinates of 8: " + p2);
	System.out.println("coordinates of M: " + p3);
	//  Letters: BR NE ET RE TH PR GG 
	//Encrypted: FN QB BW QF HT RP GG     
	String [] pairs = {"BR","NE", "ET", "RE", "TH", "PR", "GG"};
	for (int i = 0; i < pairs.length; i++)
	    System.out.println(pairs[i] + ": " + key.encryptTwo(pairs[i]));

	System.out.println(key.encryptWord("COMPUTER"));
	System.out.println(key.encryptWord("SCIENCE"));
	System.out.println(key.encryptWord("STUDENTS"));
	
    }

}
