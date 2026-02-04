package com.moodanalyser.app;

import com.moodanalyser.model.*;

public class MoodAnalyserMain {

    public static void main(String[] args) {
        
        MoodAnalyser analyser = new MoodAnalyser("I am in sad mood");
        System.out.println(analyser.analyseMood());
    }
}
