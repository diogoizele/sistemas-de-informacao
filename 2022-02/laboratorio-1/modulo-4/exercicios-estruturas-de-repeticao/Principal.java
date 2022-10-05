public class Principal {
    
    public static void main(String[] args) {
    
        
        for (int i = 150; i <= 300; i++)
            System.out.println(i);
            
        
        int soma1a1000 = 0;
        for (int i = 0; i <= 1000; i++) {
            soma1a1000 += i;
        }
        System.out.printf("A soma de 1 a 1000 é %d \n", soma1a1000);
        
        for (int i = 3; i <= 99; i++) {
            if (i % 3 == 0)
                System.out.printf("%d é múltiplo de 3\n", i);
        }
        
        for (int n = 1, fatorial = 1; n <= 10; n++) {
            fatorial = fatorial * n;
            System.out.printf("o fatorial de %d é %d \n", n, fatorial);
        }
        
        for (long n = 1, fatorial = 1; n <= 30; n++) {
            fatorial = fatorial * n;
            System.out.printf("o fatorial de %d é %d \n", n, fatorial);
        }
        
        
        int primeiro = 0;
        int segundo = 1;
        
        while (primeiro <= 100) {
            int auxiliar = segundo;
            segundo= primeiro + segundo;
            primeiro = auxiliar;
            
            System.out.println(primeiro);
        }
        
        int x = 181;
        int y = 0;
        
        if (x % 2 == 0)
            y = x / 2;
        else
            y = 3 * x + 1;
        
        System.out.printf("y = %d\n", y);
    }
}