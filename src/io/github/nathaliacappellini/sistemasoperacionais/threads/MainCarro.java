package io.github.nathaliacappellini.sistemasoperacionais.threads;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Carro 1");
        Carro carro2 = new Carro("Carro 2");
        Carro carro3 = new Carro("Carro 3");
        Carro carro4 = new Carro("Carro 4");

        System.out.println("===============================");
        System.out.println("Corrida de carros de Thread");
        System.out.println("===============================");

        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();
    }
}