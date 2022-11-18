public class Exercicio7 {

    public static int posicaoDoMaior(int inteiros[]) {
        int maior = inteiros[0];
        int posicao = 0;
        for (int i = 0; i < inteiros.length; i++)
            if (inteiros[i] > maior) {
                posicao = i;
                break;
            }

        return posicao;
    }

    public static void main(String[] args) {

        int inteiros[] = {1, 3, 6, 22, 5};
        System.out.printf("Posicão do maior %d", posicaoDoMaior(inteiros));
    }
}
