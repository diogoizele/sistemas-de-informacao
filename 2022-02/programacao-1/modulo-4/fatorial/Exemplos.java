public class Exemplos {

    public long fatorial1(int n) {
        long fat = 1;
        for (int i = n; i >= 1; i--) {
            fat = fat * i;
        }

        System.out.println("Fatorial:" + fat);

        return fat;
    }

    public long fatorial2(int n) {
        long fat = 1;
        for (int i = n; i >= 1; i--) {
            fat = fat * i;
        }

        return fat;
    }

    public long fatorial3(int n) {
        long fat = 0;
        for (int i = n; i >= 1; i--) {
            fat = fat * i;
        }
        return fat;
    }

    public long fatorial4(int n) {
        long f = 1; long prod;
        for (int i = 1; i <= n; i++) {
            prod = f * i;
            f = prod;
        }

        return f;
    }

    public void exibe(int n) {
        for (int i = n; i>=1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* - ");
            System.out.println();
        }
    }

    public void iteraAlfabeto() {
        for (char c = 'z'; c >= 'a'; c--) {
            System.out.println(c);
        }
    }


    public void geraMultiplosDeTres (int a, int b){
        if ( a < b){
            for (int i = a; i<= b; i++) {
                if (i % 3 == 0)
                    System.out.print(i +" ");
            }//fim for
        }else{
            for (int i = b; i<= a; i++) {
                if (i% 3 == 0)
                    System.out.print(i+" ");
            }//fim for
        }
    }

    public void geraMultiplosDeTres2 (int a, int b) {
        if ( a > b) {
            int guarda = a;
            a = b;
            b = guarda;
        }
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0)
                System.out.print(i +" ");
        }
    }
}
