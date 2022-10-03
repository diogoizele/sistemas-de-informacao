import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        
        Cronometro cronometro = new Cronometro();
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Insira o tempo do cronômetro - em minutos: ");
        // cronometro.iniciar(leitor.nextInt());
        int minutos = leitor.nextInt();
        
        String msgMin = "", msgSeg = "";
        for (int m = 0; m < minutos; m++) {
            msgMin = String.format("%02d", m);
            for (int s = 0; s < 60; s++) {
                msgSeg = String.format("%02d", s);
                
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}
                
                System.out.printf("00:%s:%s\n", msgMin, msgSeg);
            }
        }
        msgMin = String.format("%02d", minutos);
        System.out.printf("00:%s:00\n", msgMin);
    }
}