package sistemasoperacionais.gerenciamento_processos.escalonamento.roundrobin;

public class Processo {

    private final String id;
    private int surto;
    private final int tempoChegada;

    public Processo(String id, int surto, int tempoChegada) {
        this.id = id;
        this.surto = surto;
        this.tempoChegada = tempoChegada;
    }

    public String getId() {
        return id;
    }

    public int getSurto() {
        return surto;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public void setSurto(int novoSurto){
        this.surto = novoSurto;
    }

    public void exibirInfo() {
        System.out.println(id + "\t" + tempoChegada + "\t" + surto);
    }
}