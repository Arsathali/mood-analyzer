package com.moodanalyser.app;

import com.moodanalyser.exception.MoodAnalyserException;
import com.moodanalyser.model.*;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        
        MoodAnalyser analyser = new MoodAnalyser(null);
        try {
            System.out.println(analyser.analyseMood());
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    
    }
}
