package br.com.alura.mymusic.model;

public class Music extends Audio {
    private String album;
    private String singer;
    private String genreOfMusic;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenreOfMusic() {
        return genreOfMusic;
    }

    public void setGenreOfMusic(String genreOfMusic) {
        this.genreOfMusic = genreOfMusic;
    }
}
