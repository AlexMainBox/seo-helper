package com.zharkov.seohelper.service;

import org.springframework.stereotype.Service;

@Service
public class KeywordsDensityService {

    private StringBuffer stringBuffer;


    public int counting(String text){
        stringBuffer = new StringBuffer(text.toLowerCase());
        return stringBuffer.length();
    }
}
