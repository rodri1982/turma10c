package decisao;

import javax.swing.JOptionPane;

public class Hotel {

	public static void main(String[] args) {

		short diarias = Short.parseShort(JOptionPane.showInputDialog("Qtde Diarias"));
		double valorDiaria=80;
		if (diarias>15) {
	        valorDiaria = 85.5;
		} else if (diarias==15) {
			valorDiaria = 86;
		} else {
			valorDiaria = 88;
		}
		System.out.println("Total: " + (valorDiaria*diarias));			
  
	}

}
