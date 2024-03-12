package desafio;

public class SomaDosNumeros {

	 
	public static void main(String[] args) {
		Integer indice = 13;
		Integer soma = 0;
		Integer k = 0;
		
		soma = fazerSoma(k, indice);
		
		System.out.println(soma);
	}
	
	static Integer fazerSoma(Integer k, Integer indice) {
		Integer soma = 0;
		while (k < indice) {
			k++;
			 soma += k;
	}
		return soma;
		
		
	}
	
}

