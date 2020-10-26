package br.com.colecoes.implemetacao;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
				
		List<String> lista = new ArrayList<String>();
				
    	lista.add("DBA");
		lista.add("DEV");
		lista.add("DEVOPS");
		lista.add("DBA");
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		System.out.println("Exibindo segundo elemento: " + lista.get(1));
		lista.remove(1);
		System.out.println("Depois de excluir" + lista);
		//com For tradicional
		//for (int contador=0;contador<lista.size();contador++) {
		//	System.out.println("Cargo:  ") + lista.get(contador));
		
		//}
		
		//com Foreach
	      for (String elemento : lista) {
	    	  System.out.println("Cargo: " + elemento);
	    	  
	      }
	
		

	}

}
