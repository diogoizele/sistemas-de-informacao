public class Auxiliar {

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

    public static void imprimeArray(String nome, double[] array) {
        String str = "double[] " + nome + " = [ ";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i != array.length - 1)
                str += ", ";
            else
                str += " ]";
        }
        System.out.println(str);
    }

    public static void imprimeArray(String nome, String[] array) {
        String str = "String[] " + nome + " = [ ";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i != array.length - 1)
                str += ", ";
            else
                str += " ]";
        }
        System.out.println(str);
    }

    public static void imprimeArray(String nome, boolean[] array) {
        String str = "boolean[] " + nome + " = [ ";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i != array.length - 1)
                str += ", ";
            else
                str += " ]";
        }
        System.out.println(str);
    }
}
