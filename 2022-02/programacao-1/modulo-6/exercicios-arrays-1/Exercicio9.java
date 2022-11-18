public class Exercicio9 {

    public static void substituiElementos(int inteiros[]) {
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] % 2 == 0) inteiros[i] = 1;
            else inteiros[i] = -1;
        }
    }

    public static void main(String[] args) {

        int inteiros[] = {1, 2, 4, 6, 7, 8, 9, 10, 11, 12};
        Auxiliar.imprimeArray("inteiros", inteiros);
        substituiElementos(inteiros);
        Auxiliar.imprimeArray("inteiros", inteiros);
    }
}
