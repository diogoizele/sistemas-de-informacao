
/**
 * Objeto: Mochila
 * A classe mochila é a representação digital de uma mochila de estudante
 * no sistema. Nela poderá ser armazenado alguns dados úteis ao estudante.
 * 
 * @author (Diogo Izele) 
 * @version (1.0.0)
 */
public class Mochila {
    
    private String minhaMatricula;
    private String blocoDeNotas;
    private String linkDasAulas;
    private int semestreAtual;
    
    public Mochila(String minhaMatricula, String blocoDeNotas, String linkDasAulas, int semestreAtual) {
        
        this.minhaMatricula = minhaMatricula;
        this.blocoDeNotas = blocoDeNotas;
        this.linkDasAulas = linkDasAulas;
        this.semestreAtual = semestreAtual;
    }
    
    public void setMinhaMatricula(String minhaMatricula) {
        
        this.minhaMatricula = minhaMatricula;
    }
    
    public String getMinhaMatricula() {
        
        return this.minhaMatricula;
    }

    public void setBlocoDeNotas(String blocoDeNotas) {
        
        this.blocoDeNotas = blocoDeNotas;
    }
    
    public String getBlocoDeNotas() {
        
        return this.blocoDeNotas;
    }
    
    public void linkDasAulas(String linkDasAulas) {
        
        this.linkDasAulas = linkDasAulas;
    }
    
    public String getLinkDasAulas() {
        
        return this.linkDasAulas;
    }
    
    public void semestreAtual(int semestreAtual) {
        
        this.semestreAtual = semestreAtual;
    }
    
    public int getSemestreAtual () {
        
        return this.semestreAtual;
    }
    
    public void adicionaLink(String novoLink) {
        
        String novoLinkFormatado = "\n * " + novoLink;
        
        this.linkDasAulas += novoLinkFormatado;
    }
}
