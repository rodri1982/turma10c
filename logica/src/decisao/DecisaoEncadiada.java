package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadiada {

	public static void main(String[] args) {
		
		short falta = Short.parseShort(JOptionPane.showInputDialog("Falta"));
		if (falta>20) {
			System.out.println("Reprovado por Faltas = " + falta);
		} else {
		String nome = JOptionPane.showInputDialog("Digite seu Nome").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota2"));
		float media = (nota1+nota2)/2;
		if (media>=6) {
			System.out.println("Aprovado com media = " + media);
		} else if (media<=4) {
			System.out.println("Infelizmente voc� foi Reprovado com media = " + media);
		}
		
		}

}
}