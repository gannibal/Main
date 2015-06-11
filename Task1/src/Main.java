import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static StringBuilder sb = new StringBuilder("");
	static StringBuilder result = new StringBuilder("");

	static StringBuilder getReversed(char[] arg) {
		sb = new StringBuilder("");
		for (int i = 0; i < arg.length / 2; i++) {
			if (Character.isAlphabetic(arg[i])
					&& Character.isAlphabetic(arg[arg.length - i - 1])) {
				char temp = arg[i];
				arg[i] = arg[arg.length - i - 1];
				arg[arg.length - i - 1] = temp;
			}
		}
		for (int i = 0; i < arg.length; i++) {
			sb.append(arg[i]);
		}
		return sb;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String inputString = reader.readLine();
		String[] inputArray = inputString.split(" ");

		for (int i = 0; i < inputArray.length; i++) {

			char[] currentWord = inputArray[i].toCharArray();

			result.append(getReversed(currentWord));
			result.append(" ");
		}
		System.out.println(result);
	}

}
