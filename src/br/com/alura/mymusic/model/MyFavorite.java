package br.com.alura.mymusic.model;
public class MyFavorite {
    public void incluide (Audio audio){
        if (audio.getClassification() >= 6){
            System.out.println(audio.getTitle() + " Sucesso!");
        }else {
            System.out.println(audio.getTitle() + " Tendencia!");
        }
    }
}
