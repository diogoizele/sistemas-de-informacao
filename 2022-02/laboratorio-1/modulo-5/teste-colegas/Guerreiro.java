public class Guerreiro extends Personagem
{

    public Guerreiro (String n, String ra, String re)
    {
        super(n, ra, re, "Guerreiro");
    }
        
    public void atacar(){
    System.out.println("Ataque do Guerreiro");
    }
    
}