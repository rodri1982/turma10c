package br.com.ecommerce.implementação;

import br.com.ecommerce.beans.Magica;
import br.com.ecommerce.beans.Produto;

public class ImplementarProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setQtde(Magica.i("Qtde"));
		p.setValorCompra(Magica.f("Compra"));
		p.setValorVenda(Magica.f("Venda"));
		// getDesconto() ajustarValores() totalCompra()
		
		System.out.println("Total de Compra :"+ p.totalCompra());
		System.out.println("Total de Venda" + p.totalVenda());
		System.out.println("Vendacom 10%" + p.getDesconto());
		System.out.println("Venda com X%" + p.getDesconto(Magica.f("Porc")));
		p.ajustarValores(Magica.f("Valor a sr adicionado"));
		System.out.println(p.getValorCompra());
		System.out.println(p.getValorVenda());
		
		

	}

}
