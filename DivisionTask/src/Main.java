
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Misha on 13.06.15.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("¬ведите делимое");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String division=reader.readLine();
        System.out.println("¬ведите делитель");
        String secondParam=reader.readLine();
        int divider=Integer.valueOf(secondParam);


        Division instance=new Division();
        instance.printDivision(division, divider);


    }
}

