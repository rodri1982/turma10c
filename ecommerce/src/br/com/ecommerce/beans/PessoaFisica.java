package br.com.ecommerce.beans;

public class PessoaFisica extends Cliente{
 
	private String cpf;
	private String rg;
	
	
	
	public void setAll(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super.setAll(id, nome, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getAll(  ) {
		return
				super.getAll() + "\n" +
				"CFP....: " + cpf + "\n" +
				"RG.....: " + rg;
		
	}
	
	public PessoaFisica(int id, String nome, String fone, Endereco endereco) {
		super(id, nome, fone, endereco);
	}
	public PessoaFisica(int id, String nome, String fone, Endereco endereco, String cpf, String rg) {
		super(id, nome, fone, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}

