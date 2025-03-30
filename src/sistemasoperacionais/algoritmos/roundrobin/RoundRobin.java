package sistemasoperacionais.algoritmos.roundrobin;

public class RoundRobin {
    private Processo[] processos;
    private final int quantum = 4; // Tempo máximo que cada processo pode executar por vez

    public RoundRobin(Processo P1, Processo P2, Processo P3, Processo P4) {
        this.processos = new Processo[]{ P1, P2, P3, P4 };
    }

    public void exibirCabecalhoChegada() {
        System.out.println("-------------------------------------------------");
        System.out.println("Ordem de Chegada dos Processos");
        System.out.println("-------------------------------------------------");
        System.out.println("ID | Chegada | Surto");
    }


    public void executar() {
        int processosRestantes = processos.length; // Conta quantos processos ainda não terminaram

        while (processosRestantes > 0) {
            for (int i = 0; i < processos.length; i++) {
                if (processos[i].getSurto() > 0) { // Apenas executa processos que ainda têm tempo de surto
                    System.out.println("\nExecutando " + processos[i].getId());

                    // Reduz o tempo de surto do processo pelo valor do quantum (máximo que pode rodar por vez)
                    processos[i].setSurto(processos[i].getSurto() - quantum);
                    
                    // Garante que o surto nunca fique negativo
                    if (processos[i].getSurto() < 0) {
                        processos[i].setSurto(0);
                    }

                    // Mostra o tempo restante do processo
                    System.out.println(processos[i].getId() + " = " + processos[i].getSurto() + " segundos restantes\n");

                    // Se o processo finalizou, reduz a contagem de processos ativos
                    if (processos[i].getSurto() == 0) {
                        processosRestantes--;
                        System.out.println("--------------------------------");
                        System.out.println("Processo " + processos[i].getId() + " finalizado.");
                        System.out.println("--------------------------------");
                    }
                }
            }
        }
    }
}
