public class NumToString{
    
    // pre-condition: 0 <= n < 10
    // post-condition: 0 -> "zero", ... , 9 -> "nine"
    public static String digitToEng(int n) {
	String[] digit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	return digit[n];
    }
    
    public static String twoDigitToEng(int n) {
	String[] teen = new String[10];
	teen[0] = "ten";
	teen[1] = "eleven";
	teen[2] = "twelve";
	teen[3] = "thirteen";
	for (int i = 4; i < 10; i++) {
	    teen[i] = digitToEng(i) + "teen";
	}
	String[] twoDigit = {"twenty". "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	if (n/10 == 0){
	    return oneDigitToEng(n);
	} else if (n/10 == 1){ 
	    return teen[n%10];
	} else {
	    return twoDigit[n/10 - 2] + digitToEng[n%10];
	}
    }

    public static String threeDigitToEng(int n) {
	if (n/100 > 0) {
	    return n/100 + "hundred" + twoDigitToEng(n%100);
	} else {
	    return twoDigitToEng(n);
	}
    }
    
    // pre-condition: 0 <= n < 1,000,000
    // post-condition: 0 -> "zero", ..., 25 -> "twenty-five", ..., 125 -> "one hundred twenty-five"
    public static String numToEng(int n) {
	if (n < 1000) {
	    return threeDigitToEng(n);
	} else return threeDigitToEng(Integer.parseInt(Integer.toString(n).substring(0, 3))) + "thousand" + threeDigitToEng(Integer.parseInt(Integer.toString(n).substring(3)));
    }

    public static void main(String[] args){
	System.out.print(numToEng(87));
    }

}
