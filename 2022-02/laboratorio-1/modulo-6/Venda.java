
public class Venda{
  private  int     notaFiscal;
  private  int     vendedor;
  private  double  valor;
  private  int     diaDaSemana;   // 1 a 7
    
    
  public Venda(int nF,  int nV, double v, int dS) { 
    this.notaFiscal = nF;
    this.vendedor =nV;
    this.valor =v;
    this.diaDaSemana= dS;
  }
    
   public double getValor( ){
      return this.valor;
   }
   public int getNotaFiscal( ){
     return this.notaFiscal;
   }
   public int getVendedor( ){
     return this.vendedor;
   }
   public int getDiaDaSemana( ){
     return this.diaDaSemana;
   }

}
