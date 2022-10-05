import java.util.Scanner;

public class QuartoExemploFor {
    
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Informe um valor para o empréstimo");
        double emprestimo = Teclado.nextDouble();
        
        System.out.println("informe a quantidade de parcelas para o empréstimo (1 - 12) ");
        int parcelas = Teclado.nextInt();
        
        double valorParcela = emprestimo / (double) parcelas;
        
        for (int contador = 1; contador <= parcelas; contador++) {
            valorParcela += valorParcela * 0.05;
            System.out.printf("O valor da parcela %d é: %4.2f \n", contador, valorParcela);
        }
    }
}