public class TesteFun4Study {
    
    public static void main(String[] args) {
        
        int opcaoCriarCidade = 1;
        int opcaoCriarEstudante;
        
        String menuCriacaoCidade = 
        "\n>>> CADASTRO DE CIDADE <<<\n" +
        "0. Sair da criação de cidade\n" +
        "1. Criar nova cidade";
        
        String menuCriacaoEstudante =
        ">>> CADASTRO DE ESTUDANTE <<<\n" +
        "0. Sair da criação de estudante\n" +
        "1. Criar novo estudante para a cidade ";
        
        while (opcaoCriarCidade == 1) {
            
            System.out.println(menuCriacaoCidade);
            opcaoCriarCidade = Teclado.leInt("\nDigite uma opção: ");
            
            if (opcaoCriarCidade == 0)
                break;
            
            Cidade cidade = criarCidade();
            cidade.exibeDados();
            
            System.out.println(menuCriacaoEstudante + cidade.getDescricao());
            opcaoCriarEstudante = Teclado.leInt("\nDigite uma opção: ");
            
            while (opcaoCriarEstudante == 1) {
                
                if (opcaoCriarEstudante == 0)
                    break;
                
                Estudante estudante = criarEstudante(cidade);
                estudante.exibeDados();
                
                System.out.println(menuCriacaoEstudante + cidade.getDescricao());
                opcaoCriarEstudante = Teclado.leInt("\nDigite uma opção: ");
            }
        }
    }
    
    
    /**
     * Método para simplificar a criação de uma cidade
     * usando a classe Teclado.
     */
    public static Cidade criarCidade() {
        
        return new Cidade(
            Teclado.leInt("\nDigite o código da cidade: "),
            Teclado.leString("Digite a descrição da cidade: "),
            Teclado.leString("Digite a UF da cidade: ")
        );
    }
    
    /**
     * Método para simplificar a criação de um estudante.
     * 
     * O método recebe como parâmetro a cidade a qual o
     * estudante pertence e retorna o próprio estudante.
     */
    public static Estudante criarEstudante(Cidade cidade) {
        
        return new Estudante(
            Teclado.leInt("\nDigite o código do estudante: "),
            Teclado.leString("Digite o nome do estudante: "),
            Teclado.leString("Digite a data de nascimento do estudante: "),
            Teclado.leString("Digite o email do estudante: "),
            Teclado.leString("Digite a senha do estudante: "),
            cidade
        );
    }
    
    /**
     * Método que recebe o estudante como parâmetro
     * e altera a senha do mesmo.
     */
    public static void alterarSenha(Estudante estudante) {
        
        System.out.println("> Alterando a senha do Estudante " + estudante.getNome());
        String senhaAntiga = Teclado.leString("Digite a senha antiga: ");
        String novaSenha = Teclado.leString("Digite a nova senha: ");
        String confirmarSenha = Teclado.leString("Confirme a nova senha: ");
        
        if (senhaAntiga.equals(estudante.getSenha())) 
            if (novaSenha.equals(confirmarSenha)) {
                estudante.setSenha(novaSenha);  
                System.out.println("Senha atualizada com sucesso!");
            } else 
                System.out.println("Erro ao atualizar senha - Novas senhas não conferem");
        else 
            System.out.println("Erro ao atualizar senha - Senha antiga está errada");
        
    }
}