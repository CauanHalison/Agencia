
public class Main
{
    public static void main(String [] args)
    {
        AgenciaInteligencia cia = new AgenciaInteligencia("Agencia de Inteligencia Americana", new Pais("Estados Unidos da America", "US","001"));
        AgenciaInteligencia fbi = new AgenciaInteligencia("FBI", new Pais("Estados Unidos da America", "US","001"));
        Agente comandanteCia = new Agente(cia);

        
        comandanteCia.setNivelHierarquico(cia, NivelHierarquico.COMANDO);
        cia.setChave("MNOPQRSTUVWXYZABCDEFGHIJKL", comandanteCia);
        Mensagem m1 = new Mensagem("OLAMUNDO", NivelSeguranca.BAIXO);

        m1 = cia.cifrarMensagem(m1, comandanteCia);

        System.out.println(m1.getTexto());

        Mensagem m2 = new Mensagem(m1.getTexto(), m1.getNivelSeguranca()); 

        m2 = fbi.decifrarMensagem(m2, comandanteCia);

        System.out.println(m2.getTexto());
    }
}