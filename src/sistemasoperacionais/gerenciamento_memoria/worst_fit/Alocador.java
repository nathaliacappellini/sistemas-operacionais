package sistemasoperacionais.gerenciamento_memoria.worst_fit;

public class Alocador {
    private BlocoMemoria[] blocos; // Array de blocos de memória

    // Construtor recebe os blocos de memória
    public Alocador(BlocoMemoria[] blocos) {
        this.blocos = blocos;
    }

    // Método para alocar um processo na memória
    public boolean alocarProcesso(String nome, int tamanho) {
        int maiorBloco = -1;        // Índice do maior bloco
        int maiorEspaco = -1;       // Maior espaço encontrado
        
        // Procura o maior bloco disponível
        for (int i = 0; i < blocos.length; i++) {
            if (blocos[i].livre && blocos[i].tamanho >= tamanho) {
                if (blocos[i].tamanho > maiorEspaco) {
                    maiorBloco = i;
                    maiorEspaco = blocos[i].tamanho;
                }
            }
        }
        
        // Se encontrou um bloco válido
        if (maiorBloco != -1) {
            blocos[maiorBloco].livre = false;
            blocos[maiorBloco].processo = nome;
            return true;
        }
        return false;
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
                    i + 1,
                    blocos[i].tamanho,
                    status,
                    blocos[i].processo);
        }
    }
}
