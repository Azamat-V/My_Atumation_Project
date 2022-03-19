package firstTests;

import org.aspectj.lang.annotation.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest

    public void beforeT(){
    System.out.println("The acting before test");
    }

    @AfterTest

    public void afterT(){
        System.out.println("The acting after test");
    }

    @BeforeMethod

    public void beforeM(){
        System.out.println("The acting before method");
    }

    @AfterMethod

    public void afterM(){
        System.out.println("The acting before method");
    }



}
