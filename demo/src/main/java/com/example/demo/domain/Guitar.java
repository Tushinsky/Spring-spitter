package com.example.demo.domain;

import com.example.demo.springidol.Instrument;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("BRINK BRINK BRINK");
    }
}
