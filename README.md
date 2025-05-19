# Sistemas Operacionais em Java

Implementações práticas de conceitos de Sistemas Operacionais usando Java.

## 📌 Visão Geral do Projeto

Este repositório contém algoritmos e estruturas fundamentais de Sistemas Operacionais, implementados em Java. O projeto está organizado de forma modular e será continuamente atualizado com novos conteúdos conforme meu aprendizado avança.

## 📃 Estrutura do Projeto

```bash
sistemasoperacionais/  
├── gerenciamento_processos/            
│   ├── escalonamento/                  
│   │   ├── fcfs/                     # First-Come, First-Served
│   │   ├── sjf/                      # Shortest Job First
│   │   ├── roundrobin/               # Round Robin
│   │   └── prioridade/               # Escalonamento por Prioridade
│   └── threads/                      # Exemplos de Threads  
├── gerenciamento_memoria/            # Em desenvolvimento 🚧 
│   ├── best_fit/                                         
│   ├── first-fit/                                         
│   └── worst-fit/                                         
└── README.md          
```

### 📌 Detalhes das Pastas

- Cada algoritmo de escalonamento possui:

  - `Main.java`: Exemplo executável.

  - `Processo.java`: Modelo de processo.

  - Implementação específica (ex: `FCFS.java`).

- Para explicações sobre os algoritmos, consulte o `README.md` dentro de cada subpasta.

## ⚙️ Pré-requisitos

- Java JDK 17+ [Download](https://www.oracle.com/java/technologies/downloads/)

## 🖥 Como Executar

1. Clone o repositório:

> ```bash
> git clone https://github.com/nathaliacappellini/sistemas-operacionais.git
> cd sistemas-operacionais/src/sistemasoperacionais
> ```

2. Exemplo: Executar SJF (Shortest Job First)

> ```bash
> # Navegue até a pasta
> cd gerenciamento_processos/escalonamento/sjf
> 
> # Compile e execute
> javac Main.java && java Main
> ```

## ✨ Contribuições

Contribuições são bem-vindas! Siga essas etapas:

1. **Abra uma issue** para discutir a mudança.

2. **Faça um fork** do projeto e crie um branch:

> ```bash
> git checkout -b feature/nova-implementacao
> ```

3. **Siga o padrão de código existente** (ex: nomes de pastas em minúsculo).

4. **Envie um Pull Request** com uma descrição clara das alterações.

---

<div align="center">Feito por <a href="https://github.com/nathaliacappellini">Nathalia</a>.</div>
