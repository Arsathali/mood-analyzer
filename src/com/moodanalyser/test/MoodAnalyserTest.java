package com.moodanalyser.test;
import com.moodanalyser.model.MoodAnalyser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {

    @Test
    public void givenSadMoodMessage_shouldReturnSAD() {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("I am in Sad Mood");
        assertEquals("SAD", mood);
    }
}
