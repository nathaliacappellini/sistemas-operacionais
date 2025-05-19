package sistemasoperacionais.gerenciamento_processos.escalonamento.prioridade;

public class Processo {
    private final String id;
    private int surto;
    private final int prioridade;

    public Processo(String id, int surto, int prioridade) {
        this.id = id;
        this.surto = surto;
        this.prioridade = prioridade;
    }

    public String getId() {
        return id;
    }

    public int getSurto() {
        return surto;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setSurto(int novoSurto) {
        this.surto = novoSurto;
    }

    public void exibirInfo() {
        System.out.println(id + "\t" + prioridade + "\t" + surto);
    }
}
