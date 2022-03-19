package pageObject.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPageObject extends Base {

    public InitPageObject(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = ".//div//input[@title = 'Поиск' and @aria-label]")
    private WebElement setSearchText;

    @FindBy(xpath = "(.//input[@value = 'Поиск в Google'])[1]")
    private WebElement submitSearch;

    /**
     * Input to the search string
     * @param text
     */

    public void setSetSearchText(String text){
        setText(setSearchText, text);
    }

    public void clickSubmitSearch(){
        click(submitSearch);
    }
}
