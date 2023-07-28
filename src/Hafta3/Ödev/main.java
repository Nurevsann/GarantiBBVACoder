package Hafta3.Ödev;

public class main { //bütün sınıfları bu classta çalıştırıyoruz
    public static void main(String[] args) {
        GameController xbox = new XBOX();
        GameController ps = new Playstation();

        Computer computer = new Computer();
        computer.open();
        computer.addController(xbox);
        computer.addController(ps);

        computer.playGame();

        computer.shutdown();
    }
}
