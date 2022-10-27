public class Moeda{
    private String pais;
    private double cotacao;
    
    public Moeda(String pais, double cotacao)
    {
        this.pais = pais;
        this.cotacao = cotacao;
    }
    
    public String getPais()
    {
        return pais;
    }

    public void setPais(String p)
    {
        p = pais;
    }
    
    public double getCotacao()
    {
        return cotacao;
    }

    public void setCotacao(double c)
    {
        c = cotacao;
    }
    
    public void imprimeDados(){
        System.out.println("Cotação comercial da moeda em 19/10/2022: R$ "+cotacao);
        System.out.println("País de origem da Moeda: "+pais);
    }
}