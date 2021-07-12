package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
     public static void main(String[] args) {
         ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                 "applicationContext.xml"
         );
         ClassicalMusic classicalMusic = context.getBean("MusicBean",ClassicalMusic.class);
         System.out.println(classicalMusic.getSong());

         /*MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
         musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
         System.out.println(musicPlayer.getVolume());*/
         context.close();

     }
}
// создание бинов по умолчанию  используется scope singelton
// т.е.MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//  это строчка кода будет всегда возвращать ссылку на один тот же bean
//scope  prototype для  вызовв функции getBean сздаеться свой объект
