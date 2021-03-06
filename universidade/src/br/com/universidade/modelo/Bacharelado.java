package br.com.universidade.modelo;

public class Bacharelado extends Formacao{
	private int cargaHoraria;
	private String trabalhoConclusao;
	
	public void calcMensalidade(double fator) {
		super.setMensalidade((super.getMensalidade() * 600 * (float) fator)+(cargaHoraria *400));
	}
	
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Carga Hor�ria........: " + cargaHoraria + "\n" +
				"Trabalho Conclusao...: " + trabalhoConclusao;
					
	}
	
		

	public void setAll(String descricao, int duracao, float mensalidade, int cargaHoraria, String trabalhoConclusao) {
		super.setAll(descricao, duracao, mensalidade);
		this.cargaHoraria = cargaHoraria;
		this.trabalhoConclusao = trabalhoConclusao;
	}
	
	public Bacharelado(String descricao, int duracao, float mensalidade, int cargaHoraria, String trabalhoConclusao) {
		super(descricao, duracao, mensalidade);
		this.cargaHoraria = cargaHoraria;
		this.trabalhoConclusao = trabalhoConclusao;
	}



	public Bacharelado() {
		super();
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getTrabalhoConclusao() {
		return trabalhoConclusao;
	}
	public void setTrabalhoConclusao(String trabalhoConclusao) {
		this.trabalhoConclusao = trabalhoConclusao;
	}
	
	
	
	
	
	
	

}
