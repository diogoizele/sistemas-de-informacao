# Módulo 05 - Herança e Polimorfismo

### Herança 👪

Além da associação (uma classe possuir outra classa como atributo), outro tipo de relacionamento que pode ocorrer com as classes é a **herança**.

Uma classe pode **herdar** comportamentos (atributos e métodos) de outra classe. Nesses casos, a classe pai é chamada **superclasse**, e possui um carater mais genérico, enquanto a classe "filha" é chamada de **subclasse**, e possui um carater mais específico.

> 💡 A herança deve ser usada quando: _todos os objetos da subclasse também são objetos da superclasse_.

A função da herança é evitar a repetição de código, uma vez que esse mecanismo é usado para projetar classes que possuem comportamento e características em comum. A abordagem consistem em projetar uma hierarquia de classes em que a superclasse (a classe que figura no topo da hierarquia) defina a parte comum, e cada subclasse herde essa parte comum e acrescente o comportamento e o conhecimento específicos a sua natureza.

> 💡 Um termo usado para se referir à uma classe que herda outra é **_estender_**. _"Uma classe estende outra"_.

> ❓ Em Java, cada classe que não estende especificamente outra classe, é automaticamente uma subclasse da classe _Object_. Logo, cada classe estende a classe _Object_ (do pacote java.lang), direta ou indiretamente.

### UML 📊

Os relacionamentos de **herança** entre as classes pode ser visualizados usando as setas não pintadas. Essas setas, portanto, representam um relacionamento _é um_. Por exemplo, _Cachorro **é um** Animal_.

Ao usar herança, os **construtores** da superclasse não são herdados pela subclasse. A subclasse deve oferecer seus próprios construtores. Mas aqueles atributos que foram herdados devem ser configurados pelo construtor da superclasse. Então, **o construtor da subclasse deve chamar o construtor da superclasse**.

> 💡Esse comando de chamada deve ser o primeiro comando do construtor da subclasse e ele é feito através da chamada do médoto `super(attrib1, attrib2...);` sendo `attrib`, os atributos que o construtor da **superclasse** necessita.

### Polimorfismo 💠

É o mecanismo ao qual: chama-se métodos com a **mesma assinatura, mas comportamentos diferentes**, usando a mesma variável objeto, e sem determinar, em tempo de compilação, a qual subclasse ou superclasse o objeto pertence.

Para que o polimorfismo funcione, deve-se declarar uma variável objeto cujo tipo é a superclasse, pois essa variável pode referenciar tanto objetos da superclasse como de qualquer subclasse.

> 💡 A identificação correta de qual método deverá ser invocado é realizada pela **JVM**, que verifica qual é o objeto real que a variável está referenciando, para acionar o método adequado.

### _Upcasting_ e _Downcasting_ 🍕

- **Upcasting** é realizado automaticamente pelo compilador: ocorre quando atribui-se um objeto da subclasse a uma variável da superclasse.

```JAVA
    Pessoa p = new Cliente(); // onde Cliente estende Pessoa
```

- **Downcasting** não é automaticamente realizado pelo compilador: deve ser especificado pelo programador quando precisar chamar um método exclusivo da subclasse com uma variável da superclasse. Ao tentar chamar o método _fazCompra_, que é exclusivo da classe Cliente, usando a variável `p`, que é do tipo Pessoa, obtem-se um **erro**. Portanto, para realizar o **downcasting**, é necessário "informar" ao compilador que `p` está apontando para um cliente e não para uma pessoa.

```JAVA
    ((Cliente)p).fazCompra();
```

### Classe abstratas 🧽

Chama-se de abstrata, a classe que não pode ser instanciada. É uma classe que existe, unicamente, para ser herdada. Ela reúne as características comuns de todas as subclasses.

As classes que não são abstratas, são chamadas de **classes concretas**, e essas são utilizadas para instanciar objetos. Elas também fornecem a implementação de todos os seus métodos (ou herdam a implementação).

Quando a classe é declarada abstrata ela pode ter um ou mais de seus métodos também abstratos, isso é, sem implementação. Isso permite adiar a implementação (dos métodos) para a subclasse concreta. Por isso, a declaração de um método como abstrato exige a sua sobrescrita na subclasse concreta. Se uma classe estende outra que tem método abstrato e não o implementa, então ela também é considerada abstrata e deve ser declarada como tal, ou ocorrerá um erro de compilação.

> 💡 Em Java, coloca-se a palavra-chave `abstract` antes da palavra class, indicando que é uma classe abstrata. Em se tratando de métodos abstratos é a mesma coisa, usa-se a palavra-chave `abstract` antes do tipo de retorno do método. Em UML, usa-se o itálico para nomes de classes e métodos abstratos, bem como a expressão `<abstract>` também pode se fazer presente.
