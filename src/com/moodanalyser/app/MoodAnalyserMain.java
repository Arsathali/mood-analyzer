package com.moodanalyser.app;

import com.moodanalyser.exception.MoodAnalyserNullException;
import com.moodanalyser.model.*;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        
        MoodAnalyser analyser = new MoodAnalyser(null);
        System.out.println(analyser.analyseMood());
    
    }
}
