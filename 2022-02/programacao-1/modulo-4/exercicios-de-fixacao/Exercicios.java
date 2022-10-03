public class Exercicios {

    public void contador(int x) {
        for (int i = x; i <= 300; i++)
            System.out.println(i);
    }

    public void imprimePares(int x) {
        for (int i = 0; i <= x; i += 2)
            System.out.println(i);
    }

    public boolean verificaPrimo (int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
