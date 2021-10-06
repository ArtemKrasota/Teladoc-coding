package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class Page {
    protected WebDriver driver;

    public Page() {
        this.driver = Driver.get();
        PageFactory.initElements(driver, this);
    }
}
