package com.example.demo.domain;

import com.example.demo.springidol.MagicBox;
import com.example.demo.springidol.Performer;

public class Magician implements Performer {
    public Magician() {
    }

    private MagicBox magicBox;
    private String magicWords;

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    /**
     * Задаёт магические слова
     * @param magicWords
     */
    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    @Override
    public void perform() {
        System.out.println(magicWords);// произносит волшебные слова
        System.out.println("The magicbox content...");
        System.out.println(magicBox.getContents());// содержимое ящика
    }
}
