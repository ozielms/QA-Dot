package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddProductsPage {

    @FindBy(xpath = "//ul[@class='nav navbar-nav']//li[@class='dropdown']//a[text()='Desktops']")
    private WebElement abaDesktops;

    @FindBy(xpath = "//ul[@class='list-unstyled']//li//a[text()='Mac (1)']")
    private WebElement menuMac;

    @FindBy(xpath = "//div[@class='button-group']//button//span[text()='Add to Cart']")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement messageSuccess;

    Actions acao = new Actions(driver);

    public void acessarAbaDesktops() {
        acao.moveToElement(abaDesktops).build().perform();
    }

    public void acessarMenuMac() {
        acao.moveToElement(menuMac).build().perform();
        menuMac.click();
    }

    public void acionarBotaoAddToCart() {
        buttonAddToCart.click();
    }

    public void alimentarCarrinho() {
        acao.moveToElement(abaDesktops).build().perform();
        acao.moveToElement(menuMac).build().perform();
        menuMac.click();
        buttonAddToCart.click();
    }

}
