package sistemasoperacionais.gerenciamento_memoria.first_fit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Criando scanner
        
        // Solicitando número de partições
        System.out.print("Quantas partições de memória? ");
        int numParticoes = scanner.nextInt();
        
        // Criando array de blocos
        BlocoMemoria[] memoria = new BlocoMemoria[numParticoes];
        
        // Preenche os tamanhos das partições
        for (int i = 0; i < numParticoes; i++) {
            System.out.print("Tamanho da partição " + (i+1) + ": ");
            int tamanho = scanner.nextInt();
            memoria[i] = new BlocoMemoria(tamanho);  // Cria novo bloco
        }
        
        Alocador alocador = new Alocador(memoria);  // Cria o alocador
        
        // Solicita número de processos
        System.out.print("\nQuantos processos deseja alocar? ");
        int numProcessos = scanner.nextInt();
        
        // Tenta alocar cada processo
        for (int i = 0; i < numProcessos; i++) {
            System.out.print("Tamanho do processo P" + (i+1) + ": ");
            int tamanho = scanner.nextInt();
            
            // Tenta alocar e mostra mensagem de erro se falhar
            if (!alocador.alocarProcesso("P" + (i+1), tamanho)) {
                System.out.println("Erro: P" + (i+1) + " não pode ser alocado!");
            }
        }
        
        alocador.mostrarMemoria();  // Exibe resultado final
        scanner.close();  // Fecha o scanner
    }
}
