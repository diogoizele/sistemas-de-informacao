import java.util.*;

public class Teste{
    public static void main(String args[]){
        
        Scanner read = new Scanner(System.in);
        int opcao;
        double real;
        double cotacao;
        boolean controle = true;
        
        while(controle){
            System.out.print("Cambio - Escolha uma Moeda para comprar\n\n");
            System.out.println("1- Dolar");
            System.out.println("2- Euro");
            System.out.println("3- Dolar e Euro");
            System.out.print("\nDigite a opçao escolhida: ");
            opcao = read.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.print("\nDigite o valor em real que deseja trocar/comprar: ");
                    real = read.nextDouble();
                    Dolar d = new Dolar("EUA", 5.2761);
                    d.imprimeDados(real);
                    controle = false;
                    break;
                
                case 2:
                    System.out.print("\nDigite o valor em real que deseja trocar/comprar: ");
                    real = read.nextDouble();
                    Euro e = new Euro("Europa", 5.16);
                    e.imprimeDados(real);
                    controle = false;
                    break;
                    
                case 3:
                    System.out.print("\nDigite o valor em real que deseja trocar/comprar (mesmo valor para ambas as moedas): ");
                    real = read.nextDouble();
                    Euro e2 = new Euro("Europa", 5.16);
                    e2.imprimeDados(real);
                    Dolar d2 = new Dolar("EUA", 5.2761);
                    d2.imprimeDados(real);
                    controle = false;
                    break;
                    
                default:
                    System.out.print("\nOpção inválida. Tente novamente!\n\n");            
            }
        }
    }
}