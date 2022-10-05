/**
 * Objetivo: Objeto de pesquisa que solicita ao novo aluno a descrição do curso que ele gostaria de realizar 
 * e qual o seu orçamento estimado por semestre;
 Assim, será possível determinar o curso ideal para o seu perfil; 
 Ainda, possibilita que ele possa alterar o valor e a descrição da pesquisa a qualquer tempo para nova análise;
 * Aluna: Júlia Perini
 * versão 2 (30/09/22)
 * Na versão 2, é possível selecionar a modalidade do curso da pesquisa: graduação, pós-graduação, doutorado ou mestrado;
 */

public class Pesquisa2
{
    //atributos
    private int codigoPesquisa;
    private String nomeAluno;
    private String descricaoCurso;
    private double valorEstimado;
    private char modalidade;
    
    //método construtor
    public Pesquisa2(int codPesq, String nomA, String descC, double valEs, char mod)
    {
    codigoPesquisa = codPesq;
    nomeAluno = nomA;
    descricaoCurso = descC;
    valorEstimado = valEs;
    modalidade = mod;
    }

    //métodos get
    public int getCodigoPesquisa(){
    return codigoPesquisa;
    }
    
    public String getNomeAluno(){
    return nomeAluno;
    }
    
    public String getDescricaoCurso(){
    return descricaoCurso;
    }
    
    public double getValorEstimado(){
    return valorEstimado;
    }
    
    //método set - Alterar a descrição do curso
    public void setDescricaoCurso (String novaDesc){
    descricaoCurso = novaDesc;
    }
    
    //método set - Alterar valor estimado
    public void setValorEstimado (double novoVal){
    valorEstimado = novoVal;
    }
    
    //Método para retornar modalidade escolhida para a pesquisa
    public String retornaModalidade(){
        if (modalidade == 'G')
            return "graduação";
        else if (modalidade == 'P')
            return "pós-doutorado";
        else if (modalidade == 'M')
            return "Mestrado";
        else if (modalidade == 'D')
            return "Doutorado";
        else
            return "Opção não encontrada, digite: G - graduação,  P - Pós-graduação, M - Mestrado ou D -Doutorado";            
    }
    
    //método exibir dados
    public void exibeDados(){
    System.out.println ("Codigo da pesquisa: "+codigoPesquisa);
    System.out.println ("Aluno: "+nomeAluno);
    System.out.println ("Descrição 1 do curso: " +descricaoCurso);
    System.out.println ("Modalidade: " +modalidade);
    System.out.println ("Valor estimado por semestre: "+valorEstimado);
    }
}