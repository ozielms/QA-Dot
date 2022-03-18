package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AddProductsCartPage;
import pageObjects.RemoveProductsPage;

public class RemoveProductsSteps {

	@Quando("o carrinho estiver com produtos")
	public void oCarrinhoEstiverComProdutos() throws InterruptedException {
		Na(AddProductsCartPage.class).alimentarCarrinho();
		Thread.sleep(2000);
	}

	@Quando("acessar o carrinho de compras")
	public void acessarOCarrinhoDeCompras() {
		Na(RemoveProductsPage.class).acionarButtonCart();
	}

	@Quando("clicar em cart view")
	public void clicarEmCartView() {
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
