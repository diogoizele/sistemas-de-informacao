# Módulo 03 - Estruturas de Seleção

Os comandos presentes no corpo do método
mostram o que deve ser feito. Cada comando, portanto, é executado de forma
sequencial, da primeira linha em diante.

Em alguns casos, pode-se fazer necessário
executar outro fluxo de comandos, o famoso
**"se" essa condição for verdade execute isso.**

A partir disso, será estudado as estruturas
de seleção e como elas podem alterar a ordem de execução dos comandos.

As linguagens de programação utilizam a
palavra reservada `if`, geralmente seguido de um conjunto de `()`, onde conterão internamente uma lógica booleana.

Por exemplo:

```JAVA
    if (1 == 1) {
        // Executa este bloco
        System.out.println("Executou!");
    }
```

Ao passo em que a condição dentro do `if` resulte em `false`, existe o comando `else` que não é acompanhado por um par
de parênteses por ser uma negação da condição presente no `if`.

```JAVA
    if (condicao1) {
        System.out.println("Executou se condição 1 for true");
    } else {
        System.out.println("Executou se condição 1 for false!");
    }

```

## Expressão relacional ♟

💡 Permite comparar dois valores através de operadores relacionais resultando em `true` ou `false`.

| Operador | Significado      |
| -------- | ---------------- |
| >        | Maior que        |
| <        | Menor que        |
| >=       | Maior ou igual a |
| <=       | Menor ou igual a |
| ==       | Igual a          |
| !=       | Diferente de     |

## Expressão lógica 🧮

Permite comparar dois valores aplicando a
tabela de lógica como os operadores **E**
`&&`, **OU** `||` e **NEGAÇÃO LÓGICA** `!`.
