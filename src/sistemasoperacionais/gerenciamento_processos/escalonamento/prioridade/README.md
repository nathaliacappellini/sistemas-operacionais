# Escalonador por Prioridade

Esta pasta contém uma implementação do algoritmo de escalonamento de processos por Prioridade em Java.

## Como funciona?

O escalonamento por Prioridade organiza os processos de acordo com um valor de prioridade associado a cada um deles. Processos com prioridade mais alta (menor número) são executados primeiro. Se dois processos tiverem a mesma prioridade, a execução ocorre na ordem de chegada.

Este algoritmo pode ser preemptivo (onde um processo pode ser interrompido caso um de maior prioridade chegue) ou não preemptivo (onde um processo só cede a CPU após sua conclusão). Nesta implementação, usamos a abordagem **não preemptiva**.

## Estrutura do projeto

```bash
/Prioridade
  │── EscalonadorPrioridade.java # Implementação do escalonador por prioridade
  │── Processo.java # Classe que representa um processo
  │── Main.java # Classe principal que executa o escalonador
  │── README.md
  ```

## Como Executar?

1. Compilar:

```bash
javac sistemasoperacionais/algoritmos/prioridade/*.java
```

2. Executar:

```bash
java sistemasoperacionais.algoritmos.prioridade.Main
```

## Referências

- Tanenbaum, A. S. "Modern Operating Systems".

---

<div align="center">Feito por <a href="https://github.com/nathaliacappellini">Nathi</a>.</div>