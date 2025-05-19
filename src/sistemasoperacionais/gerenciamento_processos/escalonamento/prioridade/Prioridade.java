package sistemasoperacionais.gerenciamento_processos.escalonamento.prioridade;

public class Prioridade {
    private Processo[] processos;

    public Prioridade(Processo[] processos) {
        this.processos = processos;
    }

    public void exibirCabecalhoChegada() {
        System.out.println("-------------------------------------------------");
        System.out.println("Ordem de Chegada dos Processos");
        System.out.println("-------------------------------------------------");
        System.out.println("ID | Chegada | Surto");
    }

    public void executar() {
        System.out.println("\n---------------------------------------------");
        System.out.println("Escalonador de Prioridade funcionando:");
        System.out.println("---------------------------------------------\n");

        // Ordenação dos processos por prioridade (menor valor = maior prioridade)
        for (int i = 0; i < processos.length - 1; i++) {
            for (int j = i + 1; j < processos.length; j++) {
                if (processos[i].getPrioridade() > processos[j].getPrioridade()) {
                    Processo temp = processos[i];
                    processos[i] = processos[j];
                    processos[j] = temp;
                }
            }
        }

        // Execução dos processos conforme prioridade
        for (Processo p : processos) {
            System.out.println("Executando " + p.getId() + " - Prioridade " + p.getPrioridade());
            p.setSurto(0);
            System.out.println("Processo " + p.getId() + " finalizado.\n");
        }
    }
}
