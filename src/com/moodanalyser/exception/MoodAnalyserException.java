package com.moodanalyser.exception;

public class MoodAnalyserException extends Exception {
    
    public enum ExceptionType {
        NULL_MOOD,
        EMPTY_MOOD
    }

    public ExceptionType type;

    public MoodAnalyserException(ExceptionType type , String message){
        super(message);
        this.type = type;
    }
}
