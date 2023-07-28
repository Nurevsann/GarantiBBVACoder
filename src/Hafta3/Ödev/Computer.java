package Hafta3.Ödev;

import java.util.ArrayList;
import java.util.List;

public class Computer{
    private boolean isOpen;
    private List<GameController> controllers;

    public Computer() {
        isOpen = false;
        controllers = new ArrayList<>();
    }

    public void open() {
        if (isOpen) {
            throw new IllegalStateException("Computer is already open.");
        }
        isOpen = true;
        System.out.println("Computer is now open.");
    }

    public void shutdown() {
        if (!isOpen) {
            throw new IllegalStateException("Computer is already closed.");
        }
        isOpen = false;
        System.out.println("Computer is now closed.");
    }

    public void addController(GameController controller) {
        if (!isOpen) {
            throw new IllegalStateException("Computer must be open to add a controller.");
        }
        controllers.add(controller);
    }

    public void playGame() {
        if (!isOpen) {
            throw new IllegalStateException("Computer is closed. Please open the computer to play.");
        }
        System.out.println("Game started:");
        for (GameController controller : controllers) {
            controller.pressButton("Play");
        }
    }
}
