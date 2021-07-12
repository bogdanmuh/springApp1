package org.example;

public class ClassicalMusic implements Music {
    private  ClassicalMusic(){ }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    // если будет не static то  невозможно будет создать обьект т.к. коструктор private
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing my Destruction");
    }
    @Override
    public String getSong(){
        return "HUngarian Rhapsody";
    }
}
