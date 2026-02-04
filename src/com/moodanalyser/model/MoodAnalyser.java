package com.moodanalyser.model;

import com.moodanalyser.exception.MoodAnalyserNullException;

public class MoodAnalyser {

    private String message;

    public MoodAnalyser(){

    }

    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserNullException{

        if(message == null || message.trim().isEmpty()){
           throw new MoodAnalyserNullException("Mood should not be NULL");
        }

        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
