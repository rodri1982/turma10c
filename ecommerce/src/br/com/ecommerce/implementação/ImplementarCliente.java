package br.com.ecommerce.implementação;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Magica;
import br.com.ecommerce.beans.PessoaFisica;
import br.com.ecommerce.beans.PessoaJuridica;

public class ImplementarCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		int resposta = Magica.i("Digite <1> PF e <2> PJ ");
		if (resposta==1) {
			c = new PessoaFisica(
					1,
					"REGINA",
					"1234-4321",
					new Endereco(),
					"123.456.789-00",
					"00.000.000-X"
									
					);
		}else if (resposta==2) {
			c = new PessoaJuridica(
					2,
					"CHURROS LTDA",
					"1004-4321",
					new Endereco(),
					"00.000.000/0001-00",
					"000.000.000.000",
					"SR.JOAOZINHO"
					
					);
					}
		System.out.println(c.getAll());
		
		


	}

}
