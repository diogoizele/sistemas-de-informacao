public class ExemploParqueDiversao {
    public static void main(String args[]) {
        
        // declarar e atribuir valor para constante: IDADE_MINIMA
        final int IDADE_MINIMA = 12; // tipo de dado primitivo - número inteiro
    
        // declarar e atribuir valor as variáveis:
        String seuNome = "Diogo"; // tipo de dado objeto para sequência de caracteres
        char primeiraLetraNome = 'D'; // tipo de dado primitivo para caracter (apenas 1)
        int idade = 20; // tipo de dado primitivo para número inteiro
        double valorBrinquedo = 5.9; // tipo de dado primitivo para número real
    
        // imprimir as mensagens na tela
        System.out.print("Olá ");
        System.out.println(seuNome);
        System.out.printf("A primeira letra do seu nome é: %c. \n", primeiraLetraNome);
        System.out.printf("Sua idade é: %d. ", idade);
        System.out.printf("A idade mínima para acessar este brinquedo é: %d. \n", IDADE_MINIMA);
        System.out.printf("O valor do brinquedo é: R$ %4.2f", valorBrinquedo);
    }
}