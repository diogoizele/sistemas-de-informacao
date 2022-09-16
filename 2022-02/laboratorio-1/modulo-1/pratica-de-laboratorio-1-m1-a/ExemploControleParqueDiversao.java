public class ExemploControleParqueDiversao {
    public static void main(String args[]) {
        
        // declarar e atribuir valor para as constantes
        final int IDADE_MINIMA = 12; // tipo de dado primitivo - número inteiro
        final double VALOR_CARTAO = 15.0;
        
        // declarar e atribuir valor as variáveis:
        int qtdeAcessos = 15;
        int idade = 20;
        double valorBrinquedo = 5.9;
        
        // calcular o quanto seria gasto se comprasse os acessos para cada brinquedo
        double totalSemCartao = qtdeAcessos * valorBrinquedo;
        double totalEconomiaCartao = totalSemCartao - VALOR_CARTAO;
        String statusAcessoBrinquedo = idade >= IDADE_MINIMA ? "Liberado" : "Negado";
        
        // imprimir as mensagens na tela
        System.out.printf("Você economizou: R$ %4.2f.\n", totalEconomiaCartao);
        System.out.printf("Você acessou um brinquedo e agora possui: %d.\n", --qtdeAcessos);
        System.out.printf("Pela sua idade seu acesso ao brinquedo é: %s.\n", statusAcessoBrinquedo);
        System.out.printf("Controle acesso: Idade permitida e ");
        System.out.printf("Possui Acessos: %b.\n", idade >= IDADE_MINIMA && qtdeAcessos > 0);
    
    }
}