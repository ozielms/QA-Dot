#language: pt
#enconding: UTF-8


@removeProducts
Funcionalidade: Excluir produtos do carrinho



	Cenario: Excluindo com sucesso
		Quando o carrinho estiver com produtos
		E acessar o carrinho de compras
		E clicar em view cart
        E clicar em remove
		Entao o produto e excluido do carrinho
		