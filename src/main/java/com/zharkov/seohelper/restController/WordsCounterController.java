package com.zharkov.seohelper.restController;

import com.zharkov.seohelper.service.WordsCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/wordsCounter")
public class WordsCounterController {

    private WordsCounterService textService;

    @Autowired
    public WordsCounterController(WordsCounterService textService) {
        this.textService = textService;
    }

    @GetMapping()
    @PreAuthorize("hasAuthority('developer:write')")
    public ModelAndView wordsCounterServiceController(){
        return new ModelAndView("wordsCounter");
    }

    @PostMapping()
    @PreAuthorize("hasAuthority('developer:write')")
    public int stringCount(@RequestBody String text){
        return textService.textConverterInChar(text);
    }
}
