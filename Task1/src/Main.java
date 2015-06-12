import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Misha on 12.06.15.
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String inputString = reader.readLine();

		Reverser instance = new Reverser();
		String reversed = instance.getReversed(inputString);
		System.out.println(reversed);

	}
}
