public class Mec {
    
    public static final String[] estadosDoSul = {"RS", "SC", "PR"};
    
    public void imprimeUniversidades(Universidade universidades[]) {
        
        System.out.println("\nMétodo Imprime Universidades: \n");
        
        for (int i = 0; i < universidades.length; i++) {
            if (universidades[i] instanceof Publica) {
                System.out.println("Universidade Publica: "); 
                universidades[i].imprimeInfo();
            } else {
                System.out.println("Universidade Privada: "); 
                universidades[i].imprimeInfo();
            }         
            System.out.println("\n");
        }
    }
    
    public void maisCara(Universidade universidades[]) {
        boolean existePrivada = false;
        Privada universidade = new Privada("", 0, 0, 0);
        
        for (int i = 0; i < universidades.length; i++) {
            if (universidades[i] instanceof Privada) {
                existePrivada = true;
                
                if (universidade.getValorMensalidade() < ((Privada) universidades[i]).getValorMensalidade())
                    universidade = (Privada) universidades[i];
            }
        }
        
        if (!existePrivada) 
            System.out.println("O array nao contém universidades privadas");
        else {
            System.out.println("A universidade mais cara é: \n");
            universidade.imprimeInfo();
        }
    }
    
    public void universidadesDoSul(Universidade universidades[]) {
        
        System.out.println("\nMétodo Universidades do Sul: \n");
        
        for (int i = 0; i < universidades.length; i++) 
            if (isDoSul(universidades[i]))
                universidades[i].imprimeInfo();
    }
    
    public static boolean isDoSul(Universidade universidade) {
        if (universidade instanceof Publica && 
            (((Publica) universidade).getEstado().equals(estadosDoSul[0]) ||
            ((Publica) universidade).getEstado().equals(estadosDoSul[1]) ||
            ((Publica) universidade).getEstado().equals(estadosDoSul[2]))) 
                return true;
        
        return false;
    }
}