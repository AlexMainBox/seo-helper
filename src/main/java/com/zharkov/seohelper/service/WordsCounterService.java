package com.zharkov.seohelper.service;

import org.springframework.stereotype.Service;

@Service
public class WordsCounterService {

    private String text;

    public int textConverterInChar(String json){
        System.out.println(json);
        text = json;
        System.out.println("log: " + json);
        return text.length() -11; // (-11) - prefix {"text":"????"} , ???? - content
    }
}
