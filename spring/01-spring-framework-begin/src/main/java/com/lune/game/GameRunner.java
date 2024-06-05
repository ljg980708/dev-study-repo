package com.lune.game;

public class GameRunner {

    private GamingConsole gamingConsole;

    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public void run() {
        System.out.println("Running Game: " + gamingConsole);
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }
}
