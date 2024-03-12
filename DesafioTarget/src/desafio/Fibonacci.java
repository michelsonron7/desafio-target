package desafio;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
	    Integer numero = sc.nextInt();

	    if (isFibonacci(numero)) {
	      System.out.println(numero + " pertence à sequência de Fibonacci.");
	    } else {
	      System.out.println(numero + " não pertence à sequência de Fibonacci.");
	    	}
	    
	    sc.close();
	  }
		
	public static boolean isFibonacci(Integer numero) {
		    if (numero < 0) {
		      return false;
		    }
		    
		    for (int i = 0; i <= numero + 2; i++) {
			      Integer atualNumero = NumeroFibonacci(i);
			      if (atualNumero == numero) {
			        return true;
			      }
			      
			      if (atualNumero > numero) {
			        return false;
			      }
			    }
			    return false;
			  }
	 
	static Integer NumeroFibonacci(Integer numero) {
		Integer atual = 0;
		Integer anterior = 0;
		
		for (int i = 1; i <= numero; i++) {
			
			if (i == 1) {
				atual = 1;
				anterior = 0;
			}else {
				atual += anterior;
				anterior = atual - anterior;
			}
		}
		return atual;
	}
	
}
