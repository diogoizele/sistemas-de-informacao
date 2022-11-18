import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] i = new int[10];

        for (int j = 0; j < i.length; j++) {
            System.out.printf("Insira o %d valor inteiro: ", (j + 1));
            i[j] = reader.nextInt();
        }

        Auxiliar.imprimeArray("i", i);
    }
}
