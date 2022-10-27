public class Teste {
    
    public static void main(String[] args) {
        
        Mamifero m1 = new Mamifero("Tigre", "Laranja", 250, 4, false);
        Mamifero m2 = new Mamifero("Baleia", "Azul", 28000, 0, true);
        
        Ave a1 = new Ave("Galinha", "Carijó", 3, false);
        Ave a2 = new Ave("Sabiá", "Marrom", 1, true);
        
        
        
        m1.alimentar();
        
        System.out.println(m1.mover());
        System.out.println(m2.mover());
        System.out.println(a1.mover());
        System.out.println(a2.mover());
    }
}