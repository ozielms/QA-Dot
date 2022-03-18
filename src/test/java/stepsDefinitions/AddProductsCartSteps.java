package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AddProductsCartPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class AddProductsCartSteps {

    @Quando("Na pagina principal mover o mouse ate a aba Desktops")
    public void naPaginaPrincipalMoverOMouseAteAAbaDesktops() {
        Na(AddProductsCartPage.class).acessarAbaDesktops();
    }

    @Quando("clicar em Mac")
    public void clicarEmMac() {
        Na(AddProductsCartPage.class).acessarMenuMac();
    }

    @Entao("o produto e adicionado no carrinho")
    public void oProdutoEAdicionadoNoCarrinho() {
        Na(AddProductsCartPage.class).acionarBotaoAddToCart();
        assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'alert-success')]")).isDisplayed());
    }

}
