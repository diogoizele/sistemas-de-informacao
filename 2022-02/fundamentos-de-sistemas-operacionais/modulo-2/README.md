# Módulo 02 - Gerenciamento de Processos

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

> ⚠ A execução de um processo é sequencial.

É importante destacar que, embora dois processos possam ser associados com o mesmo programa, eles são considerado duas sequências de execução separadas, e é comum existirem programas que utilizam muitos processos para sua execução.

O processo é a **unidade de trabalho** em um sistema. Assim, num sistema existe uma coleção de processos próprios do sistema operacional (aqueles que executam código do SO) até processos de usuário (aqueles que executam código do usuário). Todos esses processos podem executar concorrentemente, multiplexando a CPU entre eles.

### Multiplexão

É a divisão de algum serviço oferecido entre vários processos.

### Gerência de processos

O sistema operacional é responsável pelas seguintes atividades relacionadas à gerência de processos:

- Criar e excluir processos de usuários e de sistema;
- Suspender e retomar processos;
- Fornecer mecanismos para a `sincronização` de processos;
- Fornecer mecanismos para a `comunicação` de processos;
- Fornecer mecanismos para o `tratamento de _deadlocks_`.

### Deadlocks ☠

Um `deadlock` caracteriza uma situação em que ocorre um impasse, onde dois ou mais processos ficam impedidos de continuar suas execuções, ou seja, ficam bloqueados.

Um processo _(A)_ aguarda a liberação de um recurso que está sendo utilizado por outro processo _(B)_, que, por sua vez, aguarda a liberação de outro recurso alocado ou dependente do primeiro processo _(A)_.

![Homem aranha -  meme clássico](https://cdn.dicionariopopular.com/imagens/homem-aranha-meme-apontando-1-0.jpg)

**Video aula** | [Process Management (Processes and Threads)](https://www.youtube.com/watch?v=OrM7nZcxXZU)
