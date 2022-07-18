package com.bl.analyzer;

public class MoodAnalyzer {

    public String analyseMood(String message) {
        if (message.contains("Happy"))
            return "Happy";
        return "Sad";
    }
}
