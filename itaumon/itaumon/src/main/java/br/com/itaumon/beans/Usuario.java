package br.com.itaumon.beans;


public class Usuario {

	   private int codigo;   
       private String nome;     
       private String email;       
       private String senha;       
       private String foto;

      
	
       
       public Usuario() {
		super();
	}


	public Usuario(int codigo, String nome, String email, String senha, String foto) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}
       
       
       
	
}
