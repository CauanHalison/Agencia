public enum NivelHierarquico{
    JUNIOR(0, "Junior"),
    PLENO(1, "Pleno"),
    SENIOR(2, "Senior"),
    COMANDO(3, "Comando");
    
    int codigo;
    String nivelHierarquico;
    
    NivelHierarquico(int codigo, String nivelHierarquico){
        this.codigo = codigo;
        this.nivelHierarquico = nivelHierarquico;
    }

    public String getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(String nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }

}