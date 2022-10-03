public class Principal {

    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();
        double conta = exercicios.calculaCardapio();
        System.out.println("Total: R$ " + conta);
    }
}
