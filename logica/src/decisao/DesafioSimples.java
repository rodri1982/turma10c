package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		// Peça para usuario nome e idade. deve exibir obrigado por votar maior 17 menor 70
		// voto facultativo 16 e 17 maior com 70
		// proibido menor 16
		
		String nome = JOptionPane.showInputDialog("Digite seu Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua Idade"));
		short voto = Short.parseShort(JOptionPane.showInputDialog("Digite seu Voto"));
				if (idade<16) {
		     	System.out.println( nome + " Idade não permitida para Votar ");
		}
		       if (idade>17 && idade<70 ) {
		    	   System.out.println( nome + " Voto obrigatório ");
		       }
		       
		       if (idade==16 || idade==17 || idade>=70) {
		    	   System.out.println( nome + " O seu voto é facultativo. ");
		       }


	}

}
