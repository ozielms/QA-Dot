#language: pt
#enconding: UTF-8

@removeProducts
Funcionalidade: Remover produtos do carrinho

	Cenario: Removendo produtos
		Quando o carrinho estiver com produtos
		E acessar o carrinho de compras
        E clicar em cart view
        E clicar em remove
		Entao o produto e excluido do carrinho
		