package br.com.ecommerce.beans;

public class Cliente {

	private int id;
	private String nome;
	private String fone;
	private Endereco endereco = new Endereco();	
	
	public String getAll() {
		return
				"ID................................:" + id +"\n" +
				"Nome......................................:" + nome +"\n" +
				"Telefone...................................:" + fone +"\n" +
				"Endere�o.......................................:\n" +endereco.getAll();
			
	}
	
	
	public void setAll(int id, String nome, String fone, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public Cliente(int id, String nome, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
	}


	public Cliente() {
		super();
	}
	

	public void setId(int id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setFone(String fone) {
		this.fone = fone;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getFone() {
		return fone;
	}


	public Endereco getEndereco() {
		return endereco;
	}
	
	
	
}
