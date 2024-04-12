import java.util.List;

public class AgenteDuplo extends Agente {
    private AgenciaInteligencia agenciaInteligenciaVerdadeira;
    private String informacoes;
    private List<String> informacoesTopSecret;

    public AgenteDuplo(AgenciaInteligencia agenciaInfiltrada, AgenciaInteligencia agenciaInteligenciaVerdadeira){
        super(agenciaInfiltrada);
        this.agenciaInteligenciaVerdadeira = agenciaInteligenciaVerdadeira;
    }

    public Pais getPaisVerdadeiro(){
        return agenciaInteligenciaVerdadeira.getPais();
    }

    public String getInformacoes(Agente agente)
    {
        if(agente.getAgenciaInteligencia().getNome() == agenciaInteligenciaVerdadeira.getNome())
        {
            String todas_informacoes = "";

            for (String informacao : this.informacoesTopSecret) 
            {
                todas_informacoes += informacao + "\n";
            }

            return todas_informacoes;
        }

        return "";
    }
    
    @Override
    public Mensagem receberMensagem(Mensagem mensagem)
    {
        Mensagem mensagem_retorno = this.getAgenciaInteligencia().decifrarMensagem(mensagem, this); // Agencia falsa

        this.informacoes = mensagem_retorno.getTexto();

        if(mensagem_retorno.getNivelSeguranca() == NivelSeguranca.TOPSECRET)
            this.informacoesTopSecret.add(this.informacoes);

        return mensagem_retorno;
    }
}
