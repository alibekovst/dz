package media.devices;


public class AudioSystem {
    private boolean on;
    private int volume = 10; // 0..100


    public void on() {
        on = true;
        System.out.println("Audio: включена");
    }


    public void off() {
        on = false;
        System.out.println("Audio: выключена");
    }


    public void setVolume(int volume) {
        if (!on) {
            System.out.println("Audio: нельзя менять громкость — система выключена");
            return;
        }
        this.volume = Math.max(0, Math.min(100, volume));
        System.out.println("Audio: громкость = " + this.volume);
    }
}