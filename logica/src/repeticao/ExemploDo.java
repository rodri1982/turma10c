package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		String candidato="";
		int totalX=0;
		int totalY=0;
		do {
			candidato = JOptionPane.showInputDialog("Digite <X> ou <Y>").toUpperCase();
			if (candidato.equals("X")) {
				totalX=totalX+1;
			}else if (candidato.equals("Y")) {
				totalY=totalY+1;
			}
		}while(candidato.equals("X") || candidato.equals("Y"));
		System.out.println("Total do candidato X: " + totalX);
		System.out.println("Total do candidato Y: " + totalY);

	}

}
