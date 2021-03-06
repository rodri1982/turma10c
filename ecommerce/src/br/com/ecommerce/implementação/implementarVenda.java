package br.com.ecommerce.implementação;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Magica;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;

public class implementarVenda {

	public void main(String[] args) {
		Venda venda = new Venda(
				Magica.i("Nota Fiscal"),
				Magica.f("Total"),
				Magica.f("Desconto"),
				Magica.s("Data")
				);
	
				new Cliente(
						Magica.i("ID"),
						Magica.s("Nome"),
						Magica.s("Fone")
						);
	

						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Numero"),
								Magica.s("Complemento"),
								Magica.s("Bairro"),
								Magica.s("Cidade"),
								Magica.s("Estado"),
								Magica.s("Cep")
								);
	
				new Produto(
						Magica.i("ID"),
						Magica.s("Descricao"),
						Magica.f("Valor Venda"),
						Magica.f("Valor Compra"),
						Magica.i("Qtde")
						);
			
			
		System.out.println(venda.getAll());

		}
	}
	

