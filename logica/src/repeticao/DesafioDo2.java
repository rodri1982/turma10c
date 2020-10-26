package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo2 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número a ser advinhado"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o número"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O número é maior");
			}else if (numero<chute) {
				JOptionPane.showMessageDialog(null, "O número é menor");
			}
		}while(numero!=chute);
		System.out.println("Parabéns você acertou com " + contador + " tentativa(s).");
				
			}
		}


