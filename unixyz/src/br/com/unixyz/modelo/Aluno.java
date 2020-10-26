package br.com.unixyz.modelo;

//implementacao = principal = teste (camada onde tem o main())
// modelo = beans = javabeans = dto = to
//
// Desing Patterns => DTO ( Data transfer Object)
// Todo atributo deve ser privado.
// Todo atributo deve possuir um metodo de input e outro de output.
// ???? = Construtores
// Cada classe deve ter no minimo dois construtores ( um vazio e (outro cheio = com todos os atributos))

public class Aluno {
   	private int rm;
	private String nome;
	private String email;
	
		
	public Aluno() {
		super();
	}

	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	public void setALL(int rm, String nome, String email) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		
	}
	
    
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
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
	
		
	
}
