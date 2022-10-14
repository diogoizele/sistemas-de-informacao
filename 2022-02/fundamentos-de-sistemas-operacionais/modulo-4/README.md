# Módulo 04 - Gerenciamento de Memória

### Gerência de Memória

O gerente de memória é um componente do Sistema operacional, que pode estar contido inteira ou parcialmente no kernel, que tem a função de alocar memória principal para os processos e gerenciar a hierarquia da memória. Suas tarefas são:

- Garantir o isolamento mútuo entre processos (proteção);
- Manter registradas as áreas de memória em uso;
- Alocar memória RAM para novos processos (`fork()`);
- Fazer _swapping_ transparente entre memória principal e memória secundária.
- manter o mapeamento da memória virtual para a física;
- Implementar política de alocação de memória para processos.

> Lei de Parkinson: _"Programas sempre aumentarão de tamanho, demandando toda memória disponível."_

### Realocação e Proteção

São dois problemas introduzidos pela **Multiprogramação**:

- **Realocação**: não se sabe, previamente, qual região de memória o processo vai ser executado;
- **Proteção**: evitar que um processo acesse a região utilizada por outro.

Uma solução é o: mapeamento em tempo de execução para a memória física, relativa a dois registradores - **base** e **limite**.

### Registradores Base e Limite

Para cada processo existe um par, _Base Register_ (BR) e _Limit Register_ (LR), que determinam a região de memória usada pelo processo.

A conversão é feita pela MMU, e a cada troca de contexto de processos, o par (BR/LR) precisa ser trocado, chama-se isso de _"memory map"_ do processo.

### Swapping

Em sistemas de tempo compartilhado (_timesharing_), a memória principal pode não ser suficiente para todos os processos.

Por isso, a ideia básica de **swap** é: usar espaço em disco como extensão da memória RAM, fazendo uma **partição de swapping ou paginação**, e colocar lá os processos enquanto estiverem bloqueados por insuficiência na memória, esperando por E/S, e, voltando-os para a memória assim que liberar espaço.

Para essa técnica, existem duas alternativas:

- Copiar a imagem inteira - **swapping**;
- Permitir que parte do processo fique na memória e parte em disco - **paginação**.

Os principais problemas do swapping com partições de tamanho variável é:

- Manter informações sobre espaços não utilizados;
- Evitar _fragmentação externa_ da memória - espaços pequenos não utilizados;
- Alto custo de compactação de memória - na casa dos milisegundos.

> 💡 Fragmentação - Parcela da memória que é desperdiçada devido a imagens de processos não adjacentes.
>
> - **Interna**: quando há partições fixas;
> - **Externa** - quando não há partições.

### Gerenciamento de Espaços Disponíveis

Procura dividir a memória em **unidades de alocação** de _n_ bytes (1KB no Minix) e representar a ocupação (livre/ocupado) de lotes de unidades usando um _bit map_ ou então uma _lista encadeada_.

- **_Bit Map_**: trata-se de um armazenamento compacto e simples, mas a busca por determinado tamanho de lote livre pode envolver análise da várias palavras;
- **_Lista Ligada_**: cada nó contém o endereço inicial e o tamanho de uma partição ocupada ou livre.
