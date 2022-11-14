# Módulo 03 - Conceitos da Lógica de Predicados

O estudo sobre sentenças abertas está baseado na Teoria dos Conjuntos. Introduziremos a noção de conjuntos para apresentarmos as sentenças abertas.

Os conteúdos abordados servirão de base para a compreensão da Lógica de Primeira Ordem (Lógica de Predicados).

Além disso, o módulo inclui as relações geradas pelas expressões quantificadas:

- Todo;
- Nenhum;
- Algum.

A Lógica Proposicional é limitada para representarmos todas as sentenças, que são baseadas nas noção da **Teoria dos Conjuntos**.

## Sentenças Abertas

Uma sentença aberta é uma frase que possui "espaços em brancos" que devem ser preenchidos com "coisas" retiradas de algum conjunto predeterminado.

Sentenças abertas podem ser aplicadas a qualquer tipo de **domínio do conhecimento**, porém é comum que essas sentenças sejam exemplificadas e caracterizadas através de **preposições matemáticas**.

### Conjunto-Verdade 😱

Chama-se conjunto-verdade de uma sentença aberta `P(x)` num domínio D o conjunto de todos os elementos x ∈ D tais que `P(x)` é verdadeira.

### Quantificadores - Universal e Existencial

> 💡 Quantificadores são operadores lógicos aplicados a uma variável e a uma expressão (uma sentença aberta simples ou composta).

Os quantificadores foram definidos para capturar conceitos da linguagem natural como:

- Para todo mundo...
- Não tem ninguém aqui que...
- Todos aqui...
- Tem alguém que poderia...
- Qualquer um que...
- Existe pelo menos um de nós...

Estas orações exprimem afirmações que são verdadeiras para vários elementos do domínio. No caso da **lógica de predicados** somente são considerados dois tipos de afirmações sobre vários elementos de um domínio:

- **Afirmações universais**, que devem ser válidas para todos os elementos de um domínio;
- **Afirmações existenciais**, que devem ser válidas para pelo menos um dos elementos do domínio.

Esse tópico inclui as relaçoẽs geradas pelas expressões quantificadas: Todo, Nenhum e Algum. Os conteúdos abordados servirão de base para a compreensão da Lógica de Primeira Ordem (Lógica de Predicados).

### Enunciados Categóricos

Enunciados Categóricos vem a ser uma estrutura mais ou menos, tendo 4 tipos de enunciados:

- Forma A;
- Forma E;
- Forma I;
- Forma O.

Exemplificando a ideia de quantificadores, o domínio A é o conjunto deas pessoas. Temos os predicados e as sentenças:

- **E(x) representa que "x é um estudante"**;
- **I(x) representa que "x é inteligente"**;
- **B(x) representa que "x é bagunceiro"**;
- **I representa Luke**;
- **b representa Bart**.

1. Todos os estudantes são inteligentes.

Para todo x, se x é estudante, então x é inteligente. Utilizamos neste caso a Forma A.

2. Bart é um estudante bagunceiro.

Neste exemplo, não estamos falando de todos os estudantes, também não estamos falando de alguns estudantes, estamos dizendo que "BART" é um estudante bagunceiro.

3. Alguns estudantes são bagunceiros. **Luke** é um estudante inteligente. Neste exemplo temos a forma I, a palavra "alguns" representa o quantificador existencial (E). Já a outra sentença fala de "Luke".

---

A lógica proposicional trata das relações lógicas geradas pelo operadores lógicos, ou seja, das expressões "não", "e", "se... então" e "se e somente se". Essas relações são fundamentais, contudo elas dão conta somente da parte lógica. Considera-se uma outra parte da lógica que considera relações lógicas geradas pelas expressões: "todo", "nenhum" e "algum".

> Enunciado categórico é um argumento caracterizado por um quantificador seguido de uma classe de atributos, um elo (ex. verbo) e outra classe de atributos.

### Quantificador Universal

O quantificador universal é usado para representar as afirmações universais, que no Português são expressas por sentenças como:

- Para todo mundo...
- Todos...
- Qualquer um que...

### Quantificador Existencial

O quantificador existencial é usado para representar as afirmações existenciais, que no Português são expressas por sentenças como:

- Tem alguém que poderia...
- Para algum destes...
- Existe pelo menos um de nós...

## Variáveis e Escopo 👾

#### Variável quantificada

Quando um quantificador incide sobre uma variável dentro de uma expressão lógica formada pela composição de sentenças abertas, então se diz que esta variável é **quantificada**.

#### Variável livre

Por outro lado, se uma variável numa dada expressão lógica não tiver nenhum quantificador previamente associada a ela, então se diz que ela é uma **variável livre**.
