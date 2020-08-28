import java.util.*;


public class JavaSample {
    public static void main(String[] args) {
        Pessoa Eu = new Pessoa ("Alessandra");
        Estudante Lucas = new Estudante ("Jefferson Fernandes");
        Professor Wuo = new Professor("Wellison Wuo");


        System.out.println(Lucas.dizerOla("Professor"));
        System.out.println(Wuo.dizerOla("Fernandes"));
        System.out.println(Lucas.perguntarComoEsta("Professor"));
        System.out.println(Wuo.respondePergunta());
        System.out.println(Wuo.perguntarComoEsta("Fernandes"));
        System.out.println(Lucas.respondePergunta());
        System.out.println(Wuo.responderAluno("Fernandes"));
        System.out.println(Lucas.respostaPadrão());

    }
}
