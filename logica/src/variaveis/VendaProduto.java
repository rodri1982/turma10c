package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Digite o produto");
		int codigo = Integer.parseInt (JOptionPane.showInputDialog("Digite o codigo"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite valor"));
		int qtde = Integer.parseInt (JOptionPane.showInputDialog("Digite o quantidade"));
		double total = qtde*valor;
 		System.out.println("produto.................:" + produto);
 		System.out.println("Total...................:" + total);
 		System.out.println("Total com Desconto......:" + (total*0.9));	
		
		
		

	}

}
