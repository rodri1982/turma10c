package variaveis;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu Nome");
		String disciplina = JOptionPane.showInputDialog("Digite a Diciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite Nota2"));
		float media = (nota1+nota2)/2;
 		System.out.printf("%s Sua m�dia na disciplina %s Foi de %2f", nome, disciplina, media);
 		JOptionPane.showMessageDialog(null, nome + "\n" + disciplina + "\n" + media); // para aparecer janela
	}

}
