package com.eartrainer.eartrainer.service;

import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Service;


@Service
public class ExerciseService {
    private final Map<Integer, String[]> intervals = Map.of(
            1, new String[]{"M3", "m3"},
            2, new String[]{"M3", "m3", "P5"},
            3, new String[]{"M3", "m3", "P5", "P4"},
            4, new String[]{"M3", "m3", "P5", "P4", "P8"},
            5, new String[]{"M3", "m3", "P5", "P4", "P8", "M6", "m6"},
            6, new String[]{"M3", "m3", "P5", "P4", "P8", "M6", "m6", "M2", "m2"},
            7, new String[]{"M3", "m3", "P5", "P4", "P8", "M6", "m6", "M2", "m2", "M7", "m7"},
            8, new String[]{"M3", "m3", "P5", "P4", "P8", "M6", "m6", "M2", "m2", "M7", "m7", "d5"},
            9, new String[]{"M3", "m3", "P5", "P4", "P8", "M6", "m6", "M2", "m2", "M7", "m7", "d5"},
            10, new String[]{"M3", "m3", "P5", "P4", "P8", "M6", "m6", "M2", "m2", "M7", "m7", "d5", "M9", "m9"}
    );

    /**
     * generates an exercise based on the type and level
     * info in rcm_requirements.txt
     */
    public String generateInterval(int level) {
            String[] intervalList= intervals.get(level);
            return intervalList[randomIndex(intervalList.length)];
    }

    /**
     * helper method to generate random index based on length of exercise list
     */
    private int randomIndex(int length) {
        return (int) (Math.random() * length);
    }

}

