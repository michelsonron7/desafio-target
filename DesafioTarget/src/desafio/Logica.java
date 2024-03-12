package desafio;

public class Logica {

	public static void main(String[] args) {
		
//		a) Lógica: Sequência de números ímpares crescentes.
//      Próximo elemento: 9
		
		int numeroAnterior = 1;
	    int numeroAtual = 3;
	    
	    for (int i = 1; i <= 5; i++) {
	      System.out.print(numeroAnterior + " ");
	      int proximoNumero = numeroAtual + 2;
	      numeroAnterior = numeroAtual;
	      numeroAtual = proximoNumero;
	      
	    }
	    System.out.println();
	    System.out.println("**************************************");

//	    b) Lógica: Sequência de potências de 2.
//		Próximo elemento: 128
	    
	    for (int i = 1; i <= 7; i++) {
		      int potencia = (int) Math.pow(2, i);
		      System.out.print(potencia + " ");
		    }
	    System.out.println();
	    System.out.println("**************************************");
	    
//	    c) Lógica: Sequência de quadrados dos números naturais.
//	    Próximo elemento: 49
	    
	    for (int i = 0; i <= 7; i++) {
		      int quadrado = i * i;
		      System.out.print(quadrado + " ");
		    }

		    System.out.println(); 
		    System.out.println("**************************************");
		    
//		    d) Lógica: Sequência de quadrados dos números pares.
//		    Próximo elemento: 100
		    
		    for (int i = 2; i <= 10; i += 2) {
			      int quadrado = i * i;
			      System.out.print(quadrado + " ");
			    }

			    System.out.println(); 
			    System.out.println("**************************************");
			    
//			    e) Lógica: Sequência de Fibonacci, onde cada número é a soma dos dois anteriores.
//			    Próximo elemento: 13
			   
			    int anterior = 1;
			    int posterior = 1;

			    for (int i = 0; i < 7; i++) {
			      System.out.print(anterior + " ");
			      int proximo = anterior + posterior;
			      anterior = posterior;
			      posterior = proximo;
			    }

			    System.out.println(); 
			    System.out.println("**************************************");
			    
//			    f) Lógica: Naturais que começam com a letra D.
//				Próximo elemento: 200 
			    
			    System.out.println("2,10, 12, 16, 17, 18, 19, 200");
	}	
	

}
