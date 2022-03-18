package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AddProductsCartPage;
import pageObjects.RemoveProductsPage;
import pageObjects.UpdateCartPage;


public class UpdateCartSteps {

    @Quando("acessar o carrinho com produtos e clicar em view cart")
    public void oCarrinhoEstiverComProdutos() throws InterruptedException {
        Na(AddProductsCartPage.class).alimentarCarrinho();
        Thread.sleep(2000);
        Na(RemoveProductsPage.class).acionarButtonCart();
        Na(RemoveProductsPage.class).acionarViewCartButton();
    }

    @Quando("digitar o novo valor em quantity")
    public void digitarONovoValorEmQuantity() {
        Na(UpdateCartPage.class).preencherCampoQuantity();
    }

    @Quando("clicar em update")
    public void clicarEmUpdate() throws InterruptedException {
    	Na(UpdateCartPage.class).acionarUpdateButton();
    	Thread.sleep(3000);
    }

    @Entao("o carrinho de compras e atualizado")
    public void oCarrinhoDeComprasEAtualizado() {
    	assertTrue(driver.findElement(By.xpath("//div[@id='checkout-cart']")).isDisplayed());
    }

}
