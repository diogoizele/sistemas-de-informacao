import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double d[] = new double[10];

        for (int i = 0; i < d.length; i++) {
            System.out.printf("Insira o %d valor double: ", (i + 1));
            d[i] = reader.nextDouble();
        }
    }
}
