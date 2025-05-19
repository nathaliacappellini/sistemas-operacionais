package sistemasoperacionais.gerenciamento_processos.escalonamento.roundrobin;

public class Main {
    public static void main(String[] args) {
        Processo P1 = new Processo("P1", 10, 0);
        Processo P2 = new Processo("P2", 25, 1);
        Processo P3 = new Processo("P3", 5, 2);
        Processo P4 = new Processo("P4", 15, 3);

        RoundRobin escalonador = new RoundRobin(P1, P2, P3, P4);

        // Mostrando cabeçalho
        escalonador.exibirCabecalhoChegada();
        P1.exibirInfo();
        P2.exibirInfo();
        P3.exibirInfo();
        P4.exibirInfo();

        // Executando os processos de forma alternada com quantum 4
        escalonador.executar();
    }
}
