package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
     public static void main(String[] args) {
         ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                 "applicationContext.xml"
         );
         /*//ClassPathXmlApplicationContext обращаеться к файлу applicationContext и считывает все bean-ы
         Music music=context.getBean("rockMusic",Music.class);
         //testBean - в applicationContext bean и  и вторым аргументом говорим что это класс
         MusicPlayer musicPlayer = new MusicPlayer(music);

         musicPlayer.playMusic();

         Music music2=context.getBean("classicalMusic",Music.class);
         MusicPlayer musicPlayer2 = new MusicPlayer(music2);
         musicPlayer2.playMusic();*/
         MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
         System.out.println(musicPlayer.getVolume());
         System.out.println(musicPlayer.getName());

         ClassicalMusic classicalMusic1=context.getBean("classicalMusic",ClassicalMusic.class);
         //ClassicalMusic classicalMusic2=context.getBean("classicalMusic",ClassicalMusic.class);
         //System.out.println(classicalMusic1==classicalMusic2);

         context.close();

    }
}
