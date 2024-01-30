package models;

import Calculos.Classificacao;

public class Podcast extends Audio implements Classificacao {
    private String host;
    private String guest;
    private int totalEpisodes;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public int getClassificacao() {
        if (getTotalLikes()>=1000 && getTotalViews()>=1000){
            return 5;
        }
         else if (getTotalLikes()>=1000 || getTotalViews()>=1000){
            return 4;
        } else{
             return 3;
        }
    }
}
