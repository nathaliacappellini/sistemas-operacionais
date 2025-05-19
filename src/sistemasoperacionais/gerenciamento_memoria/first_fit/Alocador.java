package sistemasoperacionais.gerenciamento_memoria.first_fit;

public class Alocador {
    private BlocoMemoria[] blocos;  // Array de blocos de memória
    
    // Construtor recebe os blocos de memória
    public Alocador(BlocoMemoria[] blocos) {
        this.blocos = blocos;
    }
    
    // Método para alocar um processo na memória
    public boolean alocarProcesso(String nome, int tamanho) {
        // Percorre todos os blocos
        for (int i = 0; i < blocos.length; i++) {
            // Verifica se o bloco está livre e cabe o processo
            if (blocos[i].livre && blocos[i].tamanho >= tamanho) {
                blocos[i].livre = false;   // Marca como ocupado
                blocos[i].processo = nome; // Associa o processo
                return true;               // Alocação bem sucedida
            }
        }
        return false; // Se não encontrou espaço
    }
    
    // Método para mostrar o estado da memória
    public void mostrarMemoria() {
        System.out.println("\nEstado da Memória:");
        // Cabeçalho da tabela
        System.out.println("-------------------------------------");
        System.out.println("Bloco | Tamanho | Status   | Processo");
        System.out.println("-------------------------------------");
        
        // Percorre cada bloco para exibir informações
        for (int i = 0; i < blocos.length; i++) {
            String status = blocos[i].livre ? "Livre  " : "Ocupado";
            System.out.printf("%5d | %7d | %s | %s%n", 
                i+1, 
                blocos[i].tamanho, 
                status, 
                blocos[i].processo);
        }
    }
}
