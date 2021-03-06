package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchResultPageObject extends Base {

    public SearchResultPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class = 'main']//a[contains(.,'Картинки')]")
    private WebElement imagesTab;

    /**
     * The check for the button "Images"
     * @return
     */

    public boolean isImagesTabButtonIsExist(){
        return waitVisibilityElement(imagesTab);
    }
}
