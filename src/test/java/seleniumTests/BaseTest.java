package seleniumTests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.PropertyLoader;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    WebDriver driver;

    public String setStendKey = System.setProperty("StendKey", "stendkey1");
    public String stendKey = System.getProperty("StendKey");
    public String stendUrl = PropertyLoader.loadProperty(stendKey);



    @BeforeTest
    public void beforeT(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        //DesiredCapabilities dc = DesiredCapabilities.chrome();
        //dc.setCapability(ChromeOptions.CAPABILITY, op);
        //driver = new ChromeDriver();

        URL hub = null;

        try {
            hub = new URL("http://localhost:4444/wd/hub");
        } catch (MalformedURLException e){
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(hub, op);

    }




    @AfterTest
    public void afterTest(){
        driver.quit();
        if(driver != null){
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public byte[] getScreenShot(){

        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
