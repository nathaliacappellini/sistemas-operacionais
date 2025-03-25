package io.github.nathaliacappellini.sistemasoperacionais.algoritmos.fcfs;

public class Main {
    public static void main(String[] args) { // Instânciando processos e escalonador
        Processo P1 = new Processo("P1", 800, 1);
        Processo P2 = new Processo("P2", 50, 2);
        Processo P3 = new Processo("P3", 120, 3);
        Processo P4 = new Processo("P4", 5, 4);

        FCFS escalonador = new FCFS(P1, P2, P3, P4);
        escalonador.mostrarFilaProcessos(); // Mostrando fila de processos e o tempo de espera
        escalonador.calcularTempoEspera();
    }
}
