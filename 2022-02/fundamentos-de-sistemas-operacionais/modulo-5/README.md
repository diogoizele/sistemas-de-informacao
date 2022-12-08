# Módulo 05 - Gerenciamento de Arquivos

> 🔎 O **Sistema de Arquivos** é o modo como as informações são armazenadas nos dispositivos físicos de armazenamento, tais como Disco Rígido, disquete, pendrive, etc.

## Arquivos

Os arquivos são constituídos de informações **logicamente relacionadas**, podendo representar um documento, um programa, um banco de dados, etc.

Um arquivo pode ser identificado por um nome, com formato e extensão máxima variando conforme o sistema operacional.

### Organização dos Arquivos

A organização dos arquivos consiste no modo como os dados estão internamente armazenados, podendo, sua estrutura, variar em função do tipo de informação contida no arquivo.

A forma mais simples de organização é usando uma **sequência** não estruturada de _bytes_.

### Métodos de Acesso

**Sequencial**:

- A gravação de novos registros só é possível no final do arquivo.
- Exemplo: Fita magnética

**Acesso Direto**:

- É mais eficiente que o sequêncial.
- Permite leitura/gravação de um reigstro diretamente na sua posição através do **número do registro**, que é a posição relativa ao início do arquivo.
- Não existe restrição quanto à ordem em que os registros são lidos ou gravados, sendo sempre necessário especificar o número do registro.
- Esse método só é possível quando o arquivo é definido com registros de tamanho fixo.

**Acesso Direto + Acesso Sequencial**:

- Possível acessar diretamente um registro qualquer de um arquivo, e, a partir deste, acessar sequencialmente os demais.

**Acesso Indexado ou Acesso por Chave**:

- É o mais sofisticado dos métodos.
- Tem como base o acesso direto.
- O arquivo deve possuir uma área de índice onde existam ponteiros para os diversos registros.
- Quando a aplicação deseja acessar um registro, ela deve primeiro especificar uma chave através da qual o sistema pesquisará, na área de índice, o ponteiro correspondente a partir disso, acessando diretamente o arquivo.

### Operações de Entrada/Saída

- Realizadas através de chamadas de sistema.

### Atributos

Os atributos de um arquivo são informações de controle que descrevem o arquivo, tais como:

- Nome
- Tamanho
- Privilégios de acesso
- Entre outros

## Diretórios

A organização por diretórios é o modo como o **Sistema** organiaza logicamente os arquivos, permitindo que os usuários os acessem de forma mais fácil.

**Nivel Único**:

- Organização mais simples.
- Existe apenas um único diretório contendo todos os arquivos do disco.
- O nível único é bastante limitado, não permitindo que usuários criem arquivos com o mesmo nome.

**Master File Directory (MFD)**:

- Existe um nível de diretório adicional para controlar os diretórios individuais dos usuários.
- Indexado pelo nome do usuário e, nele, cada entrada aponta para o diretório (UFD) pessoal.

**Estrutura de diretórios em árvore**:

- Existe o diretório MFD que é a raíz, os galhos são os UFD e os arquivos são as folhas.
- Cada subdiretório abaixo do MFD pode conter arquivos e novos subdiretórios e assim por diante.
- Quando se referencia um arquivo, é necessário especificar o seu nome, bem como o diretório onde ele se encontra, referência chamada _Path_.
- Mais organizada e adotada pela maioria dos SOs.

## Alocação de Espaço em Disco

O Sistema Operacional possui uma estrutura de dados que armazena informações que possibilitam ao sistema de arquivos gerenciar as áreas ou blocos livres.

Quando um arquivo é eliminado, todos os seus blocos são liberados para a estrutura de espaços livres.

**Mapa de Bits**:

- Forma mais simples de implementar uma estrutura de espaços livres.
- Cada entrada da tabela é associada a um bloco do disco representado por um bit que pode ser 0 (livre) ou 1 (ocupado).

**Lista encadeada**:

- Existe uma lista encadeada de todos os blocos livres do disco.
- Cada bloco possui uma área reservada para o armazenamento do endereço do próximo bloco.
- A partir do primeiro bloco livre pode-se ter acesso sequencial aos demais de forma encadeada.
- Problema: Para se achar espaço livre, o algoritmo deve sempre realizar uma busca sequencial na lista.

**Blocos Contíguos**:

- Blocos contíguos são geralmente alocados ou liberados simultaneamente.
- Enxerga o disco como um conjunto de segmentos de blocos livres.
- Possível manter uma tabela com o endereço do primeiro bloco de cada segmento e o número de blocos livres contíguos que se seguem.

### Alocação Contígua

A alocação contígua consiste em armazenar um arquivo em blocos sequencialmente dispostos, permitindo ao sistema localizar um arquivo através do endereço do primeiro bloco e da sua extensão em blocos. O acesso é feito de maneira simples, tanto para forma sequencial quanto para a direta.

A alocação em um novo segmento livre consiste técnicas para escolha, algumas das principais são:

- **First-fit**: Seleciona o primeiro segmento livre com o tamanho suficiente para alocar o arquivo e a busca é feita sequencialmente, interrompendo assim que um segmento livre for encontrado.
- **Best-fit**: Seleciona o menor segmento livre disponível com o tamanho suficiente para armazenar o arquivo e é necessária a busca em toda a lista, caso esta não esteja ordenada por tamanho.
- **Worst-fit**: Seleciona o maior segmento livre e a busca funciona como no caso anterior.

> 🚨 Um problema na alocação contígua é a **fragmentação dos espaços livres** causado pela criação e eliminação constante de arquivos é que com o tempo surgem espaços vagos sem o tamanho suficiente para se alocar novos arquivos.

A desfragmentação busca solucionar o problema da fragmentação, reorganizando os arquivos no disco de maneira que só exista um único segmento de blocos. A defragmentação é lenta e deve ser realizada periodicamente.

### Alocação Encadeada

Na alocação encadeada um arquivo pode ser organizado como um conjunto de blocos ligados logicamente no disco, independente da sua localização física, sendo que cada bloco possui um ponteiro para o bloco seguinte do arquivo e assim sucessivamente.

> 🚨 O problema da alocação encadeada é que ela só permite o acesso sequencial aos blocos dos arquivos, não possuindo acesso direto aos blocos e desperdiça espaço nos blocos com o armazenamento de ponteiros.

### Alocação Indexada

A alocação indexada soluciona o problema da alocação encadeada, pois permite o acesso direto aos blocos de um arquivo e mantém os ponteiros de todos os blocos de arquivos em uma única estrutura denominada índice.

## Proteção de Acesso

A proteção de acesso aos arquivos visa possibilitar o compartilhamento seguro de arquivos entre usuários, quando desejado. No geral, existe concessão ou não de acessos como leitura, gravação, execução e exclusão.

Existem diferentes mecanismos de níveis de proteção. Alguns deles são:

- **Senha de acesso**: O usuário deve fornecer uma senha para ter acesso ao arquivo.
- **Grupos de usuários**: O arquivo é acessível apenas aos usuários que pertencem a um grupo específico.
- **Lista de controle de Acesso - ACL**: O arquivo é acessível apenas aos usuários que estão na lista de controle de acesso.

## Implementação de Caches

Um dos principais problemas para o desempenho do sistema é que o acesso é bastante lento comparado ao acesso a memória principal (RAM). Para contornar esse problema, são implementados nos sistemas operacionais sistemas de cache.

O **buffer cache** é uma área da memória que armazena informações de disco e busca minimizar o problema de lentidão, pois ao se acessar o disco, se a informação desejada estiver no buffer cache, não será necessário o acesso ao disco. O tamanho do buffer cache é limitado, necessitando políticas para substituição de blocos como **FIFO** ou **Last Recently Used (LRU)**.

A falta de energia pode acarretar perda de dados que foram modificados no cache e não foram atualizados no disco. Neste caso, existem duas possíveis soluções:

- **Solução 1**: Atualizar periodicamente em disco todos os blocos modificados no cache.
- **Solução 2**: Atualizar imediatamente no disco toda a vez que os blocos são modificados no cache.
