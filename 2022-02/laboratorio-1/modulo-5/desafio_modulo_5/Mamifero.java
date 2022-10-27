public class Mamifero extends Animal {
    
    private int quantidadePatas;
    private boolean aquatico;
    
    public Mamifero(String nome, String cor, int peso, int quantidadePatas, boolean aquatico) {
        super(nome, cor, peso);
        this.quantidadePatas = quantidadePatas;
        this.aquatico = aquatico;
    }
    
    public int getQuantidadePatas() {
        return this.quantidadePatas;
    }
    
    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }
    
    public boolean isAquatico() {
        return this.aquatico;
    }
    
    public void setAquatico(boolean aquatico) {
        this.aquatico = aquatico;
    }
    
    public String mover() {
        if (this.aquatico)
            return super.getNome() + " é um mamífero aquático e por isso nadou...";
        else 
            return super.getNome() + " é um mamífero, portanto, correu...";
    }
}