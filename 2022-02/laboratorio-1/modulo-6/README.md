# Arrays 👔

Arrays são estruturas de dados que permitem armazenar uma coleção de valores do mesmo tipo. Em Java, arrays são objetos, ou seja, são instâncias de uma classe. A classe que representa arrays em Java é a classe `java.lang.Object`.

Arrays também podem ser primitivos, ou seja, armazenarem valores do tipo primitivo, ou armazenarem referências de outros objetos. Arrays primitivos são representados por um tipo de dados primitivo seguido de colchetes `[]`. Arrays de objetos são representados por um tipo de dados de referência seguido de colchetes `[]`.

### Introdução

Até agora, os tipos de dados vistos eram os tipos simples, usados para representar números inteiros, números reais, caracteres etc. As variáveis desse tipo não oferecem facilidade para armazenarmos vários valores na memória ao mesmo tempo. Por exemplo, ao fazer a declaração: `int num`, está sendo alocada memória apenas para um número inteiro.

Com _arrays_ - também conhecidos como vetores e matrizes - pode-se ter, na memória, uma coleção de números inteiros, uma coleção de números reais, etc.

## Array Unidimensional

O array unidimensional, também denominado vetor, é aquele que possui apenas uma dimensão, ou seja, apenas uma linha. Cada elemento na coleção é distinguido do outro por um índice, pois o nome da variável é o mesmo pra todos. Em Java e na maioria das linguagens, esse índice começa sempre em _zero_.

O tamanho do array é **imutável** e é o conteúdo do atributo `length`.

### Declaração

```Java
int[] numeros;
```

- Nessa declaração, a variável números guardará um array de inteiros. O array não foi inicializado, ou seja, não foi alocado espaço na memória para ele, por isso a posição de memória de `numeros` guarda o valor `null`. Para isso, é necessário usar o operador `new`.

### Instanciação

Por serem objetos, os arrays precisam ser instanciados e atribuidos para uma _variável-objeto_, que deve ser declarada do tipo do array para poder referenciá-lo.

A instanciação é realizada pelo operador `new`, o qual aloca memória com a quantidade de posições especificada e preenche todas as posições com um **valor padrão**, dependendo do tipo do conteúdo.

```Java
int[] numeros = new int[10];
```

Após as instanciações e atribuições acima, temos as variáveis na memória referenciando o array.

Após a instanciação, viu-se que o array é alocado na memória, porém sem conteúdo, ou seja, com valores padrões. Deve-se então, preencher o array com os valores, de acordo com sua finalidade.

A origem dos dados também depende da aplicação. É possível obter os dados pelo teclado, de um arquivo em disco, ou eles podem ser gerados pelo próprio programa.

Para isso, usa-se o comando de **atribuição**, atribuindo o valor para cada posição específica do array.

Em java, essa referência para atribuição é feita por meio de um índice, que começa em zero. O índice é colocado entre colchetes após o nome do array.

```Java
int[] numeros = new int[10];

numeros[0] = 10;
numeros[1] = 20;
numeros[2] = 30;
```

Muitas vezes, será necessário percorrer o array inteiro, armazenando ou manipulando dados em todas as posições. Para isso, usa-se um laço de repetição, como o `for` ou o `while`.

```Java

// Gerando valores aleatórios de 1 a 500

for (int i = 0; i < numeros.length; i++) {
    numeros[i] = (int) (Math.random() * 500);
}
```

## Array de Objetos

O array é um objeto e os seus componentes também podem ser objetos, ou seja, podemos ter um objeto que contém uma coleção de objetos.

```Java
Pessoa[] pessoas;
```

Após a declaração acima, tem-se a variável `pessoas` na memória com o valor null, isso é, não está referenciando nenhum array. A declaração só garante que a variável tem a capacidade de referenciar um objeto do tipo declarado.

```Java
Pessoa[] pessoas = new Pessoa[10];
```

Instanciar um array de objetos é como instanciar um array de tipos primitivos, o que muda é o tipo do componente. Após a instanciação, temos na memória um array com capacidade de armazenar as referências de 10 objetos do tipo `Pessoa`.

## Array Bidimensional

Também denominado matriz, tem duas dimensões (as linhas e as colunas).
Cada elemento da coleção é distinguido do outro por dois índices (que indicam a linha e a coluna), pois o nome da variável é o mesmo para todos os elementos.

Em _Java_, esses índices começam sempre em zero e devem ser sempre números inteiros.

### Declaração

```Java
int[][] numeros;
```

- Nessa declaração, a variável números guardará um array de inteiros. O array não foi inicializado, ou seja, não foi alocado espaço na memória para ele, por isso a posição de memória de `numeros` guarda o valor `null`. Para isso, é necessário usar o operador `new`.

### Instanciação

```Java
int[][] numeros = new int[10][10];
```

Após as instanciações e atribuições acima, temos as variáveis na memória referenciando o array.

Após a instanciação, viu-se que o array é alocado na memória, porém sem conteúdo, ou seja, com valores padrões. Deve-se então, preencher o array com os valores, de acordo com sua finalidade.

### Atribuição

```Java
int[][] numeros = new int[10][10];

numeros[0][0] = 10;
numeros[0][1] = 20;
numeros[0][2] = 30;
```

Muitas vezes, será necessário percorrer o array inteiro, armazenando ou manipulando dados em todas as posições. Para isso, usa-se um laço de repetição, como o `for` ou o `while`.

```Java
// Gerando valores aleatórios de 1 a 500

for (int i = 0; i < numeros.length; i++) {
    for (int j = 0; j < numeros[i].length; j++) {
        numeros[i][j] = (int) (Math.random() * 500);
    }
}
```
