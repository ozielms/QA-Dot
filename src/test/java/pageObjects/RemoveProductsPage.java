package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RemoveProductsPage {

    @FindBy(xpath = "//div[@id='cart']/button")
    private WebElement cartButton;

    @FindBy(xpath = "//strong[contains(text(), 'View Cart')]")
    private WebElement viewCartButton;

    @FindBy(xpath = "//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[2]")
    private WebElement removeButton;

    public void acionarButtonCart() {
        cartButton.click();
    }

    public void acionarViewCartButton() {
        viewCartButton.click();
    }

    public void acionarRemoveButton() {
        removeButton.click();
    }
}
