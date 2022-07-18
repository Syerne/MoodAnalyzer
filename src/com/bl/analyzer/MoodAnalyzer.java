package com.bl.analyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public MoodAnalyzer() {

    }

    public String analyseMood() {
        try {
            if (message.contains("Sad"))
                return "Sad";
            return "Happy";
        }catch (NullPointerException e){
            return "Happy";
        }
    }
}
