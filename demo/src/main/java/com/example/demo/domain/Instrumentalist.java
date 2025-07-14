package com.example.demo.domain;

import com.example.demo.springidol.Instrument;
import com.example.demo.springidol.Performer;
import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;// внедрение инструмента
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrumentalist() {
    }

    @Override
    public void perform() {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    public String screamSong() {
        return song;
    }
}
