public class Pais 
{
    private String nome;
    private String sigla;
    private String prefixoArea;

    private Pais() {}

    public Pais(String nome, String sigla, String prefixoArea)
    {
        this.nome = nome;
        this.sigla = sigla;
        this.prefixoArea = prefixoArea;
    }

    // Getters & Setters
    public String getNome() { return this.nome; }
    public String getSigla() { return this.sigla; }
    public String getPrefixoArea() { return this.prefixoArea; }

    public void setNome(String nome) { this.nome = nome; }
    public void setSigla(String sigla) { this.sigla = sigla; }
    public void setPrefixoArea(String prefixoArea) { this.prefixoArea = prefixoArea; }
}
