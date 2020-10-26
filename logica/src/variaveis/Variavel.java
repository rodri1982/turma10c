package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
        String nome = JOptionPane.showInputDialog("Digite Seu nome");
        int idade = Integer.parseInt (JOptionPane.showInputDialog("Digite Sua Idade"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite Altura"));
        double peso= Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso"));
        double imc = peso / (altura*altura);
        System.out.println("Usuario:.:"+nome);
        System.out.println("Idade:...:"+idade);
        System.out.printf("IMC:.....: %.2f", imc);
        
	}

}
