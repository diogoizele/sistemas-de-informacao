# Módulo 01 - Conceitos de Lógica Proposicional

### Lógica ➕

A palavra lógica deriva do Grego, _logos_, que significa: pensamento, ideia, conteito, argumento, razão, linguagem racional ou princípio lógico.

- Lógica é a ciência das **leis ideais do pensamento** e a arte de aplicá-las à pesquisa e à demonstração da verdade;
- No dicionário, lógica é a **análise das formas** e **leis do pensamento**.

## Operadores Lógicos 🈺

Na lógica proposicional, existem 5 operadores:

1. [Conjunção](operadores-logicos/conjuncao.md) (∧);
2. [Disjunção](operadores-logicos/disjuncao.md) (∨);
3. [Negação](operadores-logicos/negacao.md) (¬);
4. [Implicação](operadores-logicos/implicacao.md) (→);
5. [Bi-implicação](operadores-logicos/bi-implicacao.md) (↔).

### Tabela Verdade 🍏

Para conferir na íntegra como montar uma tabela verdade - [Clique Aqui](tabela-verdade/README.md).

## Proposição 🗣

Uma proposição é uma sentença afirmativa da linguagem natural, que assume um de dois valores-verdade: verdadeira (V) ou falsa (F).

#### Exemplos de proposições

1. Hoje é segunda-feira;
2. Josue é trabalhador;
3. 1 + 2 = 4;
4. 4 \* 2 = 8;
5. A sede da Unisinos está localizada em São Leopoldo.

#### Exemplos que não são proposições

1. Será que hoje está frio;
2. Bom estudo!
3. Tudo bem com você?
4. 2 + x = 3.

As proposições são geralmente simbolizadas (representação) por uma letra em maiúsculo do alfabeto: _A, B, X, Y..._

As proposições podem ser símples ou compostas, sendo as compostas formadas por proposições simples conectadas através de operadores lógicos.

### Exemplo

- _Hoje é segunda-feira e terá jogo de futebol._

Proposições:

1. A -Hoje é segunda-feira;
2. B -Terá jogo de futebol;
3. e - Expressão do portugês que indentifica o operador de conjunção.

> 🎉 A ∧ B

### Um pouco de história 🧝‍♂️

#### Aristóteles

A lógica teve seu início na Grécia, em 342 a.c. onde Aristóteles, teria sido considerado seu fundador. Aristóteles construiu uma teoria de argumentos, cujo núcleo é a caracterização dos chamados **silogismos** (sistema lógico com duas premissas e uma conclusão).

#### Leibniz

Mais tarde, já no século XV, Gottfied Leibniz cria os conceitos de **Lógica moderna**. Leibniz tinha como base a lógica simbólica e de caráter algébrico, semelhante ao cálculo diferencial, e sua ideia era criar uma "linguagem universal", onde verdadeiro só pode deduzir verdadeiro e essas deduções deveriam ser feitas por manipulação simbólica, sem refeência ao significado "real" dos símbolos.

#### Boole

Um pouco depois, é desenvolvido o primeiro sistema formal para o raciocínio lógico. Foi desenvolvido por Boole, que passou a ser considerado o pai da lógica simbólica. No século XIX começa a ser delineado os **fundamentos da Ciência da Computação**. A lógica de Boole tem por objetivo tornar explícitas as formas de inferência, deixando de lado o conteúdo das verdades que elas possam transmitir.

#### Frege

Em 1879, Gottolob Frege foi o primeiro a formular com precisão a diferença entre **constante** e **variável**. Frege criou também o sistema de representação simbólica que formaliza a estrutura dos enunciados e suas relações - variáveis e quantificadores - para reorganizar sentenças;

#### Hilbert

David Hilbert buscava demonstrar que todas as verdades matemáticas poderiam ser demonstradas dentro de um sistema puramente formal. Em 1900, Hilberte lançou 23 problemas que não tinham solução; particularmente o problema 10.

> **O problema de Hiblert!**
> Consistem em indagar se existe um procedimento mecânico efetivo para determinar se todos os enunciados matemáticos verdadeiros poderiam ser ou não provador, isto é, se eles poderiam ser deduzidos a partir de um conjunto de premissas.
> Hilbert buscava algo como uma máquina que, após alimentada com um enunciado matemático, seria capaz de dizer se ele é falso ou verdadeiro.

#### Gödel

Kurt Gödel mostrou que não pode haver uma sistematização completa na aritmética. _"sou verdadeiro, porém indemonstrável"_. Kurt também indica que um enunciado é logicamente válido se, e somente se, é verdadeiro em todos os modelos da linguagem. As regras de inferência da Lógica de Predicados são completas, isto é, nenuhma nova regra necessária para derivar todas as fórmulas logicamente válidas.

#### Turing

Considerado o **pai da computação**, a revolução do computador iniciou quando Alan Turing tomou conhecimento do Problema de Decisão de Hilbert. Em 1936 Turing introduziu o conceito de **Máquina de Turing** (MT).

> 💡 Máquina de Turing - É um modelo abstrato de um computador, considera aspectos lógicos do seu funcionamento, não tendo sido implementado físicamente por Turing.

### Lógica, Matemática e Computação 🤩

1. Lógica (sintaxe)
   - alfabeto (símbolos);
   - expressões;
   - axiomas;
   - regras de inferência.
2. Matemática (semântica)
   - aritmética;
   - geometria;
   - análise (dados).
3. Computação
   - alfabeto (símbolos);
   - programas;
   - funções e procedimentos
   - algoritmos.

## Lógica Proposicional 🀄

Sistema para representação do conhecimento em termos de sentenças afirmativas (proposições), usando letras e símbolos e os conectivos lógicos entre elas.

- Preocupa-se com a forma, não com o significado - sintaxe, não semântica.

### Lógica de Predicados 📋

É a estrutura interna da proposição que determina a validade de uma inferência usando quantificadores.
