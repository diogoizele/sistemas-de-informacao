public class Exercicio1 {

    public static void imprimeArray(String nome, int[] array) {
        String str = "int[] " + nome + " = [ ";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i != array.length - 1)
                str += ", ";
            else
                str += " ]";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int[] array1 = new int[10], array2 = new int[10], array3 = new int[10];
        int[] array4 = new int[11];

        int aux = 1;
        int inicial = 3;

        for (int i = 0; i < 10; i++) {
            // a)
            array1[i] = 10 - i;

            // c)
            if (i < 5)
                array3[i] = i + 1;
            else
                array3[i] = (i - 4) * 10;

            // b)
            array4[i] = i * i;
            if (i == 9)
                array4[10] = (i + 1) * (i + 1);

            // d)
            array2[i] = inicial; // O array recebe o inicial
            inicial += aux; // o inicial, passa a receber ele mesmo + aux
            aux = aux + 2; // o auxiliar controla o fato do padrão ser IMPAR
        }

        imprimeArray("array1", array1);
        imprimeArray("array2", array2);
        imprimeArray("array4", array4);
        imprimeArray("array3", array3);
    }
}
