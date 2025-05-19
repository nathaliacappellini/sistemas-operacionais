package sistemasoperacionais.gerenciamento_processos.escalonamento.sjf;

public class Processo {
    private final String id;
    private final double surto;
    private final int tempoChegada;

    public Processo(String id, double surto, int tempoChegada) {
        this.id = id;
        this.surto = surto;
        this.tempoChegada = tempoChegada;
    }

    public String getId() {
        return id;
    }

    public double getSurto() {
        return surto;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public void exibirInfo() {
        System.out.println(id + "\t" + tempoChegada + "\t" + surto);
    }
}