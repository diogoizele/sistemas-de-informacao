public abstract class Animal {
    
    private String nome;
    private String cor;
    private double peso;
    
    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String mover() {
        return this.nome + " se moveu...";
    }
    
    public void alimentar() {
        double novoPeso = this.peso + 1.0;
        
        System.out.println(this.nome + " se alimentou e passou a pesar " + novoPeso);  
    }
}