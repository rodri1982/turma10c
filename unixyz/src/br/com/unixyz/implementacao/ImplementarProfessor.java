package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;

public class ImplementarProfessor {

	
	
	public static void main(String[] args) {
		
		
		Professor professor = new Professor();
		Endereco endereco = new Endereco();
		professor.setId(Magica.i("ID"));
		professor.setNome(Magica.s("Nome"));
		professor.setFormacao(Magica.s("Formacao"));
		//Muito importante
		professor.setEndereco(endereco);
		// NUNCA esquecer de atribuir o Objeto
		
		endereco.setLagradouro(Magica.s("Logradouro"));
		endereco.setNumero(Magica.s("Numero"));
		endereco.setBairro(Magica.s("Bairro"));
		endereco.setCidade(Magica.s("Cidade"));
		// seguiria preenchendo os outros atributos
			
		
		System.out.println(professor.getAll());
		System.out.println(professor.getEndereco().getCidade());
		
		
		
		

	}

}
