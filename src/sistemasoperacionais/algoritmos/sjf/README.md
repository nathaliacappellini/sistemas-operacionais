# Escalonador SJF (Shortest Job First)

Esta pasta contém uma implementação do algoritmo de escalonamento de processos SJF (Shortest Job First) em Java.

## Como funciona?

O **SJF** escalona os processos com base no tempo de execução (surto), executando primeiro o processo com o menor tempo de execução. A ideia é minimizar o tempo médio de espera dos processos. No entanto, ele não lida com a preempção, ou seja, uma vez que o processo é iniciado, ele é executado até o final.

## Estrutura do Projeto

```bash
/SJF
  │── SJF.java # Implementação do escalonador SJF
  │── Processo.java # Classe que representa um processo
  │── Main.java # Classe principal que executa o escalonador
  │── README.md 
```

## Como Executar?

1. Compilar:

> ```bash
> javac sistemasoperacionais/algoritmos/sjf*.java
> ```

2. Executar:

> ```bash
> java sistemasoperacionais.algoritmos.sjf.Main
> ```

## Referências

- Tanenbaum, A. S. "Modern Operating Systems".

---

<div align="center">Feito por <a href="https://github.com/nathaliacappellini">Nathi</a>.</div>
