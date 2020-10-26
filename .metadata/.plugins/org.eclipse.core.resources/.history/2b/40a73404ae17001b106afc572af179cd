package br.com.execoes.implementacao;

public class TesteExecoes {

	public static void main(String[] args) {
		
		try {
		int numero 	= Integer.parseInt("7");
		System.out.println("Resultado: " + (numero *10));
		
		String email="";
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
		
		
		}catch (NullPointerException e) {
			System.out.println("Objeto nulo");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Coodenada invalida");
		}catch (NumberFormatException e) {
			System.out.println("Número invalido");
		}catch (Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}finally {
			System.out.println("Até logo");
		}

}
	
}
