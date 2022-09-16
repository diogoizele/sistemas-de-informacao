public class NumeroPerto {
    
    public static final int DEZ = 10;
    public static final int ZERO = 0;
    
    public int maisPertoDo10(int a, int b) {
        
        int resultA = DEZ - a;
        int resultB = DEZ - b;
        
        if (Math.abs(resultA) == Math.abs(resultB)) {
            return ZERO;
        } else if (Math.abs(resultA) > Math.abs(resultB)) {
            return b;
        }
        return a;
    }
}