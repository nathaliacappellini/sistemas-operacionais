package sistemasoperacionais.gerenciamento_memoria.worst_fit;

public class BlocoMemoria {
    public int tamanho;      // Tamanho do bloco de memória
    public boolean livre;    // Indica se o bloco está livre
    public String processo;  // Nome do processo alocado
    
    // Construtor para inicializar o bloco
    public BlocoMemoria(int tamanho) {
        this.tamanho = tamanho;
        this.livre = true;   // Todo bloco começa livre
        this.processo = "";  // Nenhum processo inicialmente
    }
}