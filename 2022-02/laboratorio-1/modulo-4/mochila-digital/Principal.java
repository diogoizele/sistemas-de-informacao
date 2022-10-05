public class Principal {
    
    public static void main(String[] args) {
        
        Mochila mochila = new Mochila("123456", "* Prova na Sexta-feira", "https://google.com", 6);
        
        System.out.println(mochila.toString());
        System.out.println("Testando classe Main");
        
        mochila.exibeQuantidadeMateriasSemestre(3);
        mochila.exibeQuantidadeMateriasSemestre(7);
        mochila.exibeQuantidadeMateriasSemestre(20);
    }
}