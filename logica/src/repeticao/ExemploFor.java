package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		
		// for utilizamos, normalmente, quando n�o h� intera��o do usu�rio com repeti��o
		//Sintaxe
		// 1 - inicio da rep2ti��o coma defini��o do contador
		// 2 - condi��o, ou seja, at� quando o la�o vai ser executado
		// 3 - qual a forma de contagem
		// Exemplo
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog(" Digite um Valor"));
			
		for (int contador=1;contador<11;contador++) {
			System.out.println(tabuada + " x " + contador + "=" + (tabuada * contador));
		}

	}

}
