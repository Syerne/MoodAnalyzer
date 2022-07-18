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
}
