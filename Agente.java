public class Agente {
    private String pseudonimo;
    private Pais pais;
    private AgenciaInteligencia agenciaInteligencia;
    private String informacoes;
    private NivelHierarquico nivelHierarquico;

    private Agente() {}
    
    public Agente(AgenciaInteligencia agenciaInteligencia){
        this.agenciaInteligencia = agenciaInteligencia;
    }

    public NivelHierarquico getNivelHierarquico(){
        return nivelHierarquico;
    }

    public void setNivelHierarquico(AgenciaInteligencia agenciaInteligencia, NivelHierarquico nivelHierarquico){
        if(agenciaInteligencia == this.agenciaInteligencia){
            this.nivelHierarquico = nivelHierarquico;
        }else{
            this.nivelHierarquico = null;
        }
    }

    public AgenciaInteligencia getAgenciaInteligencia(){
        return agenciaInteligencia;
    }

    public void setAgenciaInteligencia(AgenciaInteligencia agenciaInteligencia){
        this.agenciaInteligencia = agenciaInteligencia;
    }

    public String getInformacoes(Agente agente){
        return informacoes;
    }

    public String getPseudonimo(){
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo){
        if(pseudonimo != null){
            this.pseudonimo = pseudonimo;
        }
    }

    public Pais getPais(){
        return pais;
    }

    private void setPais(AgenciaInteligencia agenciaInteligencia){
        this.pais = agenciaInteligencia.getPais();
    }

    public Mensagem receberMensagem(Mensagem mensagem)
    {        
        Mensagem mensagem_retorno = agenciaInteligencia.decifrarMensagem(mensagem, this); 

        this.informacoes = mensagem_retorno.getTexto();
        return mensagem_retorno;
    }
}
