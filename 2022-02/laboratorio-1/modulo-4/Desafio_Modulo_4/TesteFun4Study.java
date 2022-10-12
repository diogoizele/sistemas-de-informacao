public class TesteFun4Study {
    
    public static void main(String[] args) {
        
        final int QUANTIDADE_MINIMA_ESTUDANTES = 4; // Uso de uma constante para auxiliar em uma possível alteração do valor 
        
        int opcaoCriarCidade = 1; // Opção de criar cidade inicializa com o valor 1 para a primeira execução do programa
        int opcaoCriarEstudante;
        int opcaoAlterarEstudante;
        int opcaoConfirmarAlteracaoEstudante;
        
        /**
         * Criação dos menu como Strings para reutilização
         * e maior controle das opções atuais e possíveis
         * futuras
         */
        
        String menuCriacaoCidade = 
        "\n>>> CADASTRO DE CIDADE <<<\n" +
        "0. Sair da criação de cidade\n" +
        "1. Criar nova cidade";
        
        String menuCriacaoEstudante =
        ">>> CADASTRO DE ESTUDANTE <<<\n" +
        "0. Sair da criação de estudante\n" +
        "1. Criar novo estudante para a cidade ";

        String menuConfirmarAlteracaoEstudante = 
        "\nDeseja alterar algum dado do estudante?\n" +
        "0. não\n" +
        "1. sim\n";
        
        String menuAlteracaoEstudante =
        "\nEscolha um atributo para alterar:\n" +
        "1. Código\n" +
        "2. Nome\n" +
        "3. Data de nascimento\n" +
        "4. Email\n" +
        "5. Senha\n";
        
        while (opcaoCriarCidade == 1) {
            
            System.out.println(menuCriacaoCidade);
            opcaoCriarCidade = Teclado.leInt("\nDigite uma opção: ");
            
            if (opcaoCriarCidade == 0)
                break;
            
            Cidade cidade = criarCidade();
            cidade.exibeDados();
            
            System.out.println(menuCriacaoEstudante + cidade.getDescricao());
            opcaoCriarEstudante = Teclado.leInt("\nDigite uma opção: ");
            
            while (opcaoCriarEstudante == 1 || cidade.getQuantidadeEstudantes() < QUANTIDADE_MINIMA_ESTUDANTES) {
                
                /**
                 * Mensagem que avisa ao usuário caso falte
                 * estudantes, e quantos estudantes faltam
                 */
                if (cidade.getQuantidadeEstudantes() < QUANTIDADE_MINIMA_ESTUDANTES && opcaoCriarEstudante == 0) 
                    System.out.printf("Você precisa cadastrar no mínimo mais %d estudantes\n", QUANTIDADE_MINIMA_ESTUDANTES - cidade.getQuantidadeEstudantes() );
                
                if (opcaoCriarEstudante == 0 && cidade.getQuantidadeEstudantes() >= QUANTIDADE_MINIMA_ESTUDANTES)
                    break;
                
                Estudante estudante = criarEstudante(cidade);
                estudante.exibeDados();
                
                System.out.println(menuConfirmarAlteracaoEstudante);
                opcaoConfirmarAlteracaoEstudante = Teclado.leInt("\nDigite uma opção: ");
                
                while (opcaoConfirmarAlteracaoEstudante == 1) {
                    
                    System.out.println(menuAlteracaoEstudante);
                    opcaoAlterarEstudante = Teclado.leInt("\nDigite a opção que deseja alterar: ");
                    
                    switch(opcaoAlterarEstudante) {
                        case 1:
                            estudante.setCodigo(Teclado.leInt("Digite o novo código: "));
                            break;
                        case 2:
                            estudante.setNome(Teclado.leString("Digite o novo nome: "));
                            break;
                        case 3:
                            estudante.setDataNascimento(Teclado.leString("Digite a nova data de nascimento: "));
                            break;
                        case 4:
                            estudante.setEmail(Teclado.leString("Digite o novo e-mail: "));
                            break;
                        case 5:
                            alterarSenha(estudante);
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    
                    estudante.exibeDados();
                    
                    System.out.println(menuConfirmarAlteracaoEstudante);
                    opcaoConfirmarAlteracaoEstudante = Teclado.leInt("\nDigite uma opção: ");
                }
                
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
     * 
     * A função também conta com uma estratégia de RECURSÃO.
     * 
     * Com a recursão, é possível conseguir repetições sem
     * a utilização padrão das estruturas de repetição da
     * linguagem, definido que a função chama a si mesma
     * e definindo também uma condição de parada.
     * 
     * Nesse caso, caso o usuário digite a senha incorretamente,
     * ocorre-rá uma recursão no chamado da função, juntamente
     * com a mensagem de erro especificando o problema.
     */
    public static void alterarSenha(Estudante estudante) {
        
        System.out.println("\n> Alterando a senha do Estudante " + estudante.getNome() + "\n");
        String senhaAntiga = Teclado.leString("Digite a senha antiga: ");
        String novaSenha;
        String confirmarSenha;
        
        if (senhaAntiga.equals(estudante.getSenha())) {
            
            novaSenha = Teclado.leString("Digite a nova senha: ");
            confirmarSenha = Teclado.leString("Confirme a nova senha: ");
            
            if (novaSenha.equals(confirmarSenha)) {
                estudante.setSenha(novaSenha);  
                System.out.println("Senha atualizada com sucesso!");
            } else {
                System.out.println("Erro ao atualizar senha - Novas senhas não conferem");
                alterarSenha(estudante); // Função recursiva
            }    
        } else {
            System.out.println("Erro ao atualizar senha - Senha antiga está errada");
            alterarSenha(estudante); // Função recursiva
        }
    }
}