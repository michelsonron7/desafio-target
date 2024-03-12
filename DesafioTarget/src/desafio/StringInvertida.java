package desafio;

public class StringInvertida {

	public static void main(String[] args) {
		
		// String a ser invertida
        String str = "Target! :)";

        // Criando uma variável para armazenar a string invertida
        String strInvertida = "";

        // Loop que percorre 
        for (int i = str.length() - 1; i >= 0; i--) {
            // Concatenando cada caractere da string original à string invertida
            strInvertida += str.charAt(i);
        }

        // Imprimindo a string invertida
        System.out.println(strInvertida);

	}

}
