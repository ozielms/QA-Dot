package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AddProductsPage;
import pageObjects.RemoveProductsPage;

public class RemoveProductsSteps {

    @Quando("o carrinho estiver com produtos")
    public void oCarrinhoEstiverComProdutos() throws InterruptedException {
        Na(AddProductsPage.class).alimentarCarrinho();
        Thread.sleep(5000);
    }

    @Quando("acessar o carrinho de compras")
    public void acessarOCarrinhoDeCompras() {
        Na(RemoveProductsPage.class).acionarButtonCart();
    }

    @Quando("clicar em view cart")
    public void clicarEmViewCart() {
        Na(RemoveProductsPage.class).acionarViewCartButton();
    }

    @Quando("clicar em remove")
    public void clicarEmRemove() {
        Na(RemoveProductsPage.class).acionarRemoveButton();
    }

    @Entao("o produto e excluido do carrinho")
    public void oProdutoEExcluidoDoCarrinho() {
        assertTrue(driver.findElement(By.xpath("//div[@id='error-not-found']")).isDisplayed());
    }

}
