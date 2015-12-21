public class BarCode implements Comparable {

	//instance variables
	private String _zip;
	private int _checkDigit;

	private final static String[] _codes =  {"||:::",":::||","::|:|","::||:",":|::|",
                                      ":|:|:",":||::","|:::|","|::|:","|:|::"};

	//constructors
	//precondition: zip.length() = 5 and zip contains only digits.
	//post conditions: throws a runtime exception zip is not the correct
//			   length or zip contains a non digit
//			   _zip and _checkDigit are intialized
	public BarCode(String zip) {
		if (zip.length() != 5)
		    throw new IllegalArgumentException("Needs exactly 5 digits");
		_zip = zip;
		_checkDigit = checkSum() % 10;
	}

	//postcondition: Creats a copy of a bar code.
	public BarCode(BarCode x) {
		this(x._zip);
	}

	//post: computes and returns the check sum for _zip
	private int checkSum() {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += Integer.parseInt(_zip.substring(i, i+1));
		}
		return sum;	
	}

	//post condition: format zip + check digit + barcode
	public String toString() {
		String ans = "";
		ans += "|";
		for (int i = 0; i < _zip.length(); i++) {
			ans += codes[Integer.parseInt(_zip.substring(i, i+1))];
		}
		ans += _checkDigit;
		ans += "|";
		return ans;
	}

	public boolean equals(Object other) {
		return this == other || (other instanceof BarCode &&
		        		_zip.equals((BarCode)other)._zip;
	}
}
