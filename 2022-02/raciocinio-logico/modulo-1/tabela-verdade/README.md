# Montando a Tabela Verdade - Em 3 passos ✔❌

### Proposições Simples

Preposições são informações que podem ser **verdadeiras** ou **falsas**;

A: João é médico
B: Maria não é casada

### Proposições Compostas

São proposições simples, compostas por [conectivos/operadores lógicos](../README.md)

### Conectivos Lógicos

Relembrando a tabela de operadores lógicos:

| Frase           | Nome                          | Símbolo  |
| --------------- | ----------------------------- | -------- |
| e               | Conjunção                     | ∧        |
| ou              | Disjunção (inclusiva)         | ∨        |
| ou ... ou       | Disjunção exclusiva           | <u>∨</u> |
| Se..., então    | Condicional / Implicação      | →        |
| Se e somente se | Bicondicional / Bi-implicação | ↔        |

## 1 - Primeiro Passo

Encontrar o número de linhas da tabela verdade
Para isso, deve-se fazer **2<sup>n</sup>**, onde **n** é a quantidade de proposições simples (letras ou frases diferentes).

Por exemplo:
Uma preposição que possua 2 letras: A e B.

2² = 4 Linhas na tabela verdade

## 2 - Segundo Passo

Distribuir **V** e **F** nas letras (proposições) da tabela, para isso usa-se a **ideia de dobro**.

Por exemplo:

Seguindo o exemplo anterior, com 4 linhas, inicie montando a tabela com a quantidade de linhas encontrada.

1. Montar a tabela com a quantidade de linhas:

| A   | B   |
| --- | --- |
|     |     |
|     |     |
|     |     |
|     |     |

2. Sempre começar o preenchimento de trás para frente. Isso se dá pelo fato de que as proposições utilizam a ordem alfabética.

   Começa-se então com 1, como "passo" para alternar os valores. Ou seja, 1 verdadeiro e 1 falso, alternadamente.

| A   | B - 1 |
| --- | ----- |
|     | V     |
|     | F     |
|     | V     |
|     | F     |

3. A **ideia do dobro** se dá, pois toda vez que trocar de letra, no caso, após preencher a coluna **B**, iniciar os valores de **A**, deve ser dobrado o valor.

   Como inicia-se com 1, dobrando o valor de **B** (1), temos 2 para **A**. O que representará esse valor 2? O passo que alterará os valores - "2 verdadeiros, 2 falsos".

| A -2 | B - 1 |
| ---- | ----- |
| V    | V     |
| V    | F     |
| F    | V     |
| F    | F     |

## 3 - Terceiro e Último Passo

Utiliza-se a **Tabuada Lógica** dos conectivos para encontrar o resultado que é a **Tabela verdade** da preposição composta.

#### Tabuada Lógica 🌟

- _e_ = Tudo **V** dá **V**;
- _ou_ = Tudo **F** dá **F**;
- _ou ... ou_ = Iguais dão **F** - Diferentes dão **V**;
- _se..., então_ = **V** com **F** dá **F**;
- _se e somente se_ = Iguais dão **V** - Diferentes dão **F**.
