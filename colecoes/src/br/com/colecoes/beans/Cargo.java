package br.com.colecoes.beans;

public class Cargo {

	public class cargo {
		private String nome;
		private String nivel;
		private float Salario;
		
		
		public cargo(String nome, String nivel, float salario) {
			super();
			this.nome = nome;
			this.nivel = nivel;
			Salario = salario;
		}
		public cargo() {
			super();
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNivel() {
			return nivel;
		}
		public void setNivel(String nivel) {
			this.nivel = nivel;
		}
		public float getSalario() {
			return Salario;
		}
		public void setSalario(float salario) {
			Salario = salario;
		}
		

		
		
		

		
		
	}
}
