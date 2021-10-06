package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscribeAndSavePage extends  Page{
    @FindBy(id = "a-autoid-0-announce")
    private WebElement aboutBtn;
    @FindBy(id = "a-autoid-1-announce")
    private WebElement yourSubscribeSaveItemsBtn;
    @FindBy(id = "a-autoid-2-announce")
    private WebElement shopSubscribeSaveBtn;
    @FindBy(id = "a-autoid-3-announce")
    private WebElement helpCustomerServiceBtn;
    @FindBy(xpath = "//h1[contains(text(),'Amazon Subscribe & Save')]")
    private WebElement subscribeAndSaveHeader;

    public void clickAboutBtn(){
        aboutBtn.click();
    }

    public void clickSubscribeSaveItemsBtn(){
        yourSubscribeSaveItemsBtn.click();
    }

    public void clickshopSubscribeSaveBtn(){
        shopSubscribeSaveBtn.click();
    }

    public void clickhelpCustomerServiceBtn(){
        helpCustomerServiceBtn.click();
    }

    public String subscribeAndSaveHeader(){
        return subscribeAndSaveHeader.getText();
    }
}
