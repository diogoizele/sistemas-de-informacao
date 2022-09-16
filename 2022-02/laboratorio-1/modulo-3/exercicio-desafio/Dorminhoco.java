public class Dorminhoco {
    
    
    /**
     * O parâmetro diaDaSemana é true se for um dia da semana
     * e o parâmetro ferias é true se estamos em férias. 
     * 
     * --> Nós dormimos somente quando não é dia da semana ou 
     * quando estamos em férias. 
     * 
     * Neste caso, quando estamos dormindo o método deve 
     * retornar true.
     */
    public boolean estaDormindo(boolean diaDaSemana, boolean ferias) {
           
        if (!diaDaSemana || ferias) {
            return true;
        } 
        
        return false;
    }
}