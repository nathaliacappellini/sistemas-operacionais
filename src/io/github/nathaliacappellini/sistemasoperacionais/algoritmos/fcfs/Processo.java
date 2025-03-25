package io.github.nathaliacappellini.sistemasoperacionais.algoritmos.fcfs;

class Processo { 
    private String id; // Nome do processo
    private int surto; // Período em que um processo utiliza ativamente a CPU
    private int chegada; // Ordem de chegada
    
    public Processo(String id, int surto, int chegada) {
        this.id = id;
        this.surto = surto;
        this.chegada = chegada;
    }
    
    public String getId() {
        return id;
    }
    
    public int getSurto() {
        return surto;
    }
    
    public int getChegada() {
        return chegada;
    }
}