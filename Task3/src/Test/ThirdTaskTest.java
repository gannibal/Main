package Test;
 

import mentat.Period;
import mentat.Division;
import mentat.Main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
public class ThirdTaskTest {

    @Test
    public void testDivideAfterDot(){
        ArrayList<String> expected=new ArrayList<>();

        for(int i=0;i<15;i++){
            if(i%2==0)
                expected.add("4");
            else
                expected.add("5");
        }

        Assert.assertEquals(expected, Period.divideAfterDot((17 % 11), 11));

    }

    @Test
    public void testDivideAfterDotMethodWrongExpectation(){
        ArrayList<String> expected=new ArrayList<>();

        for(int i=0;i<15;i++){
            if(i%2==0)
                expected.add("2");
            else
                expected.add("3");
        }
        Period instance=new Period();
        Assert.assertNotEquals(expected, instance.divideAfterDot((17 % 11), 11));
    }

    @Test
    public void testIntegerPartOfResult(){
        Division instance=new Division();
        instance.printDivision("17",11);


        String expected="01";
        Assert.assertEquals(expected, instance.divisionResult);
    }

    @Test
    public void IntegerPartWrongExpectation(){
        Division instance=new Division();
        instance.printDivision("17",11);
        String expected="5";
        Assert.assertNotEquals(expected, instance.divisionResult);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero(){
        int testDivider=Integer.valueOf(Main.divider="0");
        int testDivision=Integer.valueOf(Main.division="5");
        int n=testDivision/testDivider;
    }


    @Test
    public void testFinalResult(){
        String actual=Division.stringsToOutput.get(0).substring(Division.stringsToOutput.get(0).length()-7,
                Division.stringsToOutput.get(0).length());
        String expected="01.(54)";
        Assert.assertEquals(expected, actual);
    }

}