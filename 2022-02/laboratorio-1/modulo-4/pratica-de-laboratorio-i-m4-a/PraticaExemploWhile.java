import java.util.Scanner;

// classe de teste
public class PraticaExemploWhile {
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        double saldo = 600;
        
        System.out.println("Informe um valor para retirada: ");
        double retirada = Teclado.nextDouble();
        
        while (retirada > saldo) {
            System.out.println("Saldo indisponível para este valor de retirada");
            
            System.out.println("Informe um novo valor para retirada: ");
            retirada = Teclado.nextDouble();
        }
        
        saldo = saldo - retirada;
        
        System.out.println("Seu novo saldo é: " + saldo);
    }
}