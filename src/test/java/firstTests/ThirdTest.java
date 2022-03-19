package firstTests;

import JavaSimple.ForConstructor;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{

    String firstParam = "Who is guilty?";
    String secondParam = "NoBody";

    @Parameters({"I don't know", "I know"})
    @Test
    public void  startTest(String firstParam, String secondParam){
        System.out.println("First Parameter " + firstParam);
        System.out.println("Second Parameter " + secondParam);
        System.out.println("But actually " + this.firstParam + " " + this.secondParam);

        this.firstParam = firstParam;
        this.secondParam = secondParam;
    }
    @Test(priority = 2)
    public void  startTest(){
        System.out.println("First Parameter " + firstParam);
        System.out.println("Second Parameter " + secondParam);
        System.out.println("But actually " + this.firstParam + " " + this.secondParam);

    }
    @Test(priority = 1)
    public void  startTestV2() {
        ForConstructor con = new ForConstructor();
        System.out.println("First Parameter " + firstParam);
        System.out.println("Second Parameter " + secondParam);
        System.out.println("But actually " + con.constParam1 + " " + con.constParam2);
    }
}
