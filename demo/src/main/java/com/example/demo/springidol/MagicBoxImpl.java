package com.example.demo.springidol;

import org.springframework.beans.factory.annotation.Autowired;

public class MagicBoxImpl implements MagicBox{

    @Override
    public String getContents() {
        return "A beautiful Assistant";
    }
}
