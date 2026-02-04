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


        try{
            
            if (message.contains("Sad")) {
                return "SAD";
            }
            return "HAPPY";
        }catch(NullPointerException e){

            throw new MoodAnalyserException(
                    MoodAnalyserException.ExceptionType.NULL_MOOD,
                    "Mood should not be NULL"
            );
        }
    }
}
