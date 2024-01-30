package Calculos;

public class FiltroAvaliacao {
    public void avalia(Classificacao stars){
        if (stars.getClassificacao()==5){
            System.out.println("Um dos melhores da plataforma.");
        } else if (stars.getClassificacao()==4){
            System.out.println("O pessoal está curtindo.");
        } else{
            System.out.println("Aproveite o conteúdo.");
        }
    }
}
