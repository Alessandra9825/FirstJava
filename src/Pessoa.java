public class Pessoa {
    public Pessoa (String Name ){ this.name  = Name; }

    private String name;

    public String dizerOla(String nome)
    {
        return "Ola "+nome+"!!!";
    }

    public  String perguntarComoEsta (String nome)
    {
        return "Como você está hoje "+nome+"";
    }

    public String respondePergunta ()
    {
        return "Bem , obrigada por perguntar !";
    }

}