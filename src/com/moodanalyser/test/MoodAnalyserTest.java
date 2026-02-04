package com.moodanalyser.test;
import com.moodanalyser.exception.MoodAnalyserNullException;
import com.moodanalyser.model.MoodAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {

    @Test
    public void givenSadMoodMessage_shouldReturnSAD(){
        MoodAnalyser analyser = new MoodAnalyser("I am in Sad Mood");
        String mood = analyser.analyseMood();
        assertEquals("SAD", mood);
    }

    @Test
    public void givenAnyMoodMessage_shouldReturnHappy() {
        MoodAnalyser analyser = new MoodAnalyser("I am in happy Mood");
        String mood = analyser.analyseMood();
        assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHAPPY() {
        MoodAnalyser analyser = new MoodAnalyser(null);
        String mood = analyser.analyseMood();
        assertEquals("HAPPY", mood);
    }
}
