package br.com.universidade.modelo;

public class Formacao {

	private String descricao;
	private int duracao;
	private float mensalidade;
	
	
	public void calcMensalidade(double fator) {} // para atender os metodos 
	
	
	public float retornarMedia(float n1, float n2, float proj1,  float proj2) {
	    float media = n1*(float)0.4 + n2*(float)0.4 + proj1*(float)0.1 + proj2*(float)0.1;
		return media;
	    
		}	
	
	public float retornarMedia(float n1, float n2) {
		return n1*(float)0.5+n2*(float)0.5;
		
				
	}
	
	public String getAll() {
		return
				"Descrição........: " + descricao + "\n" +
		        "Duração..........: " + duracao + "\n" +
		        "Mensalidade......: " + mensalidade;
				
	}
		
	public Formacao(String descricao, int duracao, float mensalidade) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}

	public void setAll(String descricao, int duracao, float mensalidade) {
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}
	public Formacao() {
		super();
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
}
