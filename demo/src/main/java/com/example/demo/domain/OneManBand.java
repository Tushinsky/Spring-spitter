package com.example.demo.domain;

import com.example.demo.springidol.Instrument;
import com.example.demo.springidol.Performer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public class OneManBand implements Performer {
    private Collection<Instrument> instruments;

    @Autowired
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBand() {
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
