package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AddProductsPage;

public class AddProductsSteps {

    @Quando("Na pagina principal mover o mouse ate a aba Desktops")
    public void naPaginaPrincipalMoverOMouseAteAAbaDesktops() {
        Na(AddProductsPage.class).acessarAbaDesktops();
    }

    @Quando("clicar em Mac")
    public void clicarEmMac() {
        Na(AddProductsPage.class).acessarMenuMac();
    }

    @Entao("o produto e adicionado no carrinho")
    public void oProdutoEAdicionadoNoCarrinho() {
        Na(AddProductsPage.class).acionarBotaoAddToCart();
        assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'alert-success')]")).isDisplayed());
    }

}
