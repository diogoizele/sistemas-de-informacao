public class Euro extends Moeda{
    public Euro(String nacionalidade, double cotacao){
        super(nacionalidade, cotacao);
    }
    public void imprimeDados(double reais){
        System.out.printf("\nVocê comprou € %.2f euros\n", reais/getCotacao());
        super.imprimeDados();
    }
}