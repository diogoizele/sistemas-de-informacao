/**
 * Classe: EventoAcademico destinada à criação de eventos acadêmicos.
 * @author Débora Groff
 * @version 30/08/2022
 */


public class EventoAcademico
{
    // Atributos
    
    private String nomeEvento;
    private String tipoEvento;
    private boolean eventoPrivado;
    private int qtVagas;
    
    // Construtor
    public EventoAcademico(String nomeEvento, String tipoEvento, boolean eventoPrivado, int qtVagas)
    {
        this.nomeEvento = nomeEvento;
        this.tipoEvento = tipoEvento;
        this.eventoPrivado = eventoPrivado;
        this.qtVagas = qtVagas;
        
    }
    
    // Métodos get
    public String getNomeEvento() {
        return nomeEvento;
    }
    
    public String getTipoEvento() {
        return tipoEvento;
    }
    
    public boolean getEventoPrivado() {
        return eventoPrivado;
    }
    
    public int getQtVagas() {
        return qtVagas;
    }
    
    // Métodos Set
    public void setNomeEvento(String nomeEvento) {
        nomeEvento = nomeEvento;
    }
    
    public void setTipoEvento(String tipoEvento) {
        tipoEvento = tipoEvento;        
    }
    
    public void setEventoPrivado(boolean eventoPrivado) {
        eventoPrivado = eventoPrivado;
    }
    
    public void setQtVagas(int qtVagas) {
        qtVagas = qtVagas;
    }
    
    //Exibição dos dados
    public void exibeDados(){
        System.out.println("Nome Evento: "+ nomeEvento);
        System.out.println("Tipo do Evento: "+ tipoEvento);
        System.out.println("Evento Privado: "+ eventoPrivado);
        System.out.println("Quantidade de vagas: "+ qtVagas);
    }
    
    //Método de diminuição de vagas
    public void diminuiVaga() {
        this.qtVagas--;
    }
    
    //Método de edição do nome do Evento
    public void alteraNomeEvento(String novoNomeEvento) {
        this.nomeEvento = novoNomeEvento;
    }
    
    
}