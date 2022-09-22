public class TesteFun4Study {
    
    public static void main(String[] args) {
        
        System.out.println("\nCADASTRE DUAS CIDADES\n");
        
        System.out.println("> Cidade 1");
        Cidade c1 = criarCidade();
        c1.exibeDados();
        
        System.out.println("> Cidade 2");
        Cidade c2 = criarCidade();
        c2.exibeDados();
        
        System.out.println("\nCADASTRE QUATRO ESTUDANTES\n");
        
        System.out.println("> Estudante 1");
        Estudante e1 = criarEstudante(c1);
        e1.exibeDados();
        alterarSenha(e1);
        
        
        System.out.println("\n> Estudante 2");
        Estudante e2 = criarEstudante(c1);
        e2.exibeDados();
        alterarSenha(e2);
    
        
        System.out.println("\n> Estudante 3");
        Estudante e3 = criarEstudante(c2);
        e3.exibeDados();
        alterarSenha(e3);
        
        System.out.println("\n> Estudante 4");
        Estudante e4 = criarEstudante(c2);
        e4.exibeDados();
        alterarSenha(e4);

    }
    
    
    /**
     * Método para simplificar a criação de uma cidade
     * usando a classe Teclado.
     */
    public static Cidade criarCidade() {
        
        return new Cidade(
            Teclado.leInt("Digite o código da cidade: "),
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
            Teclado.leInt("Digite o código do estudante: "),
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