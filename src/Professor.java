public class Professor extends Pessoa {
    public Professor(String nome){super(nome);}

    public String  dizerOla(String nome)
    {
        return "Oi, não quero ouvir falar de provas "+nome+"!!!";
    }

    public  String perguntarComoEsta (String nome)
    {
        return "Vejamos  como você esta "+nome+"?";
    }
    public String respondePergunta ()
    {
        return "Tudo sob controle !";
    }
    public String responderAluno(String nome){return "Que tal estudar para a proxima prova "+nome+"?";}
}
