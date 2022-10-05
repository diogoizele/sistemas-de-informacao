import java.util.Scanner;

// classe de teste
public class TerceiroExemploDoWhile {
    
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        
        double saldo = 600;
        
        char opcao;
        
        do {
            
            System.out.println("Informe um valor para retirada: ");
            double retirada = Teclado.nextDouble();
            
            
            while (retirada > saldo) {
                System.out.println("Saldo indisponível para este valor de retirada.");
                
                System.out.println("Informe um novo valor para retirada: ");
                retirada = Teclado.nextDouble();
            }
            
            saldo -= retirada;
            
            System.out.println("Seu novo saldo é: " + saldo);
            
            System.out.println("Deseja fazer uma nova operação (S/N): ");
            opcao = Teclado.next().charAt(0);
            
        } while (Character.toLowerCase(opcao) == 's');
    }
}