#language: pt
#enconding: UTF-8


@updateCart
Funcionalidade: Atualizar quantidade do carrinho de compras



	Cenario: Atualizado com sucesso
		Quando acessar o carrinho com produtos e clicar em view cart
		E digitar o novo valor em quantity
    E clicar em update
		Entao o carrinho de compras e atualizado