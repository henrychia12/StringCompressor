
public class App {

	public static void main(String[] args) {
		System.out.println(compressString("aaabbcaaa"));
		System.out.println(compressString("aaggtdhhhhtgdfdfbdfbfgbfgbt"));

	}

	public static String compressString(String str) {
		if (str.length() == 0) {
			return null;
		}
		str = str + " ";
		String output = "";
		char[] letters = str.toCharArray();
		int count = 1;

		for (int i = 0; i < letters.length-1; i++) {
			if (letters[i] == letters[i + 1]) {
				count++;
			} else {
				output = output + letters[i] + count;
				count = 1;
			}

		}
		return output;
	}
}