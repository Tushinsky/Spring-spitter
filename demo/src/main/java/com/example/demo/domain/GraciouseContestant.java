package com.example.demo.domain;

import com.example.demo.springidol.Contestant;

public class GraciouseContestant implements Contestant {
    @Override
    public void receiveAward() {
        System.out.println("This is a graciouse contestant");
    }
}
