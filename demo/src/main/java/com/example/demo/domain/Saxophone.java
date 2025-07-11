package com.example.demo.domain;

import com.example.demo.springidol.Instrument;

public class Saxophone implements Instrument {
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}
