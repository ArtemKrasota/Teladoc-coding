package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page{

    @FindBy (xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement allNavBar;

    @FindBy(linkText = "Subscribe & Save")
    private WebElement subscribeAnSaveBtn;


    public void clickOnSubscrbsv(){
        allNavBar.click();
        subscribeAnSaveBtn.click();
    }

}
