package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		// Pe�a entrada do veiculo quantidade de passageiros
		// Exiba Mensagem
		//Veiculo Categoria A , e se a capacidade passageiros for igual 2
		//Veiculo Categoria B , e se a capacidade passageiros for igual 4 a 7
		//Veiculo Categoria C , e se a capacidade passageiros for maior 7

		String veiculo = JOptionPane.showInputDialog(" Veiculo ").toUpperCase();
		byte capacidade = Byte.parseByte(JOptionPane.showInputDialog(" Capacidade "));
		if (capacidade==2) {
			System.out.println(veiculo + "categoria A");
		}else if(capacidade>7) {
			System.out.println(veiculo + "categoria C");
		}else if (capacidade>=4 && capacidade<=7) {
			System.out.println(veiculo + "categoria B");
		}else {
			System.out.println("categoria Desconhecida");
		}
	}

}
