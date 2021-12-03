package com.zharkov.seohelper.restController;

import com.zharkov.seohelper.service.KeywordsDensityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/keywordsDensity")
public class KeywordDensityController {

    private KeywordsDensityService keywordsDensityService;

    @Autowired
    public KeywordDensityController(KeywordsDensityService keywordsDestinyService) {
        this.keywordsDensityService = keywordsDestinyService;
    }

    @GetMapping
    public ModelAndView viewKeywordDensity(){
        return new ModelAndView("keywordsDensity");
    }

    @PostMapping
    public int resultKeywordDestiny(@RequestBody String text){
        return keywordsDensityService.counting(text);
    }
}
