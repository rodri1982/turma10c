package br.com.ecommerce.beans;

public class Venda {

	private int notaFiscal;
	private float total;
	private float desconto;
	private String data;
	private Cliente client;
	private Produto produto;
	
	public Venda() {
		super();
	}

	public String getAll() {
		return
		"Nota Fiscal................................:" + notaFiscal +"\n" +
		"Total......................................:" + total +"\n" +
		"Desconto...................................:" + desconto +"\n" +
		"Data.......................................:" + data +"\n" +
		"Cliente....................................: \n" + client.getAll() +"\n" +
		"Produto....................................: \n" + produto.getAll();
	}
	
	public void setAll(int notaFiscal, float total, float desconto, String data, Cliente client, Produto produto) {
		this.notaFiscal = notaFiscal;
		this.total = total;
		this.desconto = desconto;
		this.data = data;
		this.client = client;
		this.produto = produto;
	}
	
	
	public Venda(int notaFiscal, float total, float desconto, String data) {
		super();
		this.notaFiscal = notaFiscal;
		this.total = total;
		this.desconto = desconto;
		this.data = data;
		this.client = client;
		this.produto = produto;
	}

	public int getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
	
	
	
	
}
