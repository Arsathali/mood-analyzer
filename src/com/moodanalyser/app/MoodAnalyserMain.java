package com.moodanalyser.app;

import com.moodanalyser.exception.MoodAnalyserNullException;
import com.moodanalyser.model.*;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        
        MoodAnalyser analyser = new MoodAnalyser();
        try {
            System.out.println(analyser.analyseMood());
        } catch (MoodAnalyserNullException e) {
            e.printStackTrace();
        }
    }
}
