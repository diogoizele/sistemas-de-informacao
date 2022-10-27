public class Dolar extends Moeda{
    public Dolar(String nacionalidade, double cotacao){
        super(nacionalidade, cotacao);
    }
    public void imprimeDados(double reais){
        System.out.printf("\nVocê comprou USD %.2f dolares\n", reais/getCotacao());
        super.imprimeDados();
    }
}