public class Teste {
    
    public static void main(String[] args) {
        
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "cba";
        String str4 = new String("ABC");
        
        
        System.out.println("--- CompareTo ---");
        
        /**
         * O valor retornado de compareTo é um inteiro
         * representando a "distância" entre os valores
         * de acordo com a tabela ASCII.
         * 
         * Explico: O character 'A' na tabela ASCII vem
         * antes do caracter 'a', portanto "A".compareTo("a");
         * retorna -32, indicando que A vem 32 casas ANTES
         * (por causa do valor ser negativo) que o caracter 'a'.
         * Ao contrário, o retorno será 32, pelo fato de 'a' vir
         * 32 "posições" depois de 'A'.
         * 
         */
        
        System.out.printf("compareTo: str1, str2 %d\n", str1.compareTo(str2));
        System.out.printf("compareTo: str1, str3 %d\n", str1.compareTo(str3));
        System.out.printf("compareTo: str1, str4 %d\n", str1.compareTo(str4));
        System.out.printf("compareTo: 'a' com 'c' %d\n", "a".compareTo("c"));
        System.out.printf("compareTo: 'a' com 'b' %d\n", "a".compareTo("b"));
        System.out.printf("compareTo: 'a' com 'A' %d\n", "a".compareTo("A"));
        System.out.printf("compareTo: 'A' com 'a' %d\n", "A".compareTo("a"));
        
        
        System.out.println("\n--- CompareToIgnoreCase ---");
        
        System.out.printf("compareToIgnoreCase: str1, str2 %d\n", str1.compareToIgnoreCase(str2));
        System.out.printf("compareToIgnoreCase: str1, str3 %d\n", str1.compareToIgnoreCase(str3));
        System.out.printf("compareToIgnoreCase: str1, str4 %d\n", str1.compareToIgnoreCase(str4));
        System.out.printf("compareToIgnoreCase: 'a' com 'c' %d\n", "a".compareToIgnoreCase("c"));
        System.out.printf("compareToIgnoreCase: 'a' com 'b' %d\n", "a".compareToIgnoreCase("b"));
        System.out.printf("compareToIgnoreCase: 'a' com 'A' %d\n", "a".compareToIgnoreCase("A"));
        System.out.printf("compareToIgnoreCase: 'A' com 'a' %d\n", "A".compareToIgnoreCase("a"));
        
    }
}