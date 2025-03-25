# Sistemas Operacionais em Java

## 📌 Visão Geral do Projeto

Este repositório contém implementações em Java dos conceitos estudados em Sistemas Operacionais. O projeto está organizado em pastas temáticas e será continuamente atualizado com novos conteúdos conforme meu aprendizado avança.

## 🗂 Estrutura do Projeto

```bash
sistemasoperacionais/
├── algoritmos/
│   ├── fcts/
│   ├── FCFS.java              
│   ├── Main.java               
│   ├── Processo.java           
│   ├── sjf/
│   │   ├── Main.java           
│   │   ├── Processo.java       
│   │   └── SJF.java            
│   └── (Futuros: Round Robin, Prioridades)
├── threads/
│   ├── Carro.java              
│   └── MainCarro.java          
└── README.md                  
```

## 🚀 Funcionalidades Implementadas

### Threads - Simulação de Corrida

- Demonstração básica de concorrência com threads

- Cada carro é uma thread competindo em uma corrida

### Algoritmos de Escalonamento

#### FCFS (First-Come, First-Served)

- Implementação do algoritmo não-preemptivo mais simples

- Cálculo de tempos de espera

#### SJF (Shortest Job First)

- Versão não-preemptiva do algoritmo

- Ordenação de processos por tempo de execução

## 💻 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/nathaliacappellini/sistemas-operacionais.git
```

2. Navegue até a pasta do algoritmo desejado:

```bash
cd src/sistemasoperacionais/algoritmos/sjf
```

3. Compile e execute:

```bash
javac Main.java && java Main
```

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:

- Reportar issues

- Sugerir melhorias

- Enviar pull requests com novas implementações

---

<div align="center">Feito por <a href="https://github.com/nathaliacappellini">Nathi</a>.</div>
