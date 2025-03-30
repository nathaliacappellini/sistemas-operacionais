package sistemasoperacionais.threads;

import java.util.Random;

/**
 * A classe simula uma corrida entre carros utilizando threads.
 * Cada carro (thread) avança uma distância aleatória (1-10 km por iteração)
 * até que um dos competidores atinja ou ultrapasse 100 km,
 * sendo declarado o vencedor da corrida.
 * 
 * A classe implementa controle de concorrência para garantir que
 * apenas o primeiro carro a completar a distância seja considerado vencedor.
 */

public class Carro extends Thread {

    private String nomeCarro; 
    private int distanciaPercorrida = 0;
    private static volatile boolean vencedor = false;

    Carro(String nome) {
        this.nomeCarro = nome;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (distanciaPercorrida < 100 && !vencedor) {
            int numeroAleatorio = random.nextInt(10) + 1;
            distanciaPercorrida += numeroAleatorio;

            if (distanciaPercorrida >= 100 && !vencedor) {
                vencedor = true;
                System.out.println("\nO vencedor é " + nomeCarro + " com " + distanciaPercorrida + "km de distância!");
                System.out.println("\nCorrida encerrada!\n");
            }
        }
    }
}