public class NumToString{
    
    // pre-condition: 0 <= n < 10
    // post-condition: 0 -> "zero", ... , 9 -> "nine"
    public static String digitToEng(int n) {
	String[] digit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	return digit[n];
    }
    
    public static String twoDigitToEng(int n) {
	String[] teen = new String[10];
	twoDigit[0] = "ten";
	twoDigit[1] = "eleven";
	twoDigit[2] = "twelve";
	twoDigit[3] = "thirteen";
	for (int i = 4; i < 10; i++) {
	    twoDigit[i] = digitToEng(i) + "teen";
	}
	String[] twoDigit = {"twenty". "thirty", "fourty";
    }
    
    // pre-condition: 0 <= n < 1,000,000
    // post-condition: 0 -> "zero", ..., 25 -> "twenty-five", ..., 125 -> "one hundred twenty-five"
    public static String numToEng(int n) {
	String[] suffix = {"million", "thousand", "hundred"};
	if (n < 10) return digitToEng(n);
	else if (n < 100) return twoDigitToEng(n);
	else return digitToEng(Integer.parseInt(Integer.toString(n).substring(0, 1))) + numToEng(Integer.parseInt(Integer.toString(n).substring(1)));
    }

    public static void main(String[] args){

    }

}
