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
  "location": "AddProductsSteps.naPaginaPrincipalMoverOMouseAteAAbaDesktops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar em Mac",
  "keyword": "E "
});
formatter.match({
  "location": "AddProductsSteps.clicarEmMac()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto e adicionado no carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "AddProductsSteps.oProdutoEAdicionadoNoCarrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/RevoveProducts.feature");
formatter.feature({
  "name": "Excluir produtos do carrinho",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@removeProducts"
    }
  ]
});
formatter.scenario({
  "name": "Excluindo com sucesso",
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
  "name": "clicar em view cart",
  "keyword": "E "
});
formatter.match({
  "location": "RemoveProductsSteps.clicarEmViewCart()"
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
});