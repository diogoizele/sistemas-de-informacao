import java.util.Scanner;

public class Exercicios {
    
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int opcao = 0;
        
        System.out.println("Menu");
        System.out.println("1. soma");
        System.out.println("2. divide");
        System.out.println("3. verifica triângulo");
        System.out.println("4. verifica idade");
        System.out.println("5. sinaleira");
        System.out.println("6. acha maior");
        
        System.out.println("Selecione a opção desejada: ");
        
        opcao = reader.nextInt();
      
        switch (opcao) {
            
            case 1:  
                
                System.out.println("\nVocê escolheu a função de soma\n");
                System.out.println("Digite um valor inteiro para X: ");
                int x = reader.nextInt();
            
                System.out.println("Digite um valor inteiro para Y: ");
                int y = reader.nextInt();
                
                if (x < 0 || y < 0) 
                    System.out.println("Erro - um dos valores era negativo");
                else 
                    System.out.printf("\nA soma entre %d e %d é %d", x, y, (x + y)); 
                
                break;
            case 2:
            
                System.out.println("\nVocê escolheu a função de divisão\n");
            
                System.out.println("Digite um valor inteiro para X: ");
                x = reader.nextInt();
            
                System.out.println("Digite um valor inteiro para Y: ");
                y = reader.nextInt();
            
                if (x < 0 || y < 0) 
                    System.out.println("Erro - um dos valores era negativo");
                else 
                    System.out.printf("A divisão entre %d e %d é %d", x, y, x / y);
            
                break;    
            case 3:
            
                System.out.println("\nVocê escolheu a função verificar triângulo\n");
            
                System.out.println("Digite um valor inteiro para X: ");
                x = reader.nextInt();
            
                System.out.println("Digite um valor inteiro para Y: ");
                y = reader.nextInt();
            
                System.out.println("Digite um valor inteiro para Z: ");
                int z = reader.nextInt();
                
                if (x != y && y != z && x != z) 
                    System.out.println("Escaleno");
                else if (x == y && y == z && x == z)
                    System.out.println("Equilátero");
                else 
                    System.out.println("Isóceles");
                    
                break;
            case 4:
                
                System.out.println("\nVocê escolheu a função verificar idade\n");
                
                System.out.println("Digite uma idade: ");
                x = reader.nextInt();
                
                if (x < 0)
                    System.out.println("Erro - idade negativa");
                else if (x >= 0 && x <= 12)
                    System.out.println("Criança");
                else if (x >= 13 && x <= 18)
                    System.out.println("Adolescente");
                else if (x >= 19 && x <= 120) 
                    System.out.println("Adulto");
                else 
                    System.out.println("Erro - maior que 120");
                    
                break;
            case 5:
                String AMARELO = "amarelo";
                String VERMELHO = "vermelho";
                String VERDE = "verde";
                
                reader.nextLine(); // limpa o buffer
                
                System.out.println("\nVocê escolheu a função sinaleira\n");
                
                System.out.println("Digite uma cor: ");
                String cor = reader.nextLine();
                
                if (cor.equalsIgnoreCase(VERDE))
                    System.out.println("Sinaleira está Aberta");
                else if (cor.equalsIgnoreCase(AMARELO))
                    System.out.println("Sinaleira está em estado de Atenção");
                else if (cor.equalsIgnoreCase(VERMELHO))
                    System.out.println("Sinaleira está Fechada");
                else 
                    System.out.println("Erro - cor digitada não faz parte das cores da sinaleira");
                
                break;
            case 6:
                
                System.out.println("\nVocê escolheu a função achar o maior\n");
                
                System.out.println("Digite um valor inteiro para X: ");
                x = reader.nextInt();
                
                System.out.println("Digite um valor inteiro para Y: ");
                y = reader.nextInt();
                
                System.out.println("Digite um valor inteiro para Z: ");
                z = reader.nextInt();
                
                int maior = x;
                
                if (maior < y)
                    maior = y;
                
                if (maior < z)
                    maior = z;
                    
                System.out.printf("O maior número é %d", maior);
                
                break;
            default:
                
                System.out.println("Opção inválida - fim do programa!");
        }
    }
}