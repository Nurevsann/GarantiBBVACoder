package Hafta3.Ödev;

import Hafta3.Ödev.GameController;

public class Playstation implements GameController {
    public void pressButton(String button) {
        System.out.println("Playstation : " + button + " pressed");
    }
}
