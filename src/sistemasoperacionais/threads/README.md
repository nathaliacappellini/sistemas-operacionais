# Threads - Corrida entre Carros

Esta pasta contém uma implementação de uma simulação de corrida entre carros utilizando threads em Java. Cada carro (representado por uma thread) avança uma distância aleatória até que um dos competidores atinja ou ultrapasse 100 km, sendo declarado o vencedor.

## Como funciona?

Cada carro avança uma distância aleatória entre 1 e 10 km por iteração. A corrida continua até que um carro atinja 100 km, sendo então considerado o vencedor.

## Estrutura do Projeto

```bash
/Threads
  │── Carro.java         # Classe que representa o carro e executa a thread
  │── Main.java          # Classe principal que executa a corrida
  │── README.md
```

## Como Executar?

1. Compilar:

```bash
javac sistemasoperacionais/threads/*.java
```

2. Executar

```bash
java sistemasoperacionais.threads.Carro
```

## Referências

- Tanenbaum, A. S. "Modern Operating Systems".

---

<div align="center">Feito por <a href="https://github.com/nathaliacappellini">Nathi</a>.</div>