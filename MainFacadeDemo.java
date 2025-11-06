package media.demo;


import media.devices.*;
import media.facade.HomeTheaterFacade;


public class MainFacadeDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole console = new GameConsole();


        HomeTheaterFacade facade = new HomeTheaterFacade(tv, audio, dvd, console);


        facade.watchMovie("Inception", 5, 30);
        facade.setMasterVolume(40);
        facade.listenMusic(12, 20);
        facade.playGame("Gran Turismo");
        facade.shutdownAll();
    }
}