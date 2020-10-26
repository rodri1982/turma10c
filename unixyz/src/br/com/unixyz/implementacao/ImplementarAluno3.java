package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;

public class ImplementarAluno3 {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome").toUpperCase(),
				JOptionPane.showInputDialog("Email").toLowerCase()
				);
		      System.out.println(aluno.getAll());
	}
}	
