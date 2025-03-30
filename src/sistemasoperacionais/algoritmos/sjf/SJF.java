package sistemasoperacionais.algoritmos.sjf;

public class SJF {
    
    public static void exibirCabecalhoChegada() {
        System.out.println("---------------------------------------------");
        System.out.println("Ordem de Chegada de Processos");
        System.out.println("---------------------------------------------");
        System.out.println("ID | Chegada | Surto");
    }
    
    public static void ordenarProcessos(Processo p1, Processo p2, Processo p3) {
        // Cria array com os processos
        Processo[] processos = {p1, p2, p3};
        
        // Ordenação 
        for (int i = 0; i < processos.length; i++) {
            for (int j = i + 1; j < processos.length; j++) {
                if (processos[i].getSurto() > processos[j].getSurto()) {
                    Processo temp = processos[i];
                    processos[i] = processos[j];
                    processos[j] = temp;
                }
            }
        }
        
        // Exibe cabeçalho
        System.out.println("\n---------------------------------------------");
        System.out.println("Processos ordenados em execução - SJF");
        System.out.println("---------------------------------------------");
        System.out.println("ID | Chegada | Surto");
        
        // Exibe processos ordenados
        for (int i = 0; i < processos.length; i++) {
            processos[i].exibirInfo();
        }
    }
}