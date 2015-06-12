public class Reverser {
	public static char[] result;
	public String reversedInput = "";

	public void fillFigure(String string) {
		result = new char[string.length()];
		char[] temp = string.toCharArray();
		for (int i = 0; i < temp.length; i++) {
			if (!Character.isAlphabetic(temp[i]))
				result[i] = temp[i];
		}
	}

	public int findPosition(char[] in) {
		int position = 0;
		boolean flag = false;
		while (!flag && position < in.length - 1) {
			if (in[position] == '\u0000')
				flag = true;
			else
				position++;
		}
		return position;
	}

	public void fillLetter(char[] in) {
		int position;
		for (int i = result.length - 1; i >= 0; i--) {
			if (Character.isAlphabetic(in[i])) {
				position = findPosition(result);
				result[position] = in[i];
			}
		}
	}

	public String getReversed(String input) {
		String[] inputArray = input.split(" ");
		for (int i = 0; i < inputArray.length; i++) {
			this.fillFigure(inputArray[i]);
			char[] d = inputArray[i].toCharArray();
			this.fillLetter(d);
			for (int j = 0; j < result.length; j++) {
				reversedInput += (result[j]);
			}
			reversedInput += (" ");
		}
		return reversedInput;
	}

}
