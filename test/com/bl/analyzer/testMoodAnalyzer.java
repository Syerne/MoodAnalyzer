package com.bl.analyzer;

import org.junit.Assert;
import org.junit.Test;

public class testMoodAnalyzer {

    @Test
    public void givenMessageContainsSAD_WhenTrue_ShouldReturnSad() {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = analyzer.analyseMood();
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessageContainsAnyMood_WhenTrue_ShouldReturnHappy() {
        try {
            MoodAnalyzer analyzer = new MoodAnalyzer(null);
            String mood = analyzer.analyseMood();
            Assert.assertEquals("Happy", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}
