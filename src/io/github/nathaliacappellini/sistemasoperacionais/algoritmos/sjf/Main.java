package io.github.nathaliacappellini.sistemasoperacionais.algoritmos.sjf;

public class Main {
    public static void main(String[] args) {
        Processo p1 = new Processo("P1", 975, 1);
        Processo p2 = new Processo("P2", 3, 2);
        Processo p3 = new Processo("P3", 260, 3);

        SJF.exibirCabecalhoChegada();
        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();

        SJF.ordenarProcessos(p1, p2, p3);
    }
}