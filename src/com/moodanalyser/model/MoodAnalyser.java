package com.moodanalyser.model;

import com.moodanalyser.exception.MoodAnalyserException;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser(){

    }

    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException{

       if (message == null) {
            throw new MoodAnalyserException(
                    MoodAnalyserException.ExceptionType.NULL_MOOD,
                    "Mood should not be NULL"
            );
        }

        if (message.trim().isEmpty()) {
            throw new MoodAnalyserException(
                    MoodAnalyserException.ExceptionType.EMPTY_MOOD,
                    "Mood should not be EMPTY"
            );
        }

        if (message.contains("Sad")) {
            return "SAD";
        }
        return "HAPPY";
    }
}
