package models;

import Calculos.Classificacao;

public class Music extends Audio implements Classificacao {
    private String band;
    private String album;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getClassificacao() {
        if (getTotalLikes()>=2000 && getTotalViews()>=2000){
            return 5;
        }  else if (getTotalLikes()>=2000 ||getTotalViews()>=2000){
            return 4;
        } else {
            return 3;
        }
    }
}
