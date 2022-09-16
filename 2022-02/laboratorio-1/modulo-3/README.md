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
- `import Java.util`

## Desafio

Dadas as seguintes informações:

### Contexto do problema (a equipe utilizou a técnica de cenário e personas para entender o problema)

Lucas está iniciando o seu curso de Engenharia Elétrica em uma das melhores
Universidades privadas do Brasil. Ele tem 17 anos e mora em uma cidade do interior e,
tanto ele como todos da sua família estão muito felizes por esta oportunidade. Porém,
Lucas também está muito ansioso pois nunca estudou em uma modalidade EaD. Além disso,
como ele é bastante tímido, está preocupado em não conseguir fazer amigos nesta
modalidade de estudo. Ele sabe que conhecer novas pessoas pode ser uma ótima opção para
ajudá-lo a avançar o seu conhecimento durante os seus estudos.

### Entendimento do problema

1. Quem são os usuários?

- Alunos ingressantes na Universidade na modalidade EaD

2. Qual é a principal atividade do usuário?

- Estudar

3. Quando e onde ele realiza a atividade?

- Principalmente em casa

4. Quais problemas percebidos na realização da atividade?

- Dificuldade de se concentrar nas atividades acadêmicas, visto que seu principal ambiente de estudo é em casa.
- Pouco conhecimento da área de estudo.
- Grande expectativa do aluno e da família com a oportunidade.
- Não tem amigos fazendo a mesma atividade.

### Visão do projeto

1. Quais são as principais dificuldades do usuário?

- Timidez e Relacionamento com novos colegas.
- Não conhece nada sobre o curso que está iniciando.
- Tem muita preocupação com o seu desempenho acadêmico.
- O ambiente de estudo (em casa) tem bastante distração.

2. Quais são as necessidades do usuário?

- Precisa de algo para auxiliar na concentração durante os estudos.
- Também precisa de algo para facilitar o contato com os colegas do curso que têm os mesmos interesses para aprendizado colaborativo.

3. Como podemos melhorar a experiência do usuário?

- Projetar um ambiente EaD que utilize as tecnologias para auxiliar o estudante na realização de suas atividades e também para aproximar os estudantes com base nos mesmos interesses estimulando a criação de grupos de estudos online durante o semestre.
