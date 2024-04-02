package br.com.alura.mymusic.model;

public class Audio {
    private String title;
    private int totalReproduced;
    private int totalLike;
    private int classification;

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public int getTotalReproduced() {
        return totalReproduced;
    }
    public int getTotalLike() {
        return totalLike;
    }
    public int getClassification() {
        return classification;
    }
    public void like(){
        this.totalLike++;
    }
    public void playMusic(){
        this.totalReproduced++;
    }
}