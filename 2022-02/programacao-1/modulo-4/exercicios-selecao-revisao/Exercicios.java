import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicios {

    public void comparaComCem(int n) {
        if (n > 100)
            System.out.println("maior que 100");
        else
            System.out.println("menor que 100");
    }

    public void somaEConfere(int a, int b) {
        int x = a + b;

        if (x > 10)
            System.out.println(x);
    }

    public double calculaCardapio() {
        double conta = 0;

        String cardapio = "Cardápio:\n1. Hambúrguer ...... R$ 9,50" +
                "\n2. Cheeseburguer ... R$ 6,50" +
                "\n3. Fritas .... R$ 2,50" +
                "\n4. Refrigerante .... R$ 5,00" +
                "\n5. Milkshake ........ R$ 8,30\nDigite seu pedido:";
        List opcoesValidas = Arrays.asList(1, 2, 3, 4, 5);
        Scanner leitor = new Scanner(System.in);

        System.out.println(cardapio);
        int pedido = leitor.nextInt();
        System.out.println("Digite a quantidade: ");
        int quantidade = leitor.nextInt();

        while (opcoesValidas.contains(pedido)) {
            switch(pedido) {
                case 1:
                    conta += 9.50 * quantidade;
                    break;
                case 2:
                    conta += 6.50 * quantidade;
                    break;
                case 3:
                    conta += 2.50 * quantidade;
                    break;
                case 4:
                    conta += 5.00 * quantidade;
                    break;
                case 5:
                    conta += 8.30 * quantidade;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println(cardapio);
            pedido = leitor.nextInt();

            if (opcoesValidas.contains(pedido)) {
                System.out.println("Digite a quantidade: ");
                quantidade = leitor.nextInt();
            }
        }

        System.out.println("opção inválida no cardápio\nFIM DO PROGRAMA");
        return conta;
    }
}
