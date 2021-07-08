package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
     public static void main(String[] args) {
         ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                 "applicationContext.xml"
         );
         //ClassPathXmlApplicationContext обращаеться к файлу applicationContext и считывает все bean-ы
         Music music=context.getBean("MusicBean",Music.class);
         //testBean - в applicationContext bean и  и вторым аргументом говорим что это класс
         MusicPlayer musicPlayer = new MusicPlayer(music);

         musicPlayer.playMusic();
         context.close();

    }
}
