public class TesteSaudandoAlguem {
    
    public static void main (String[] args) {
        
        SaudandoAlguem s = new SaudandoAlguem();
        
        System.out.println(s.dizendoOi("oi pessoal")); // -> true
        System.out.println(s.dizendoOi("oi")); // -> true
        System.out.println(s.dizendoOi("olá pessoal")); // -> false
    }
}