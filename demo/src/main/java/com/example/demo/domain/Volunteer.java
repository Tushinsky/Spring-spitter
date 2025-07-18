package com.example.demo.domain;

import com.example.demo.springidol.Thinker;

public class Volunteer implements Thinker {
    private String thougths;

    public String getThougths() {
        return thougths;
    }

    @Override
    public void thinkOfSomething(String thougths) {
        this.thougths = thougths;
    }
}
