package com.bridgelabz;

class MoodAnalysisException extends Exception{
    String message;
    public MoodAnalysisException(String message){
        this.message = message;
    }
}
public class MoodAnalyzer {
    public static String message;

    public MoodAnalyser(String s){
    };

    public void MoodAnalysisException(String message){
        this.message = message;
    }
    public  String analyseMood() throws MoodAnalysisException {
        try {
            if (this.message.toLowerCase().contains("sad")) {
                throw new MoodAnalysisException("Invalid Mood");
            } else if (this.message.toLowerCase().contains("Happy")) {
                return "Happy";
            } else if (message.isEmpty() || message == null){
                return "Happy(null)";
            }
            else
                return "No match";
        }
        catch (NullPointerException e) {
            throw new MoodAnalysisException("Invalid Mood");
        }
        catch (MoodAnalysisException e) {
            e.printStackTrace();
            return "Invalid Mood";
        }
    }
}

