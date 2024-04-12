public class AgenciaInteligencia{
    
    private String nome;
    private String chave = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private Pais pais;

    public AgenciaInteligencia(String nome, Pais pais)
    {
        this.nome = nome;
        this.pais = pais;
    }
    
    // Getters & Setters
    public String getNome() { return this.nome; }
    public String getChave() { return this.chave; }
    public String getAlfabeto() { return this.alfabeto; }
    public Pais getPais() { return pais; }

    public void setNome(String nome) { this.nome = nome; }
    public void setChave(String chave, Agente agente) {
        if(agente.getNivelHierarquico().getNivelHierarquico() == "Comando" && agente.getPais() == pais && chave.length() == 26){
            this.chave = chave; 
        }    
    }
    public void setAlfabeto(String alfabeto) { this.alfabeto = alfabeto; }
    public void setPais(Pais pais) { this.pais = pais; }

    // Methods
    public Mensagem cifrarMensagem(Mensagem mensagem, Agente agente) 
    {
        String mensagem_str =  mensagem.getTexto();
        String mensagem_cifrada = "";

        for(char letra : mensagem_str.toCharArray())
        {
            int posicao = 0;

            for(char caracter : this.alfabeto.toCharArray())
            {
                if(letra != caracter)
                    posicao++;
                else
                    break;
            }

            int count = 0;
            for(char caracter : this.chave.toCharArray())
            {
                if(posicao != count)
                    count++;
                else
                    mensagem_cifrada += (this.chave).charAt(count);
            }
        }

        return new Mensagem(mensagem_cifrada, mensagem.getNivelSeguranca());
    }

    
    /*public Mensagem decifrarMensagem(Mensagem mensagem, Agente agente)
    {
        
    }*/
}