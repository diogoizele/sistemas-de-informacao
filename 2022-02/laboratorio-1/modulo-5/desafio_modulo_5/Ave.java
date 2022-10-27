public class Ave extends Animal {
    
    private boolean carinata;
    
    public Ave(String nome, String cor, int peso, boolean carinata) {
        super(nome, cor, peso);
        this.carinata = carinata;
    }
    
    public boolean isCarinata() {
        return this.carinata;
    }
    
    public void setCarinata(boolean carinata) {
        this.carinata = carinata;
    }
   
    public String mover() {
        if (this.carinata)
            return super.getNome() + " é uma ave que possue carena ou quilha e por isso  pode voar...";
        else 
            return super.getNome() + " não é uma ave carinata, logo, não consegue voar...";
    }
}