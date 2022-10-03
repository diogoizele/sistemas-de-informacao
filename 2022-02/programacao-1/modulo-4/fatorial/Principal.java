public class Principal {

    public static void main(String[] args) {

        Exemplos e = new Exemplos();

        e.fatorial1(5);
        System.out.println(e.fatorial3(5));
        System.out.println(e.fatorial2(5));
        System.out.println(e.fatorial4(5));

        e.exibe(5);

        e.iteraAlfabeto();

        e.geraMultiplosDeTres(1, 10);
        e.geraMultiplosDeTres(10, 1);


        e.geraMultiplosDeTres2(1, 10);
        e.geraMultiplosDeTres2(10, 1);
    }


}
