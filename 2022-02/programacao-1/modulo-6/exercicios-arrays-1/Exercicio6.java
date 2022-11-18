public class Exercicio6 {

    public static boolean[] converteParaBoolean(int inteiros[]) {
        boolean booleanos[] = new boolean[inteiros.length];

        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i] > 0)
                booleanos[i] = true;
            else
                booleanos[i] = false;
        }

        return booleanos;
    }

    public static void main(String[] args) {

        int inteiros[] = {1, -2, 3, -4, 5, 6, -7, 8, 9};
        Auxiliar.imprimeArray("inteiros", inteiros);
        Auxiliar.imprimeArray("booleanos", converteParaBoolean(inteiros));
    }
}
