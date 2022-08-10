public class Principal {
    
    public static void main(String[] args) {
        
        System.out.println("JOALHERIA OLIMPO");
        System.out.println("Cadastro de clientes");
        
        String primeiroNome = Teclado.leString("Primeiro nome: ");
        String sobrenome = Teclado.leString("Sobrenome: ");
        char sexo = Teclado.leChar("Sexo: (M/F)");
        String cpf = Teclado.leString("CPF: ");
        System.out.println("Data de nascimento:");
        int dia = Teclado.leInt("Dia: ");
        int mes = Teclado.leInt("Mês: ");
        int ano = Teclado.leInt("Ano: ");
        double salario = Teclado.leDouble("Salário (valor bruto):");
        float taxaMaximaDeJuros = (float) Teclado.leDouble("Digite a taxa máxima de juros que deseja pagar em uma compra: ");
        boolean possuiCasaPropria = Teclado.leBoolean("Cliente possui casa própria em seu nome: (true/false)");
        
        System.out.println("\n\nCadastro efetuado com sucesso!");
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
        System.out.println("Sexo: " + sexo);
        System.out.println("***." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-**");
        System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
        System.out.println("Salário bruto: R$ " + salario);
        System.out.println("Taxa máxima de Juros: " + taxaMaximaDeJuros + "%");
        System.out.println("Cliente possui casa própria? " + possuiCasaPropria);
    }
}