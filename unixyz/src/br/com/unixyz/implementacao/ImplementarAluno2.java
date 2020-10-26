package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class ImplementarAluno2 {
    
	public 	static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setALL(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("NOME").toUpperCase(),
				JOptionPane.showInputDialog("EMAIL").toLowerCase());
		System.out.println(aluno.getAll());
		
				
}
	
}
