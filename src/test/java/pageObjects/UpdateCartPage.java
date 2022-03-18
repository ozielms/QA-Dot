package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateCartPage {

    @FindBy(xpath = "//div[@class='input-group btn-block']//input")
    private WebElement quantityField;
    
    @FindBy(xpath = "//div[@class='input-group btn-block']//span//button")
    private WebElement updateButton;
    

    public void preencherCampoQuantity() {
    	quantityField.clear();
    	quantityField.sendKeys("3");
    }
    
    public void acionarUpdateButton() {
    	updateButton.click();
    }

}
