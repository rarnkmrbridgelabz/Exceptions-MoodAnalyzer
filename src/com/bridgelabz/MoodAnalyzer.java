package com.bridgelabz;

public class MoodAnalyzer {
    public MoodAnalyzer() {
    }
    public String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public  String analyseMood() {
        try {
            if(this.message.toLowerCase().contains("sad")) {
                return "sad";
            }
            else {
                return  "Happy";
            }
        } catch (NullPointerException e) {
            return null;
        }
    }
}

