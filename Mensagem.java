public class Mensagem {
    private String texto;
    private NivelSeguranca nivelSeguranca;

    private Mensagem(){

    }

    public Mensagem(String texto, NivelSeguranca nivelSeguranca){
        this.texto = texto;
        this.nivelSeguranca = nivelSeguranca;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public NivelSeguranca getNivelSeguranca(){
        return nivelSeguranca;
    }

}
