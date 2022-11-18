# Módulo 06 - Arrays

### Introdução

Os tipos de dados vistos até agora foram os tipos simples, usados para representar números inteiros, reais, caracteres etc. As variáveis destes tipos não oferecem facilidade para armazenarmos vários valores na memória ao mesmo tempo.

> Com _arrays_ (também conhecidos como vetores e matrizes), podemos ter, na memória, uma coleção de números inteiros, reais, e até mesmo uma coleção de objetos.

- Arrays são objetos que permitem ao programador armazenar diversas variáveis do **mesmo tipo**.
- Cada item do array é chamado **elemento**.
- Os elementos de um array são associados em uma **posição numérica**, ou seja, indexados.

```Java
String[] letras = new String[5];

letras[0] = "A";
letras[1] = "B";
letras[2] = "C";
letras[3] = "D";
letras[4] = "E";
```

- O array letras é instanciado com 5 posições. A posição 0 é a primeira posição do array e a posição `tamanho - 1` é a última posição do array, nesse caso a posição 4.
- A **declaração** indica ao compilador que existe um array de determinado tipo e com determinado nome.
- A **instanciação** cria o array na memória, indicando o número de elementos que ele terá, através da sintaxe: `new int[10]` - isso criará um array do tipo inteiro com 10 posições.
- Quando um array é criado, JAVA cria uma variável chamada **length**, que possui o tamanho do array, e é acessada da seguinte manteira: `letras.length` - nesse caso, o valor de `letras.length` é 5 - `<nome do array>.length`.

> 💡 Quando um array é criado, suas posições são automaticamente inicializadas com valores pré-determinados pelo JAVA (0 para números, false para booleanos, null para objetos, etc).

### Inicialização - Forma alternativa

```Java
String[] letras = {"A", "B", "C", "D", "E"};
```

Ao declarar e inicializar um array de objetos, cada posição comporta-se como uma variável normal, ou seja, **deve ser inicializada**.

- Os elementos do array são, então, acessados através de seus índices, que são números inteiros que indicam a posição do elemento no array.

```Java
String[] letras = {"A", "B", "C", "D", "E"};

System.out.println(letras[0]); // A
System.out.println(letras[1]); // B
System.out.println(letras[2]); // C
System.out.println(letras[3]); // D
System.out.println(letras[4]); // E
```

### Complemento

- **Complemento - PDF** | [Classificação seleção direta, com troca](Sort.pdf)
- **Complemento - PDF** | [Classificação troca simples (Bubble sort)](Bubble.pdf)
