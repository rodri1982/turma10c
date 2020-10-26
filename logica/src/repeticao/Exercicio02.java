package repeticao;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String nome="";
		short idade=0;
		int contMaiorIdade=0;
		int qtdePessoas=0;
		int totalIdades=0;
		String pessoaMaisExperiente="";
		int idadeMaisExperiente=0;
		String pessoaMaisJovem="";
		int idadeMaisJovem=0;
		do {
			nome = JOptionPane.showInputDialog("Digite o nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));
			if (idade>=18) {
				contMaiorIdade++;
			}
			totalIdades+=idade; // totalIdades = totalIdades + idade;
			qtdePessoas++;
			if(idade>idadeMaisExperiente) {
				idadeMaisExperiente=idade;
				pessoaMaisExperiente=nome;
			}
			
			if (idade<idadeMaisJovem || qtdePessoas==1) {
				idadeMaisJovem=idade;
				pessoaMaisJovem=nome;
			}
		}while(JOptionPane.showConfirmDialog(
				null, // posição inicial da janela (centralizada em relacao ao monitor)
				"Deseja Continuar?", //Mensagem principal (que fica no centro da janela)
				"Pergunta", // mensagem que aparece no barra de título da janela
				JOptionPane.YES_NO_OPTION // configuração dos botões da Janela (Yes==0// No==1)
				)==0);
		System.out.println("Total de pessoas maiores de idade: " + contMaiorIdade);
		System.out.println("Média de idades: " + (totalIdades/qtdePessoas));
		System.out.println("Mais experiente: " + pessoaMaisExperiente);
		System.out.println("Idade da mais experiente: " + idadeMaisExperiente);
		System.out.println("Mais Jovem: " + pessoaMaisJovem);
		System.out.println("Idade da mais jovem: " + idadeMaisJovem);
			    

	}

}
