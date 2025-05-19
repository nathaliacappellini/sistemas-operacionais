# Escalonador Round-Robin (RR)

Esta pasta contém uma implementação do algoritmo de escalonamento de processos Round-Robin (RR) em Java.

## Como funciona?

O Round-Robin é um algoritmo preemptivo que distribui o tempo da CPU em intervalos fixos (quantum). Cada processo é executado por um período determinado (quantum) e, se não finalizar, volta para o final da fila de prontos. Isso garante justiça no escalonamento, evitando que processos longos monopolizem a CPU.

## Estrutura do Projeto

```bash
/RoundRobin
  │── RoundRobin.java # Implementação do escalonador Round-Robin
  │── Processo.java # Classe que representa um processo
  │── Main.java # Classe principal que executa o escalonador
  │── README.md 
```

## Como Executar?

1. Compilar:

```bash
javac sistemasoperacionais/algoritmos/roundrobin/*.java
```

2. Executar:

```bash
java sistemasoperacionais.algoritmos.roundrobin.Main
```

## Referências

- Tanenbaum, A. S. "Modern Operating Systems".

<div align="center">Feito por <a href="https://github.com/nathaliacappellini">Nathi</a>.</div>
