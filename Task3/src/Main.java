import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Misha on 17.06.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String division=reader.readLine();
        String divider=reader.readLine();
        Division instance = new Division();
        instance.printDivision(division, Integer.valueOf(divider));
    }
}
