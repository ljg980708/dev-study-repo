package com.lune.game;

public class GameRunner {
    MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public void run() {
        System.out.println("Running Game: " + marioGame);
    }
}
