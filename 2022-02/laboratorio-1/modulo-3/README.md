# Módulo 03 - Estruturas de Seleção

Começaremos a falar neste módulo sobre comandos da linguagem de programação que alteram o fluxo do nosso código. O primeiro tipo de comando que veremos é o de seleção, que pode ser realizado de diferentes formas, dependendo de como nosso programa está estruturado e do que se espera dele.

### Classe de Teste

Uma classe de teste nada mais é que uma classe qualquer dotada do método `main`.

- `public static void main(String[] args) {}`

Essa classe irá conter todos os comandos necessários para chamar os métodos da classe que queremos testar.

- Os métodos só são executados quando são chamados.
- O construtor só é executado quando for acionado pela palavra reservada `new`.

## Biblioteca Java

| Pacote       | Finalidade                                                                    |
| ------------ | ----------------------------------------------------------------------------- |
| `java.io`    | Entrada e saída de dados.                                                     |
| `java.lang`  | Classes fundamentais à programação Java. Entre muitas, String, Math e Object. |
| `java.sql`   | Acesso a banco de dados.                                                      |
| `java.text`  | Formatação de texto datas e números.                                          |
| `java.util`  | Classes utilitárias. Entre muitas, _Scanner_.                                 |
| `java.swing` | Interface gráfica com o usuário.                                              |

- O pacote Java.lang contém as classes básicas para a programação Java e não precisa ser explicitamente importado pois já é feito automaticamente.
- Para realizar o import utilizamos `import <nome do pacote>`
- Por exemplo `import Java.util`

### Classe Scanner 🪀

Importação da biblioteca `import java.util.Scanner;`

A classe `scanner` permite a leitura de
uma informação através do teclado do console.

Em resumo:

- `nextInt();` para ler um valor do tipo int
- `nextFloat();` para ler um valor do tipo float
- `nextDouble();` para ler um valor do tipo double
- `nextChar();` para ler um valor do tipo character
- `nextLine()` para ler um valor do tipo String

Depois de fazer o import, o primeiro passo é fazer a instanciação da classe: `Scanner reader = new Scanner(System.in);`
