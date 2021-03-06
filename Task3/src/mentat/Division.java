package mentat;
import java.util.ArrayList;

/**
 * Created by Misha on 17.06.2015.
 */
public class Division {
        public static String divisionResult="";
        static int divisionFigureIndex = 0;
        static int rest = 0;
        static int currentDivision = 0;
        static int currentResult=0;
        public static ArrayList<String> stringsToOutput = new ArrayList<String>();

        static ArrayList<String> divideInteger(int[] division, int divider) {

            int [] divisionNumbers=division;
            int multiply = 0;

            if (divisionFigureIndex < divisionNumbers.length) {
                if (rest > 0) {
                    currentDivision = Integer.valueOf(String.valueOf(rest) + divisionNumbers[divisionFigureIndex]);
                }
                else
                    currentDivision=divisionNumbers[divisionFigureIndex];
                currentResult=currentDivision/divider;
                multiply = currentResult * divider;
                rest = currentDivision % divider;
            }

            ArrayList<String> resultParameters = new ArrayList<String>();
            if(currentResult>0) {
                resultParameters.add(String.valueOf(currentResult));
                if(divisionFigureIndex<divisionNumbers.length-1) {
                    resultParameters.add((String.valueOf(rest)) + divisionNumbers[divisionFigureIndex + 1]);
                    resultParameters.add(String.valueOf(multiply));
                }
                else{
                    resultParameters.add((String.valueOf(rest)) + "0");
                    resultParameters.add(String.valueOf(multiply));
                }
            }
            else if(divisionFigureIndex<divisionNumbers.length-1){
                resultParameters.add(String.valueOf(currentResult));
                resultParameters.add((String.valueOf(rest)) + divisionNumbers[divisionFigureIndex + 1]);
            }
            else{
                resultParameters.add(String.valueOf(currentResult));
                resultParameters.add((String.valueOf(divisionNumbers[divisionFigureIndex])+"0"));
            }
            divisionFigureIndex++;
            return resultParameters;
        }

        public static void printDivision(String division, int divider){

            Period instance=new Period();
            ArrayList<String> after;
            after= Period.getSimilar(Integer.valueOf(division) % divider, divider);
            String period=instance.findPeriod(after);

            String out = " " + division + " |" + divider;
            System.out.println(out);
            System.out.println("-------------");
            //String divisionResult = "";
            int [] nums=new int[division.length()];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(String.valueOf(division.charAt(i)));
            }

            ArrayList<String> res;
            while (divisionFigureIndex < division.length()) {

                res = divideInteger(nums, divider);
                divisionResult += res.get(0);

                if(Integer.valueOf(res.get(0))>0) {
                stringsToOutput.add("-"+res.get(2));

                    stringsToOutput.add("--------");
                    stringsToOutput.add( res.get(1));

                }

            }
            if(stringsToOutput.size()>0) {
                String initialSpace = stringsToOutput.get(0);
                stringsToOutput.remove(0);
                stringsToOutput.add(0, initialSpace + "   |" + String.valueOf(divisionResult) + ".(" + period + ")");
            }else{
                stringsToOutput.add(0,  "   |" + String.valueOf(divisionResult) + ".(" + period + ")");
            }

            String space = " ";
            for (int i = 0; i < stringsToOutput.size(); i++) {
                System.out.println(space + stringsToOutput.get(i));
                if (i % 3 == 0) {
                    space += " ";
                }
            }

        }
    }



