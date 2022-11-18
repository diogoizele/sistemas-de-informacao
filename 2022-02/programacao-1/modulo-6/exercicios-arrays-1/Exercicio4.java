public class Exercicio4 {

    public int quantidadeNegativos(int[] inteiros) {
        int cont = 0;

        for (int i = 0; i < inteiros.length; i++)
            if (inteiros[i] < 0)
                cont++;

        return cont;
    }

    public static void main(String[] args) {

        int[] inteiros = {1, -2, 3, -4, -5, 5, 6, -7, 9};

        Exercicio4 ex4 = new Exercicio4();

        int quantidadeNegativos = ex4.quantidadeNegativos(inteiros);
        System.out.printf("Existem %d números negativos no array de inteiors", quantidadeNegativos);
    }
}
