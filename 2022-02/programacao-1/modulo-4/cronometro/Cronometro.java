public class Cronometro {
    
    public static String formataNumeroComUmAlgaritmo (int numero) {
        if (numero < 10) 
            return "0" + numero;
        else
            return "" + numero;
    }
    
    public void iniciar(int tempoEmMinutos) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        
        int segundosTotais = tempoEmMinutos * 60;
        
        for (int i = 0; i <= segundosTotais; i++) {
           
            // Exibição
            
            System.out.printf("%s:%s:%s\n", 
            formataNumeroComUmAlgaritmo(horas), 
            formataNumeroComUmAlgaritmo(minutos), 
            formataNumeroComUmAlgaritmo(segundos));
            
            // Lógica do horário
        
            if (minutos == 59 && segundos == 59) {
                horas++;
            }
            
            if (segundos < 59) 
                segundos++;
            else {
                segundos = 0;
                minutos++;
            }
            
            if (minutos > 59)
                minutos = 0;
                
            // Timer
                
            try { 
                Thread.sleep(1000); // 1 segundo = 1000 milisegundos
            } catch (Exception e) {
                System.out.println("Erro");
            }    
        }
        
     }
}