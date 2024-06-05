package com.lune.spring_framework_begin;

import com.lune.game.GameRunner;
import com.lune.game.MarioGame;
import com.lune.game.ZeldaGame;

public class AppGamingBasic {

    public static void main(String[] args) {

//        var game = new MarioGame();
        var game = new ZeldaGame(); // 1. 객체 생성

        var gameRunner = new GameRunner(game); // 2. 객체 생성 + 의존성 주입
        gameRunner.run();
    }
}
