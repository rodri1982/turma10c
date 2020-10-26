package br.com.concessionaria.modelo;

public class Formula1 {
    private String cor;
    private String escuderia;
    private boolean status;
    private float velocidadeAtual;
    private float valor;
    // Sintaxe para os metedos
    // <modificador> <Tipo de retorno> <nomeMetodo> (<TipoParam> <nomeParam>){
    public void preencherEscuderia(String pEscuderia) {
    	escuderia=pEscuderia.toUpperCase();
    	    	
    }
    
    public String retornarEscuderia() {
    	return escuderia;
    	
    }
}
