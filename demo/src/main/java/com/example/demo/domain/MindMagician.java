package com.example.demo.domain;

import com.example.demo.springidol.MindReader;

public class MindMagician implements MindReader {
    private String thougths;
    @Override
    public void interceptThougths(String thougths) {
        System.out.println("Intercepting volunteer's thougths");
        this.thougths = thougths;
    }

    @Override
    public String getThougths() {
        return thougths;
    }
}
