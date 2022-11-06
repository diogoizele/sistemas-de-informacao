# Módulo 02 - Argumentos válidos ✔

> 💡 É possível verificar a validade de um argumento através da construção da **tabela-verdade** e/ou através do método de **Dedução Natural**, processo baseado na aplicação de regras de inferência e regras de equivalência.

### Lógica Proposicional

- proposição;
- operadores lógicos;
- fórmulas;
- tabela-verdade;
- simbolização de sentenças;
- construção de argumentos.

> 💡 Caso a _tabela-verdade_ tenha uma instância onde as hipóteses/premissas são verdadeiras e a conclusão for falsa, então o argumento será inválido.

## Argumentos 🗣

> Um argumento é um conjunto de fórmulas, nas quais uma delas - **conclusão** - é consequência das outras - **hipóteses**.

Ao afirmar que uma proposição lógica é verdadeira em razão de (ou em consequência de) outras proposições lógicas também serem verdadeiras, se está, na verdade, expressando um **argumento lógico** ou simplesmente, **argumento**.

Um argumento pode ser sempre verdadeiro, quando a proposição que é a **conclusão** do argumento sempre for verdadeira e quando as demais proposições que compões o argumento (chamadas de **hipóteses** ou **premissas**) forem verdadeiras, havendo nesse caso, um argumento **válido**.

Um argumento pode ser representado de **forma simbólica** pela seguinte fórmula da Lógica Proposicional:

- _P1 & P2 & P3 & ... & Pn -> Q_

As proposições P1 a Pn são as **hipóteses** ou **premissas** do argumento, A proposição _Q_ é a conclusão do argumento. Se tratando de Linguagem Natural, esse tipo de simbolismo pode ser lido como:

-_"P1, P2, ... Pn **acarretam** Q"_ ou -_"Q **decorre** de P1, P2, ... Pn"_ ou -_"Q se **deduz** de P1, P2, ... Pn"_ ou ainda -_"Q se **infere** de P1, P2, ... Pn"_

A conclusão _Q_ somente poderá ser considerada uma _conclusão lógica_ das hióteses P1, P2, ... Pn se e somente se a verdade das proposições P1, P2, ... Pn implicar na verdade _Q_.

### Importante ⚠

Uma interpretação ingênua do argumento abaixo poderia pressupor que se houver uma situação que as **premissas são verdadeiras** e a **conclusão também é verdadeira**, isso seria suficiente para considerar o argumento como correto ou apropriado.

Apenas quando a fórmula:

- _P1 & P2 & P3 & ... & Pn -> Q_

For sempre verdadeira (tautologia).
O problema com a interpretação ingênua é que ela poderia assumir como válido um argumento como:

- _A & B -> C_

Onde _A_ representa "um dia tem 24 horas", _B_ representa "bananas são frutas" e C represente "hoje é depois de ontem". Embora as três sentenças sejam verdadeiras e portanto, nesse caso, _A & B -> C_ seja verdadeiro, não existe uma **relação formal** (ou real) entre elas e portanto não se pode dizer que um argumento na forma tão genérica de _A & B -> C_ seja sempre válido, ou seja, verdadeiro, independentemente do valor verdade das hipóteses ou da conclusão.

**Conclusão** - Portanto, pode-se definir que um **argumento válido** é um argumento onde a fórmula:

- _P1 & P2 & P3 & ... & Pn -> Q_

É uma tautologia.

A seguinte expressão simboliza um argumento válido:

- _P1, P2, P3, …, Pn ⊢ Q_

Essa expressão afirma que a fórmula Q é logicamente implicada pelas hipóteses P1, P2, P3, ..., Pn, ou seja, há uma **relação de consequência lógica** entre as hipóteses e a conclusão do argumento.

🚨 Em um argumento válido não interessam os _valores-verdade_ das hipóteses nem da conclusão, porque somente a forma do argumento é capaz de garantir sua validade. Por isso ele é denominado **argumento formal** e esta é a razão por trás do poder de dedução da lógica formal, que pode verificar a validade ou correção de um argumento sem se ater às proposições que o compõem, isto é, sem se importar com seu significado.

## Tabela-verdade para argumentos 📥

Um argumento é válido se e somente se todas as suas instâncias são válidas. **Uma instância é válida se todas as premissas forem verdadeiras e a conclusão também for verdadeira**. A validade de um argumento da Lógica Proposicional pode ser testada através de uma versão simplificada da tabela-verdade, onde são colocadas em colunas separadas todas as premissas do argumento e na coluna final é colocada a conclusão do argumento.

### Termos que indicam conclusão

- PORTANTO;
- LOGO;
- ASSIM SENDO;
