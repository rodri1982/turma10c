package br.com.colecoes.implemetacao;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		Set<String> lista= new HashSet<String>();
		
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("INFRA");
		lista.add("DBA");
		lista.add("DEV");
		lista.add("SUPORTE");
		lista.add("ESTAGIARIO");
		
		System.out.println(lista);
		//Comando Set n�o existe indice
		//System.out.println(lista.get(1));	
		// A ordena��o que precalece  � a ordena��o do Hash
		//Collections.sort(lista);
		
			
		
	}

}
