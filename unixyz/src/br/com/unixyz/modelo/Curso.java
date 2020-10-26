package br.com.unixyz.modelo;

public class Curso {

	private int id;
	private String descricao;
	private float valor;
	private int cargaHoraria;
	
	
	public String getAll() {
		return
				"ID.......................:" + id +"\n" +
				"Descricao................:" + descricao +"\n" +
				"Valor....................:" + valor +"\n" +
				"Carga Horaria............:" + cargaHoraria;
	}
	
	public void setAll(int id, String descricao, float valor, int cargaHoraria) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}


	public Curso() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
}
