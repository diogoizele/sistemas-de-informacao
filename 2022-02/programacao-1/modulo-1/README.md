# Módulo 01 - Conceitos Básicos de Programação

Ao começar a estudar programação, se faz necessário conhecer alguns aspectos fundamentais sobre o funcionamento dos computadores e das linguagens de programação.

**Vídeo |** [O que a maioria das escolas não te ensinam](https://www.youtube.com/watch?v=nKIu9yen5nc)

Existem conceitos básicos sobre lógica de programação. Utilizando os comandos que atuam nas unidades básicas de um computador: a unidade de entrada, a unidade de saída e a memória.

### O que é um computador? 🤔

Um computador é uma máquina constituída por uma combinação
de componentes eletrônicos e que pode ser programada. A parte física é
denominada hardware. Para que essa máquina seja útil, ela deve ser
dotada de software, que são os programas.

### Unidades básicas de um computador

Basicamente, a **arquitetura** dos computadores modernos é baseada
na arquitetura proposta por [**Von Neumann**](https://pt.wikipedia.org/wiki/John_von_Neumann) há aproximadamente meio
século. A principal característica dessa arquitetura era o armazenamento de
programas no mesmo espaço de memória que os dados. A máquina de
Von Neumann tinha cinco unidades básicas:

- Unidade Central de Processamento (UCP/CPU)
- Unidade Lógica Aritmética (ULA/ALU)
- Unidade de Controle
- Unidade de Entrada e Saída (E/S ou I/O)
- Memória Principal (RAM)

### Unidade mínima de informação

A unidade mínima de informação é o **\*BI**naryDigi**T\*** ou popularmente conhecido como **bit**. O valor de um bit pode ser 0 ou 1, por isso, também pode ser conhecido como dígitos binários.

O conjunto de 8 bits representam 1 byte, portanto:

- 1 byte = 8 bits
- 1 KB (kilobyte ou kbyte) = 2^10 = 1024 bytes
- 1 MB (megabyte) = 2^20 = 1 KB \* 1 KB = 1.048.576 bytes
- 1 GB (gigabyte) = 2^30 = 1 KB \* 1 MB = 1.073.741.824 bytes
- 1 TB (terabyte) = 2^40 = 1 KB \* 1 GB = 1.099.511.627.776 bytes

O computador funciona sob o controle de um programa
armazenado, executando instrução por instrução. Tanto a sequência de
instruções como os dados estão na forma binária.

### Desenvolvimento de Software 🧩

A programação é uma das últimas fases do desenvolvimento de um
software, pois antes da programação deve-se analisar e projetar a
solução.
O software deve surgir como resposta às necessidades do mundo
real e deve atender adequadamente a essas necessidades.

### Paradigmas de Programação

Considerando que paradigma é a forma de organizar e visualizar o
conjunto de programas que constitui o software, então o paradigma
adotado é que determina a forma como abstrair e, consequentemente,
desenvolver o software.

### Orientação a Objetos

A Programação Orientada a Objetos (POO), ou ainda, em inglês, Object-
Oriented Programming (OOP), é um paradigma baseado na
modularização em unidades de software, chamadas classes.

A partir das classes são criados objetos que, em tempo de execução,
interagem e cooperam entre si.

### O que é um Programa de Computador?

Para escrever um programa necessita-se de uma linguagem de
programação. A única linguagem entendida pelo computador é a
linguagem de máquina, muito difícil para o ser humano,
pois tudo é especificado usando apenas os dígitos binários (0s e 1s).

Devido a essa limitação, foram criadas as chamadas linguagens
de alto nível, que são facilmente entendidas pelas pessoas. O
programador escreve o programa em uma linguagem de alto nível
(programa-fonte ou código-fonte) e o programa é traduzido para a
linguagem de máquina (programa-objeto ou código-objeto) para que o
computador possa executá-lo.

Essa tradução é realizada por um software denominado compilador,
que gera instruções correspondentes, na linguagem de máquina, de um
processador específico.

Cada linguagem de programação de alto nível deve ter o seu
compilador para uma determinada arquitetura, já que diferentes compiladores/montadores são
construídos para as diferentes arquiteturas de processadores, pois
diferentes famílias de processadores possuem conjuntos distintos de
instruções.

### Como é programar em Java? 🐗

O compilador da linguagem Java não gera código para um
processador específico, mas sim para uma máquina virtual Java
(conhecida como Java Virtual Machine – JVM). Os programas escritos em
Java são, portanto, portáveis sobre todas as plataformas para as quais
existir uma implementação da JVM.

O programa-fonte é criado em um editor e armazenado em um
arquivo com a extensão `.java`. O compilador lê o arquivo `.java` e traduz o
programa fonte em bytecodes e armazena em um arquivo com a extensão
`.class`. O carregador lê o arquivo `.class` e carrega os bytecodes na memória.

Finalmente, a máquina virtual executa o
programa, seguindo as ações especificadas pelos bytecodes, que nada
mais são do que os comandos codificados pelo programador, porém na
linguagem da máquina.

### Comandos

Comandos ou instruções são as ordens dadas ao computador para
que este realize as tarefas especificadas pelo programador.
