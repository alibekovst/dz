package media.facade;


import media.devices.*;


public class HomeTheaterFacade {
    private final TV tv;
    private final AudioSystem audio;
    private final DVDPlayer dvd;
    private final GameConsole console;


    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole console) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
        this.console = console;
    }


    // Сценарий: начать просмотр фильма
    public void watchMovie(String movie, int channel, int volume) {
        System.out.println("\n=== СЦЕНАРИЙ: Просмотр фильма ===");
        tv.on();
        tv.setChannel(channel);


        audio.on();
        audio.setVolume(volume);


        dvd.on();
        dvd.play(movie);
    }


    // Сценарий: включить музыку (TV как источник, громкость через аудио)
    public void listenMusic(int channel, int volume) {
        System.out.println("\n=== СЦЕНАРИЙ: Прослушивание музыки ===");
        tv.on();
        tv.setChannel(channel);
        audio.on();
        audio.setVolume(volume);
        System.out.println("Источник звука — TV на канале " + channel);
    }


    // Регулировка громкости через фасад
    public void setMasterVolume(int volume) {
        audio.setVolume(volume);
    }


    // Сценарий: запуск игры
    public void playGame(String title) {
        System.out.println("\n=== СЦЕНАРИЙ: Запуск игры ===");
        tv.on();
        audio.on();
        console.on();
        audio.setVolume(25);
        console.startGame(title);
    }

    public void shutdownAll() {
        System.out.println("\n=== Выключение всей системы ===");
        dvd.stop();
        dvd.off();
        console.off();
        audio.off();
        tv.off();
    }
}