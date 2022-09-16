# Módulo 01 - Conceitos Básicos de Programação

Estamos acostumados a utilizar diversos sistemas, seja via Web ou sistemas locais (que executam no próprio computador). Você já deve ter percebido que a grande maioria deles possui uma parte de cadastro de usuários, na qual são solicitados alguns dados e algumas mensagens são informadas na tela.

## Os primeiros comandos 🍼

### Comando de atribuição

Este comando atua na memória do computador, armazenando um valor em uma variável. Caso a variável já possua um valor, esse é perdido e o novo valor o sobrescreve.

Em Java:

`<tipo> <nome da variável> = <valor da variável>;`

- `int idade = 20;`
- `double peso = 65.5;`
- `char sexo = 'M';`

o valor da variável também pode receber uma expressão, como no exemplo:

- `int resto = 12 % 5;`

### Saída de dados

A tela é usada como unidade padrão de saída. Os comandos de saída também são conhecidos como **comandos de escrita**.

Na linguagem Java, existem 3 formas básicas de trabalhar com saída de dados:

1. `System.out.print(<O que será exibido>);`
2. `System.out.println(<O que será exibido>);`
3. `System.out.printf(<"formatação">, ...atributos);`

- Na sintaxe 1, exibe os itens e o cursor permanece na mesma linha.
- Na sintaxe 2, exibe os itens e o cursor vai para a próxima linha.
- Na sintaxe 3, é possível especificar o formato (número de casas
  decimais e outros) como os itens devem ser exibidos, aplicando os
  códigos de formatação.
  - `%d` – será substituído por um valor decimal (valores inteiros);
  - `%f` – será substituído por um valor real (%8.2f reservando 8
    posições da tela, das quais 2 serão usadas para as casas
    decimais);
  - `%c` – será substituído por um caractere;
  - `%s` – será substituído por uma cadeia de caracteres.

Alguns caracteres têm um significado especial, dentro de aspas,
nos métodos de saída:

- \n nova linha
- \f nova tela
- \t tabulação

## Classes e Objetos

O conceito de classes e objetos é fundamental para o entendimento
da tecnologia orientada a objetos. Nesse paradigma podemos dizer que
projetar um software é modelar um conjunto de classes e seus
relacionamentos, e uma aplicação em execução consiste em um conjunto
de objetos que se comunicam.

### Objetos

Objetos de software são conceitualmente similares aos objetos do
mundo real: têm estado e comportamento. Um objeto de software
necessita armazenar apenas as propriedades que são relevantes ao
contexto (ou negócio) que está sendo programado. Essas características
são armazenadas em variáveis conhecidas como campos ou atributos (ou
ainda, variáveis de instância) e determinam o estado interno do objeto. O
comportamento (ou funcionalidades) dos objetos de software é expresso
através de métodos.

### Classes

Uma classe é um projeto ou um modelo ou uma especificação que
define um tipo de objeto que pode ser construído. Um objeto, se e quando
criado, é a concretização da especificação.
A classe pode ser comparada a uma receita de bolo. A partir da
receita, podemos confeccionar vários bolos. Outra analogia que pode
esclarecer a diferença é comparar uma classe a uma planta arquitetônica.
A partir da mesma planta, poderemos construir várias casas, em locais
diferentes, com diferentes cores, para diferentes proprietários.

## PDF Programação Orientada a Objetos - Unisinos

Neste documento foi abordada uma breve visão prática e introdutória sobre a programação. Para mais detalhes, incluindo
detalhes sobre a linguagem Java e o paradigma de Orientação a objetos
confira o [PDF](../../programacao-1/modulo-1/Programacao%20orientada%20a%20objetos%20-%20Unisinos.pdf).
