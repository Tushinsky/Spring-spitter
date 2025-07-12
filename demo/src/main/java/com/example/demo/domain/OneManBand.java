package com.example.demo.domain;

import com.example.demo.springidol.Instrument;
import com.example.demo.springidol.Performer;

import java.util.Map;

public class OneManBand implements Performer {
//    private Collection<Instrument> instruments;

//    public void setInstruments(Collection<Instrument> instruments) {
//        this.instruments = instruments;
//    }
    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBand() {
    }

    @Override
    public void perform() {
//        for (Instrument instrument :
//                instruments) {
//            instrument.play();
//        }
        for(String key : instruments.keySet()) {
            System.out.println(key + ":");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
