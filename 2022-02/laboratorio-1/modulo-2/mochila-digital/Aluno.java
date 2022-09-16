public class Aluno {

//Attributes

    private int cdAluno;
    private String primeiroNome;
    private String sobrenome;

    private int idade;
    private String curso;

 

//Constructor

    public Aluno(int cdAluno, String primeiroNome, String sobrenome, int idade, String curso) {
        this.cdAluno = cdAluno;
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.curso = curso;
    }

   public Aluno(){

   };

//Methods

    public String nomeCompleto() {
        return this.primeiroNome + ' ' + this.sobrenome;
    }
    
    public void dadosAluno(){
         System.out.println("Dados Aluno");
        System.out.println("nome: " + this.nomeCompleto() );
        System.out.println("idade: " + this.idade);
        System.out.println("curso: " + this.curso);
    }

 

//Getters and Setters

    public int getCdAluno() {
        return cdAluno;
    }

    public void setCdAluno(int cdAluno) {
        this.cdAluno = cdAluno;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}