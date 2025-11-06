package media.devices;


public class GameConsole {
    private boolean on;


    public void on() {
        on = true;
        System.out.println("Console: включена");
    }


    public void off() {
        on = false;
        System.out.println("Console: выключена");
    }


    public void startGame(String title) {
        if (!on) {
            System.out.println("Console: включите консоль перед запуском игры");
            return;
        }
        System.out.println("Console: запуск игры — " + title);
    }
}