package br.comcasageral.teste;

import br.com.casageral.modelo.CasaGeral;

public class TesteCasaGeral {
	
	public static void main(String[] args) {
		CasaGeral tv = new CasaGeral();
		tv.ligar();
		System.out.println(tv.retornarTudo());
		tv.ligar();
		tv.mudarCanal(2);
		System.out.println(tv.retornarVolume());
		tv.aumentarVolume(5);
		tv.diminuirVolume(5);
		System.out.println(tv.retornarCanal());
		tv.mudarCanal(32);
		System.out.println(tv.retornarTudo());
		
	}
	
}