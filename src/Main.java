import Calculos.FiltroAvaliacao;
import models.Music;
import models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music novaMusica = new Music();
        novaMusica.setTitle("Sea Shanty Medley");
        novaMusica.setAlbum("Single");
        novaMusica.setBand("Home Free");
        novaMusica.setDuration(200);

        for (int i = 0; i < 2000; i++) {
            novaMusica.like();
        }
        for (int i = 0; i < 2000; i++) {
            novaMusica.play();
        }

        FiltroAvaliacao novoFiltro = new FiltroAvaliacao();

        System.out.println("Música: " + novaMusica.getTitle());
        System.out.println("Total de likes:" + novaMusica.getTotalLikes());
        System.out.println("Total de Views:" + novaMusica.getTotalViews());
        novoFiltro.avalia(novaMusica);

        Podcast novoPodcast = new Podcast();
        novoPodcast.setHost("Apresentador");
        novoPodcast.setGuest("Convidado");
        novoPodcast.setTotalEpisodes(12);
        novoPodcast.setTitle("NerdCast");

        for (int i = 0; i < 1000; i++) {
            novoPodcast.like();
        }
        for (int i = 0; i < 1000; i++) {
            novoPodcast.play();
        }

        System.out.println("Podcast: " + novoPodcast.getTitle());
        System.out.println("Total de likes:" + novoPodcast.getTotalLikes());
        System.out.println("Total de Views:" + novoPodcast.getTotalViews());
        novoFiltro.avalia(novoPodcast);
        }
    }
