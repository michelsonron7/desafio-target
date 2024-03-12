package desafio;

public class Lampadas {
	
	public static void main(String[] args) {

		boolean[] lampadas = new boolean[3];

        String[] mensagens = {
            "O interruptor 1 controla a lâmpada 1.",
            "O interruptor 2 controla a lâmpada 2.",
            "O interruptor 3 controla a lâmpada 3."};
        
        // Loop para as duas iterações
        for (int i = 0; i < 2; i++) {
            
            ligarInterruptor(i + 1);

            // Aguardar alguns minutos
            System.out.println("Aguardando alguns minutos...");

            // Desligar o interruptor
            desligarInterruptor(i + 1);

            // Identificar as lâmpadas
            if (i == 1) {
                for (int j = 0; j < lampadas.length; j++) {
                    if (verificarEstadoLampada(j + 1, lampadas)) {
                        System.out.println(mensagens[j]);
                    }
                }
            }
        }
    }

    // Método para simular ligar um interruptor
    public static void ligarInterruptor(int numeroInterruptor) {
        System.out.println("Ligando o interruptor " + numeroInterruptor + ".");
    }

    // Método para simular desligar um interruptor
    public static void desligarInterruptor(int numeroInterruptor) {
        System.out.println("Desligando o interruptor " + numeroInterruptor + ".");
    }

    // Método para verificar o estado de uma lâmpada (simulando a lâmpada quente ao toque)
    public static boolean verificarEstadoLampada(int numeroLampada, boolean lampadas[]) {
    	
        return lampadas[numeroLampada - 1];
    }
	
}
