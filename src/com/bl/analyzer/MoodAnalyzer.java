package com.bl.analyzer;

public class MoodAnalyzer {

    public String analyseMood(String message) {
        //MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        if (message.contains("Happy"))
            return "Happy";
        return "Sad";
    }
}
