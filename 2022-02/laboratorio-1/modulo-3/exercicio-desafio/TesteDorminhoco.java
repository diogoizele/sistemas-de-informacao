public class TesteDorminhoco {
    
    public static void main(String[] args) {
        Dorminhoco d = new Dorminhoco();
        
        System.out.println(d.estaDormindo(false, false)); // true
        System.out.println(d.estaDormindo(true, false)); // false 
        System.out.println(d.estaDormindo(false, true)); // true
    }
}