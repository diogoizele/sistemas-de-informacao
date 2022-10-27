public abstract class Personagem
{
    //variáveis de instância
    private String nome;
    private String raca;
    private String reino;
    private String classe;
    
    //Construtor para objetos da classe Personagem
    public Personagem (String n, String ra, String re, String c)
    {
    //inicializa variáveis de instância
    nome = n;
    raca = ra;
    reino = re;
    classe = c;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
    nome = n;
    }
    
      public String getRaca(){
        return raca;
    }
    
    public void setRaca(String ra){
    raca = ra;
    }
    
      public String getReino(){
        return reino;
    }
    
    public void setReino(String re){
    reino = re;
    }
    
     public String getClasse(){
        return classe;
    }
    
    public void setClasse(String c){
    classe = c;
    }
    
    public abstract void atacar();
    
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Reino: " + reino);
        System.out.println("Classe: "+ classe);
    }
}