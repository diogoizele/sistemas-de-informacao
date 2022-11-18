public class Exercicio5 {

    public static int quantasVezesAparece(int inteiros[], int buscado) {
        int cont = 0;
        for (int i = 0; i < inteiros.length; i++)
            if (inteiros[i] == buscado) cont++;

        return cont;
    }

    public static void main(String[] args) {

        int inteiros[] = {1, 2, 647, 3, 4, 647, 647, 8, 647, 647};
        int buscado = 647;

        System.out.printf("O número %d aparece um total de %dX na lista", buscado, quantasVezesAparece(inteiros, buscado));
    }
}
