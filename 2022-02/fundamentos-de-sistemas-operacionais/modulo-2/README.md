# Módulo 02 - Gerenciamento de Processos

### Introdução 🤿

Um programa não faz nada a não ser que suas instruções sejam executadas por uma CPU.
Um processo pode ser considerado um programa em execução.

Um programa de usuário executando em tempo compartilhado é um processo. Um processador de texto (_Microsoft Word_) executado por um usuário individual em um PC é um processo. Uma tarefa de sistema, como enviar saída para uma impressora também é um processo.

Pode-se considerar um processo como um _job_ ou programa de tempo compartilhado, que necessita de determinados recursos como:

- Tempo de CPU;
- Memória;
- Arquivos;
- Dispositivos de E/S.

Esses recursos são fornecidos ao processo em sua criação ou alocados durante sua execução.

### Programa ou Processo 🤺

Um programa por si só não é um processo, pois, é considerado uma **entidade passiva**,
com conteúdo de arquivo armazenado em disco.

Enquanto um processo é considerado uma **entidade ativa**, possuindo um contador de programa especificando a próxima instrução a ser executada.

### Estados de um processo 🧫

1. **Ativo** (ou executando), quando estiver fisicamente ocupando a CPU;
2. **Pronto**, quando estiver apenas esperando por uma chance de ocupar a CPU (geramente num pool de jobs);
3. **Em espera** (ou bloqueado), quando estiver esperando pela ocorrência de algum evento externo que o permita ficar esperando apenas pela CPU;
4. **Inativo** (ou morto), quando não estiver executando.

A passagem de um processo de um estado para outro ocorre em determinadas circunstâncias que são:

1. **Pronto** para **Ativo**: quando o dispatcher escalonar o processo;

2. **Ativo** para **Pronto**: quando o dispatcher decidir que outro processo deve ocupar a CPU (por estouro do tempo de CPU, por exemplo);

3. **Ativo** para **Em espera**: quando o processo solicitar uma operação de entrada/saída ou for bloqueado por algum semáforo (ou outro mecanismo de bloqueio);

4. **Ativo** para **Inativo**: quando o processo for retirado da memória ou terminar sua execução;

5. **Inativo** para **Pronto**: quando o scheduler trazer o processo do disco para a memória;

6. **Em espera** para Pronto: quando a operação de E/S for completada ou o processo for desbloqueado.

### PCB - Bloco de controle do processo 🎮

Para guardar as informações relacionadas às próximas instruções de um processo, o SO utiliza essa **tabela de processos**, e nele armazena:

- Identificador do processo (`PID`)
- Prioridade;
- Estado atual;
- Instante de criação;
- tempo acumulado de execução
- Recursos alocados - conteúdo dos registradores da CPU;
- Endereços na memória;
- Pilha;
- Informações sobre o programa em execução.

> ⚠ A execução de um processo é sequencial.

É importante destacar que, embora dois processos possam ser associados com o mesmo programa, eles são considerado duas sequências de execução separadas, e é comum existirem programas que utilizam muitos processos para sua execução.

O processo é a **unidade de trabalho** em um sistema, sendo responsável pela manutenção de todas as informações necessárias à execução de um programa, como conteúdo de registradores e espaço na memória.

Assim, num sistema existe uma coleção de processos próprios do sistema operacional (aqueles que executam código do SO) até processos de usuário (aqueles que executam código do usuário). Todos esses processos podem executar concorrentemente, multiplexando (dividindo serviços) a CPU entre eles.

### Contexto de Hardware 💪

- Constitui-se do conteúdo de registradores;
- A _troca de um processo por outro na CPU_, pelo sistema operacional, é denominada **mudança de contexto**;
- Mudança de contexto salva o conteúdo dos registradores da CPU, carregando-os com os valores referente ao processo que está recebendo a utilização do processador.

### Gerência de processos 🧩

Através das chamadas de sistema _(System calls)_, o sistema operacional gerencia as seguintes atividades relacionadas à gerência de processos:

- Criar e excluir processos de usuários e de sistema;
- Suspender e retomar processos;
- Fornecer mecanismos para a `sincronização` de processos;
- Fornecer mecanismos para a `comunicação` de processos;
- Fornecer mecanismos para o `tratamento de deadlocks`.

### Escalonamento de processos (Schedule) 📑

Para organizar a ocupação da CPU pelos processos **prontos**, usa-se algoritmos de escalonamento que atuam com base em critérios estabelecidos pelo:

- Tipo de processo do sistema;
- Necessidades do usuário;
- Disponibilidade de recursos de _Hardware_.

Esses algorítmos podem ser classificados em duas categorias principais:

1. **Algoritmos sem preempção** - (FCFS - primeiro a chegar primeiro a sair, SJF - primeiro o mais curso, etc). Estes **não permitem** que o processo seja interrompido após assumir o controle da CPU.
2. **Algoritmos com preempção** - (_Round-Robin_, Prioridade, SRTF - primeiro quem falta menos tempo, Filas multinível, etc). Esses algoritmos possibilitam a interrupção do processo em execução, passando a utilização da CPU a outro processo.

De forma geral, os algoritmos com preempção são muito mais eficientes do que os sem preempção por fazer um melhor uso da CPU.

A eficiência desses algoritmos pode ser medida através de:

- Métricas de desempenho;
- Ocupação da CPU;
- `Throughput`(taxa de saída ou vazão);
- Tempos de espera;
- Tempos de execução médios (`turnaround time`).

**Video aula** | [Process Management (Processes and Threads)](https://www.youtube.com/watch?v=OrM7nZcxXZU)

** UFSC - Sistemas Operacionais | Capítulo 8** | [Gerência de Processos](https://www.gsigma.ufsc.br/~popov/aulas/so1/cap8so.html)
