package sistemasoperacionais.gerenciamento_processos.escalonamento.fcfs;

public class FCFS {
    private Processo p1, p2, p3, p4; // Apenas quatro processos suportados

    public FCFS(Processo p1, Processo p2, Processo p3, Processo p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public void mostrarFilaProcessos() {
        System.out.println("---------------------------------------------");
        System.out.println("Fila de execução de processos - FCFS");
        System.out.println("---------------------------------------------");
        System.out.println("ID | Chegada | Surto (ms)");
        System.out.println(p1.getId() + "\t" + p1.getChegada() + "\t" + p1.getSurto());
        System.out.println(p2.getId() + "\t" + p2.getChegada() + "\t" + p2.getSurto());
        System.out.println(p3.getId() + "\t" + p3.getChegada() + "\t" + p3.getSurto());
        System.out.println(p4.getId() + "\t" + p4.getChegada() + "\t" + p4.getSurto());
        System.out.println("---------------------------------------------");
    }

    public void calcularTempoEspera() {
        int tempoEsperaP1 = 0;
        int tempoEsperaP2 = p1.getSurto();
        int tempoEsperaP3 = p1.getSurto() + p2.getSurto();
        int tempoEsperaP4 = p1.getSurto() + p2.getSurto() + p3.getSurto();

        double tempoEsperaMedio = (tempoEsperaP1 + tempoEsperaP2 + tempoEsperaP3 + tempoEsperaP4) / 4.0;

        System.out.println("Tempo de espera por processo:");
        System.out.println("P1: " + tempoEsperaP1 + " ms | P2: " + tempoEsperaP2 + " ms | P3: " + tempoEsperaP3
                + " ms | P4: " + tempoEsperaP4 + " ms");
        System.out.println("\nTempo médio de espera: " + tempoEsperaMedio + " ms");
        System.out.println("---------------------------------------------");
    }
}
