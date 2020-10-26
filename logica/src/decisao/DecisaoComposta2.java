package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta2 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu Nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota2"));
		short falta = Short.parseShort(JOptionPane.showInputDialog("Falta"));
		float media = (nota1+nota2+falta)/2;
		if (media>=6 && falta<=20) {
			System.out.println("Aprovado com media = " + media);
		}else if (media<4 || falta>20) {
			System.out.println("Infelizmente você foi Reprovado com media = " + media);
		}
	 
		}

}
