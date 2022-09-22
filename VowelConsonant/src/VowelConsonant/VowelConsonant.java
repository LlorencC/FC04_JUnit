package VowelConsonant;

public class VowelConsonant {
	public String check(String character) {
		String v="vowel";
		String c="consonant";
		if(character=="a"||character=="e"||character=="i"||character=="o"||character=="u") {
			return v;
		}
		else {
			return c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
