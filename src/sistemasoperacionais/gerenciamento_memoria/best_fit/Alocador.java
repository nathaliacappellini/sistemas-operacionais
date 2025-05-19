package sistemasoperacionais.gerenciamento_memoria.best_fit;

public class Alocador {
    private BlocoMemoria[] blocos; // Array de blocos de memória

    // Construtor recebe os blocos de memória
    public Alocador(BlocoMemoria[] blocos) {
        this.blocos = blocos;
    }

    // Método para alocar um processo na memória
    public boolean alocarProcesso(String nome, int tamanho) {
        int melhorBloco = -1; // Índice do melhor bloco
        int menorEspaco = Integer.MAX_VALUE; // Menor espaço encontrado

        // Procura o menor bloco que possa acomodar o processo
        for (int i = 0; i < blocos.length; i++) {
            if (blocos[i].livre && blocos[i].tamanho >= tamanho) {
                if (blocos[i].tamanho < menorEspaco) {
                    melhorBloco = i;
                    menorEspaco = blocos[i].tamanho;
                }
            }
        }

        // Se encontrou um bloco válido
        if (melhorBloco != -1) {
            blocos[melhorBloco].livre = false;
            blocos[melhorBloco].processo = nome;
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
