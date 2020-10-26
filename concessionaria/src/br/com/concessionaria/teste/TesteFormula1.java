package br.com.concessionaria.teste;

import br.com.concessionaria.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {
		// Criar um objeto
		Formula1 objeto = null;
		// instanciar um objeto
		Formula1 carro = new Formula1();
		carro.preencherEscuderia("ferrari");
		System.out.println(carro.retornarEscuderia());
		
		
		

	}

}
