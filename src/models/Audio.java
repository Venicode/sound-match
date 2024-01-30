package models;

public class Audio {
    private String title;
    private int duration;
    private int totalPlays;
    private int totalLikes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalViews() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void like(){
        this.totalLikes++;
    }

    public void play(){
        this.totalPlays++;
    }
}
