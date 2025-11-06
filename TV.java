package media.devices;


public class TV {
    private boolean on;
    private int channel = 1;


    public void on() {
        on = true;
        System.out.println("TV: включен");
    }


    public void off() {
        on = false;
        System.out.println("TV: выключен");
    }


    public void setChannel(int channel) {
        if (!on) {
            System.out.println("TV: нельзя изменить канал — телевизор выключен");
            return;
        }
        this.channel = channel;
        System.out.println("TV: установлен канал " + channel);
    }
}