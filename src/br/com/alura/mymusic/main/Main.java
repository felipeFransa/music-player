package br.com.alura.mymusic.main;

import br.com.alura.mymusic.model.Music;
import br.com.alura.mymusic.model.MyFavorite;
import br.com.alura.mymusic.model.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();

        myMusic.setTitle("Agora");
        myMusic.setSinger("Pablo");

        for (int i = 0; i < 1000; i++) {
            myMusic.playMusic();
        }
        for (int i = 0; i < 70; i++) {
            myMusic.like();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Debug");
        myPodcast.setHost("Feelps");

        for (int i = 0; i < 200; i++) {
            myPodcast.playMusic();
        }
        for (int i = 0; i < 80; i++) {
            myPodcast.like();
        }

        MyFavorite favorite = new MyFavorite();
        favorite.incluide(myMusic);
        favorite.incluide(myPodcast);
    }
}