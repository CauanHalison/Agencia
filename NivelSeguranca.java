public enum NivelSeguranca {
    BAIXO(0, "Baixo"),
    MEDIO(1, "Medio"),
    ALTO(2, "Alto"),
    TOPSECRET(3, "TopSecret");

    int codigo;
    String nivelSeguranca;

    private NivelSeguranca(int codigo, String nivelSeguranca){
        this.codigo = codigo;
        this.nivelSeguranca = nivelSeguranca;
    }

    public String getNivelSeguranca() {
        return nivelSeguranca;
    }
}
