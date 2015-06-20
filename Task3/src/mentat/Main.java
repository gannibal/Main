package mentat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Misha on 17.06.2015.
 */
public class Main {
    public static String division="";
    public static String divider="";
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            division = reader.readLine();
            divider= reader.readLine();
        try{
            int toCheck=Integer.valueOf(division);
            int toCheck1=Integer.valueOf(divider);
            int check=toCheck/toCheck1;
        }catch (Exception e){
            System.out.println("can`t divide by zero");
        }
        Division instance = new Division();
        instance.printDivision(division, Integer.valueOf(divider));
    }
}
