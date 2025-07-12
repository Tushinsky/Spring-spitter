package com.example.demo.domain;

import com.example.demo.springidol.Poem;

public class Sonet29 implements Poem {
    private static final String[] LINES = {"Когда в раздоре с миром и судьбой,",
            "Припомнив годы, полные невзгод,",
            "Тревожу я бесплодною мольбой",
            "Глухой и равнодушный небосвод"};
    @Override
    public void recite() {
        for (String line : LINES) {
            System.out.println(line);
        }
    }
}
