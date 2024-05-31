package com.lune.spring_framework_begin;

import com.lune.game.GameRunner;
import com.lune.game.MarioGame;
import com.lune.game.ZeldaGame;

public class AppGamingBasic {

    public static void main(String[] args) {

        var marioGame = new MarioGame();

        var zeldaGame = new ZeldaGame();
        var gameRunner = new GameRunner(zeldaGame);
        gameRunner.run();


    }
}
