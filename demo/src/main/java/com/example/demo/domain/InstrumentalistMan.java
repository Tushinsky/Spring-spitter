package com.example.demo.domain;

import com.example.demo.springidol.Instrument;
import com.example.demo.springidol.Performer;

public abstract class InstrumentalistMan implements Performer {
    public InstrumentalistMan() {
    }

    private String song;
    public abstract Instrument getInstrument();

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() {
        System.out.println("Playing " + song + " ");
        getInstrument().play();
    }
}
