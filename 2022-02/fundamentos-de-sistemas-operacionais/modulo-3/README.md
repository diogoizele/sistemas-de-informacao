# Módulo 03 - Sincronização de Processos

O compartilhamento de recursos entre processos pode gerar situações indesejáveis. Sendo assim, faz-se necessário o uso de mecanismos de sincronização que garantem a comunicação entre processos concorrentes e o acesso a recursos compartilhados ocorra de forma correta.

### Concorrência em Programas 🔗

- FORK - Inicia a execução de outro programa concorrentemente;
- JOIN - O programa chamador espera o outro programa terminar para continuar o processamento;
- PARBEGIN - Inicia a lista de programas que serão executados paralela e aleatoriamente;
- PAREND - Especifica o ponto de sincronização.

### Problemas de Compartilhamento 🚷

Dois problemas relacionados ao compartilhamento de recursos são:

- Atualização de arquivos compartilhados ao mesmo tempo;
- Cálculos com mesmas variáveis ao mesmo tempo.

Como solução para os problemas de compartilhamento, existem:

- **Exclusão Mútua** (solução mais simples), impedindo que dois ou mais processos acessem o mesmo recurso no mesmo instante, sendo necessário que um espere o término do outro para utilizar.
- **Região Crítica**, aqui apenas parte do código onde é feito o acesso ao recurso é compartilhado. Geralmente utiliza-se um protocolo para entrar ou sair de uma região crítica.

### Problemas de Sincronização

Utilizando a solução de determinados problemas podemos gerar problemas em outras áreas da computação. Logo, uma das soluções que resolvem os problemas de compartilhamento, também é um problema na parte de sincronização.

- Problemas introduzidos pela exclusão mútua;
- Problemas de execução de processos - diferenças de velocidade ou maior tempo de processamento;
- Starvation - Situação onde um processão nunca consegue executar sua região crítica e acessar o recurso compartilhado. Esse problema ocorre quando dois ou mais recursos espera por um mesmo recurso alocado. Caso o sistema escolha o processo aleatoriamente (filas FIFO eliminam esse problema) quando o recurso é liberado, um processo pode nunca ser escolhido. A prioridade também é um fator que deve ser levado em conta, uma prioridade baixa também pode fazer com que um processo nunca seja escolhido.
- Sincronização condicional - Quando um recurso não está pronto para ser utilizado pelo processo, deixando-o no estado de espera até a liberação do recurso. Aqui também está o problema **produtor/consumidor**, em que um processo tenta gravar num _buffer_ e outro tenta ler.

Para os problemas de sincronização existem soluções de Hardware e Software.

### Soluções de Hardware 🎍

- Desabilitar interrupções;
- Instrução _Test-and-set_, nada mais é que uma instrução especial que executa sem interrupção e permite ler uma variável, armazenar seu conteúdo em uma outra área e atribuir um novo valor a essa variável. Assim dois processos não podem manipular uma variável compartilhada ao mesmo tempo (Exclusão mútua).

### Soluções de Software 🧸

Para que funcionem, alguns fatores devem ser levados em conta, sendo eles:

- O número de processadores e o tempo de execução dos processos concorrentes devem ser irrelevantes;
- Um processo que esteja fora de sua região crítica não pode impedir que outro processo entrem em suas próprias regiões críticas;
- Um processo não pode permanecer indefinidamente esperando para entrar em sua região crítica.

#### Solução 1 - Semáfaros

A implementação de semáfaros é a solução mais geral e simples. Consiste em uma variável inteira não negativa que só pode ser manipulada por duas instruções: `DOWN` e `UP` .

É importante destacar a existência de **Mutexes** - _Mutual exclusion smaphores_, onde as intruções `DOWN` e `UP funcionam como protocoles de entrada e saída. Logo, valores maiores que 0 indicam recurso liberado e valores iguais a 0 impedem o acesso ao recurso.

#### Solução 2 - Monitores

São mecanismos de sincronização de alto nível que tentam tornar mais fácil o desenvolvimento e correção de programas concorrentes. Somente um processo pode estar executando um dos procedimentos do monitor em um determinado instante.

Implementações de exclusão mútua em monitores é realizada pelo compilador.

A instrução WAIT faz um processo entrar em estado de espera quando uma variável de condição está impedindo a liberação para outros processos e a instrução SIGNAL faz a liberação do recurso pelo processo que o alocou.

### Deadlocks ☠

Um `deadlock` caracteriza uma situação em que ocorre um impasse, onde dois ou mais processos ficam impedidos de continuar suas execuções, ou seja, ficam bloqueados.

Um processo _(A)_ aguarda a liberação de um recurso que está sendo utilizado por outro processo _(B)_, que, por sua vez, aguarda a liberação de outro recurso alocado ou dependente do primeiro processo _(A)_.

Para corrigir, basta eliminar um ou mais processos envolvidos no deadlock e desalocar os recursos já garantidos por eles, dessa forma eliminando a **espera circular**. A escolha de eliminação é feita aleatoriamente ou com base em prioridades.

![Homem aranha -  meme clássico](https://cdn.dicionariopopular.com/imagens/homem-aranha-meme-apontando-1-0.jpg)
