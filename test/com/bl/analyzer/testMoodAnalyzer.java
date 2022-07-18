package com.bl.analyzer;

import org.junit.Assert;
import org.junit.Test;

public class testMoodAnalyzer {

    @Test
    public void givenMessageContainsSAD_WhenTrue_ShouldReturnSad() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseMood("I am in Sad Mood");
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessageContainsAnyMood_WhenTrue_ShouldReturnHappy() {
        MoodAnalyzer analyzer = new MoodAnalyzer();
        String mood = analyzer.analyseMood("I am in Any Mood");
        Assert.assertEquals("Happy", mood);
    }
}
