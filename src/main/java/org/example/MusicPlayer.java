package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Qualifier("classicalMusic")
    private Music music1 ;
    private Music music2 ;
    @Value("${musicPlayer.volume}")
    private int volume;
    @Value("${musicPlayer.name}")
    private String name ;

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2){
        this.music1=music1;
        this.music2=music2;} //полиморфизм

    //public void setMusic(Music music) {this.music = music;}

    public String playMusic(){
        return "Plaing  "+music1.getSong()+" , "+ music2.getSong();
    }
}
