$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddProducts.feature");
formatter.feature({
  "name": "Adicionar produtos no carrinho",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@addProducts"
    }
  ]
});
formatter.scenario({
  "name": "Adicionando com sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@addProducts"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Na pagina principal mover o mouse ate a aba Desktops",
  "keyword": "Quando "
});
formatter.match({
  "location": "AddProductsCartSteps.naPaginaPrincipalMoverOMouseAteAAbaDesktops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Mac",
  "keyword": "E "
});
formatter.match({
  "location": "AddProductsCartSteps.clicarEmMac()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto e adicionado no carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "AddProductsCartSteps.oProdutoEAdicionadoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/RemoveProducts.feature");
formatter.feature({
  "name": "Remover produtos do carrinho",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@removeProducts"
    }
  ]
});
formatter.scenario({
  "name": "Removendo produtos",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@removeProducts"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o carrinho estiver com produtos",
  "keyword": "Quando "
});
formatter.match({
  "location": "RemoveProductsSteps.oCarrinhoEstiverComProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acessar o carrinho de compras",
  "keyword": "E "
});
formatter.match({
  "location": "RemoveProductsSteps.acessarOCarrinhoDeCompras()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em cart view",
  "keyword": "E "
});
formatter.match({
  "location": "RemoveProductsSteps.clicarEmCartView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em remove",
  "keyword": "E "
});
formatter.match({
  "location": "RemoveProductsSteps.clicarEmRemove()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto e excluido do carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "RemoveProductsSteps.oProdutoEExcluidoDoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/UpdateCart.feature");
formatter.feature({
  "name": "Atualizar quantidade do carrinho de compras",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@updateCart"
    }
  ]
});
formatter.scenario({
  "name": "Atualizado com sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@updateCart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "acessar o carrinho com produtos e clicar em view cart",
  "keyword": "Quando "
});
formatter.match({
  "location": "UpdateCartSteps.oCarrinhoEstiverComProdutos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digitar o novo valor em quantity",
  "keyword": "E "
});
formatter.match({
  "location": "UpdateCartSteps.digitarONovoValorEmQuantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em update",
  "keyword": "E "
});
formatter.match({
  "location": "UpdateCartSteps.clicarEmUpdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o carrinho de compras e atualizado",
  "keyword": "Entao "
});
formatter.match({
  "location": "UpdateCartSteps.oCarrinhoDeComprasEAtualizado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
});