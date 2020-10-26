package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		
		// for utilizamos, normalmente, quando não há interação do usuário com repetição
		//Sintaxe
		// 1 - inicio da rep2tição coma definição do contador
		// 2 - condição, ou seja, até quando o laço vai ser executado
		// 3 - qual a forma de contagem
		// Exemplo
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog(" Digite um Valor"));
			
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + " x " + contador + "=" + (tabuada * contador));
		}

	}

}
