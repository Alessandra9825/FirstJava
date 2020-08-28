public class Estudante extends Pessoa {
    public Estudante(String nome){super(nome);}

    public String  dizerOla(String nome)
    {
        return "Oi, ja corrigiu a prova "+nome+"!!!";
    }

    public  String perguntarComoEsta (String nome)
    {
        return "Tenho tanta coisa atrasada, como você ta "+nome+"?";
    }
    public String respondePergunta ()
    {
        return "Não sei responder não, ainda preciso de um pontinho extra!";
    }
    public String respostaPadrão (){return "A não vai dar não, to meio ocupado";}

}