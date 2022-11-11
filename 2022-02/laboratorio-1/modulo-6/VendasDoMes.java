

public class VendasDoMes
{ 
    private int mes;    
    private Venda[] v;
    private int qt;
    
    public VendasDoMes(int m, int max) {
        this.mes = m;
        this.v = new Venda[max];
        this.qt = 0;
    }
    
	//cadastraUmaVenda - que recebe como par�metro o objeto venda e armazena-o no array na pr�xima posi��o livre. 
	//Retorna true ou false indicando o sucesso ou n�o da opera��o. 
	public boolean cadastraUmaVenda (Venda umaVenda){    
	   if (qt<v.length){
		   v[qt++] = umaVenda; 
		   return true;
	   }   
       return false;
    }
    public int getMes()	{
		return this.mes;
	}
	public int getQuantasVendas()	{
		return this.qt;
	}
	//getTodasAsVendas �  retorna o array de objetos.
	public Venda[] getTodasAsVendas()	{
		return this.v;
	}
    //getAVenda �  recebe um n�mero de uma nota fiscal e procura no array uma venda com este n�mero.
	// Se achar, retorna o objeto Venda correspondente; se n�o achar, retorna null.  
	public Venda getAVenda(int nf)	{
		for(int i = 0; i<qt; i++)
		    if (v[i].getNotaFiscal()==nf)
		       return v[i];
		return null;
    }
    //getUmaVenda �  retorna a �ltima venda cadastrada. Se n�o h� nenhuma venda cadastrada, retorna null. 
   public Venda getUmaVenda()	{  
	    if(qt>= 1) 
	        return v[qt-1];
	    else return   null;
   }
   // getUmaVenda � (sobrecarga) que recebe o �ndice de uma posi��o do array e retorna o objeto Venda armazenado naquele �ndice. 
  //Se n�o h� venda armazenada no �ndice especificado ou se o �ndice � inv�lido retorna a �ltima venda cadastrada. 
  //Se n�o h� nenhuma venda cadastrada, retorna  null.  
	
	public Venda getUmaVenda(int indice){
		
		if(indice<qt && indice >=0 ) 
	        return v[indice];
	    else return   getUmaVenda();
   }
  
	
	// -  retorna um array contendo o valor total vendido em cada dia da semana,
	//isto �, no �ndice 1 deve ser armazenado o valor total vendido nos domingos,
	//no �ndice 2, o valor total vendido nas segundas-feiras e assim sucessivamente. 
	//O �ndice zero deve armazenar o valor total vendido no m�s.
    public double[] getTotalVendidoPorDia(){

        double[] totDia = new double[8];
        for(int i = 0; i<qt; i++){
           totDia[v[i].getDiaDaSemana( )] +=  v[i].getValor( );
           totDia[0] +=  v[i].getValor( ); 
        }
        return totDia;
    }   
	//getVendasPorVendedor -  recebe o numero de um vendedor e retorna um array de objetos Venda 
	//contendo apenas as vendas deste vendedor, classificadas em ordem crescente pelo n�mero da nota fiscal. 
     public Venda[] getVendasPorVendedor(int vendedor){
        int cont =0;
        for(int i = 0; i<qt; i++)            
           if  ( v[i].getVendedor() == vendedor)
                  cont++;
             
        Venda[] vendasPorVendedor = new Venda[cont];
        cont =0;
        for(int i = 0; i<qt; i++)            
           if  ( v[i].getVendedor() == vendedor)
                  vendasPorVendedor[cont++]= v[i];
        classificaOrdemCrescente (vendasPorVendedor);             
        return vendasPorVendedor;
    } 
    private void classificaOrdemCrescente(Venda v[]){ 
        boolean troquei;
        Venda aux;
	    do
	      {troquei=false; 
	       for(int i=0; i< v.length-1;i++)
	       if (v[i].getNotaFiscal( )>v[i+1].getNotaFiscal( ))
	          {troquei =true; 
	           aux=v[i];
	           v[i]=v[i+1];
	           v[i+1]=aux; }
	      }        
	    while (troquei);  
	}     
   
}//fim da classe
