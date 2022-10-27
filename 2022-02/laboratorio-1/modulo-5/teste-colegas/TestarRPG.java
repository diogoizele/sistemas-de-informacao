public class TestarRPG {
    public static void main(String[] args) {
        
        Druida d = new Druida("Radagast", "Humano", "Istari");
        Mago m = new Mago("Gandalf", "Humano", "Istari");
        Guerreiro t = new Guerreiro("Gimli", "Anão", "Erebor");
        
        d.atacar();
        m.atacar();
        t.atacar();
        
    }
}