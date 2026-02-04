package com.moodanalyser.test;
import com.moodanalyser.exception.MoodAnalyserException;
import com.moodanalyser.model.MoodAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {

    @Test
    public void givenSadMoodMessage_shouldReturnSAD() throws MoodAnalyserException{
        MoodAnalyser analyser = new MoodAnalyser("I am in Sad Mood");
        String mood = analyser.analyseMood();
        assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMoodMessage_shouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser analyser = new MoodAnalyser("I am in happy Mood");
        String mood = analyser.analyseMood();
        assertEquals("HAPPY", mood);
    }


}
