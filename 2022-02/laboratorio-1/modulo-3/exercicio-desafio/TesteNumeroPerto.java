public class TesteNumeroPerto {
    
    public static void main(String[] args) {
        
        NumeroPerto n = new NumeroPerto();
        
        System.out.println(n.maisPertoDo10(8, 13));
        System.out.println(n.maisPertoDo10(13, 8));
        System.out.println(n.maisPertoDo10(13, 7));
        System.out.println(n.maisPertoDo10(-5, -3));
    }
}