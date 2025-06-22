package com.eartrainer.eartrainer.controller;

import com.eartrainer.eartrainer.service.ChordService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/exercise/chords")
public class ChordController {

    private final ChordService chordService;

    public ChordController(ChordService chordService) {
        this.chordService = chordService;
    }


    @GetMapping
    public String[] generateChord(int level) {
        try {
            return chordService.generateChord(level);
        } catch (Exception e) {
            return new String[]{e.getMessage()};
        }
    }
}
