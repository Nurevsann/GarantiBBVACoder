package Hafta3.Ödev;

import Hafta3.Ödev.GameController;

public class XBOX implements GameController {

    public void pressButton(String button) {
        System.out.println("XBOX : " + button + " pressed");
    }
}
