# Módulo 05 - Herança e Polimorfismo

## Herança

> 💡 **Herança** é uma relação **é um** - _Classe Específica **é um** Classe Genérica_

É uma técnica de programação, utilizada principalmente para reutilizar código. A partir de uma classe mais genérica, cria-se classes mais especializadas que **herdam** comportamentos - atributos e métodos - da classe genérica.

![Herança-imagem](https://www.researchgate.net/publication/349182437/figure/fig2/AS:989911003967490@1613024583970/Class-diagram-and-inheritance.png)

Na herança, a classe mais genérica é chamada de **classe-pai**, **classe-mãe** ou **superclasse**, e a classe mais específica é chamada de **classe-filha** ou **subclasse**.

Ao implementar o mecanismo de herança em Java, deve-se atentar para o construtor da **subclasse**. A primeira linha do construtor da subclasse é a chamada do método super, recebendo os parâmetros do construtor da **superclasse**.

```JAVA
public class Mamifero extends Animal {

    public Mamifero(String atrib1, String atrib2, int atrib3) {
        super(atrib1, atrib2); // método super para "chamar" o construtor de Animal
    }
}

```

### Upcasting

É realizado automaticamente pelo compilador e ocorre ao atribuir um objeto da **subclasse** em uma variável da **superclasse**.

### Downcasting

Não é realizado automaticamente pelo compilador, portanto deve ser especificado pelo programador quando precisar chamar um método exclusivo da **subclasse** com uma variável da **superclasse**.

Então, o **downcasting** é feito ao informar ao compilador que a referência do tipo **superclasse** está apontando para um valor do tipo da **subclasse**.

Analise a implementação a seguir da superclasse Pessoa e da subclasse Cliente.

```JAVA
public class Pessoa {}

public class Cliente extends Pessoa {

    public void fazCompra(double valor) {
        //...
    }
}

Pessoa p = new Cliente();


// Exemplo de Downcasting
((Cliente)p).fazCompra(15.6);
```
