package media.devices;


public class DVDPlayer {
    private boolean on;
    private boolean playing;


    public void on() {
        on = true;
        System.out.println("DVD: включен");
    }


    public void off() {
        on = false;
        playing = false;
        System.out.println("DVD: выключен");
    }


    public void play(String movie) {
        if (!on) {
            System.out.println("DVD: сначала включите плеер");
            return;
        }
        playing = true;
        System.out.println("DVD: воспроизведение фильма — " + movie);
    }


    public void pause() {
        if (playing) {
            playing = false;
            System.out.println("DVD: пауза");
        } else {
            System.out.println("DVD: сейчас ничего не играет");
        }
    }


    public void stop() {
        if (on) {
            playing = false;
            System.out.println("DVD: стоп");
        }
    }
}