package sistemasoperacionais.gerenciamento_processos.escalonamento.prioridade;

public class Main {
    public static void main(String[] args) {
        Processo P1 = new Processo("P1", 10, 3);
        Processo P2 = new Processo("P2", 25, 1);
        Processo P3 = new Processo("P3", 5, 4);
        Processo P4 = new Processo("P4", 15, 2);

        Processo[] processos = { P1, P2, P3, P4 };

        Prioridade escalonador = new Prioridade(processos);
        escalonador.exibirCabecalhoChegada();
        P1.exibirInfo();
        P2.exibirInfo();
        P3.exibirInfo();
        P4.exibirInfo();

        escalonador.executar();
    }
}
