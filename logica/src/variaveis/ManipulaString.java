package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "rODRIGO";
        System.out.println("Original: " + email);
        System.out.println("email Minuscula: " + email.toLowerCase());
        System.out.println("email Maiuscula: " + email.toUpperCase());
        System.out.println("qtde de caracteres: " + email.length());
        System.out.println("Posicao do @: " + email.indexOf("@"));
        System.out.println("exibir do 2 ao 4 caracter: " + email.substring(1,4));
        System.out.println("exibir do 3 caracter em diante: " + email.substring(2));
        System.out.println("Primeira metade: " + email.substring(0,email.length()/2));
        System.out.println("Usuario do e-mail: " +  email.substring(0,email.indexOf("@")));
        System.out.println("Servidor do e-mail: " +  email.substring(email.indexOf("@")+1));
        System.out.println("Primeiro Caracter: " +  email.charAt(4));
        System.out.println("Comparando com ==: " +  (email=="rodrigodacunha@gmail.com.br"));
        System.out.println("Comparacao: " +  email.equals("rodrigodacunha@gmail.com.br"));
        System.out.println("Comparacao IGNORANDO CAIXA ALTA: " +  email.equalsIgnoreCase("RODRIGOdacunha@gmail.com.br"));
	}

}
