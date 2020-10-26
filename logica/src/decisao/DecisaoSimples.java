package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu Nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota2"));
		float media = (nota1+nota2)/2;
		if (media>=6) {
			System.out.println("Aprovado com media = " + media);
		}
		if (media<4) {
			System.out.println("Infelizmente você foi Reprovado com media = " + media);
		}
		if (media>=4 && media<6) {
			System.out.println("Você ainda tem uma chance no exame");
		}
	}

}
