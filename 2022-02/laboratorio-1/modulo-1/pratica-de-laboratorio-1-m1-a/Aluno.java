/**
 * Classe Aluno
 * 
 * @author Diogo Izele 
 * @version 16/09/2022
 */
public class Aluno {
    
    // atributos da classe
    private int matricula;
    private String nome;
    private int semestre;
    
    
    /**
     * Método Construtor
     */
    public Aluno(int matricula, String nome) {
        
        this.matricula = matricula;
        this.nome = nome;
        this.semestre = 1;
    }
    
    /**
     * Método aprovado
     * Função: aprova o aluno e altera o semestre do aluno para o próximo semestre
     */
    public void aprovado() {
        semestre = semestre + 1;
    }
    
    /**
     * Método exibeDados
     * Função: exibe dados do aluno
     */
    public void exibeDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Semestre: " + semestre);
    }
}
