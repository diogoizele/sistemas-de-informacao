import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main (String[] args) {
        Exercicios exercicios = new Exercicios();
        Scanner leitor = new Scanner(System.in);

        List opcoesValidas = Arrays.asList(1, 2, 3);

        String menu = "1. conta até 300\n2. imprime pares\n3. verifica primo";
        System.out.println(menu);

        System.out.println("Digite uma opção: ");
        int opcao = leitor.nextInt();

        while (opcoesValidas.contains(opcao)) {
             switch(opcao) {
                 case 1:
                     System.out.println("Digite o número que inicia o contador: ");
                     exercicios.contador(leitor.nextInt());
                     break;
                 case 2:
                     System.out.println("Digite o número final: ");
                     exercicios.imprimePares(leitor.nextInt());
                     break;
                 case 3:
                     System.out.print("O número é primo? ");
                     if (exercicios.verificaPrimo(leitor.nextInt())) {
                         System.out.println("Sim");
                     } else {
                         System.out.println("Não");
                     }
                     break;
                 default:
                     System.out.println("Opção inválida!");
             }

             System.out.println(menu);
             System.out.println("Digite uma opção: ");
             opcao = leitor.nextInt();
        }
    }
}
