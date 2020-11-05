package br.com.unixyz.implementacao;

import java.awt.Cursor;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Aluno;
import br.com.curso.modelo.Curso;

public class ImplementarAluno {

	public static void main(String[] args) {
	     Aluno aluno = new Aluno();
	     aluno.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
		 aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		 aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
		 System.out.println("RM......." + aluno.getRm());
		 System.out.println("Nome....." + aluno.getNome());
		 System.out.println("Email....." + aluno.getEmail());
		 System.out.println("Dados....." + aluno.getAll());
		 Curso curso = new Curso(
		 Integer.parseInt(JOptionPane.showInputDialog("ID"));
		 JOptionPane.showInputDialog("Descricao");
		 JOptionPane.showInputDialog("Valor");
		 JOptionPane.showInputDialog("Carga Horaria");	 
		 );
		 System.out.printlnt(curso.geAll);
		 
		 
		 
		 
		 
	}
	 
		 
	 }
	
	 
	    
}
