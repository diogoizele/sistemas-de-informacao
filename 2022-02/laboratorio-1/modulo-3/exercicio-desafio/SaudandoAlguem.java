public class SaudandoAlguem {
    
    public static final String SAUDACAO_ESPERADA = "oi";
    
    public boolean dizendoOi(String saudacao) {
        
        if (saudacao.substring(0, 2).equalsIgnoreCase(SAUDACAO_ESPERADA)) {
            return true;
        }
        
        return false;
    }
}