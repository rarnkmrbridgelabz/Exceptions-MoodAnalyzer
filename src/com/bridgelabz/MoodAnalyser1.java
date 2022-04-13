package com.bridgelabz;

public class MoodAnalyser1 {
    public static void main(String[] args) {
        MoodAnalyser1 moodAnalyser = new MoodAnalyser1();
        System.out.println("Welcome to MoodAnalyser:");
        String str = "I am in sad mood";
        System.out.println(str);
        System.out.println(moodAnalyser.analyseMood1(str));
    }

    public static boolean analyseMood1(String str) {
        String find = "sad";
        String mood = null;
        int i = str.indexOf(find);
        if(i>0) {
            mood = find;
        }
        else {
            mood = "Happy";
        }
        return true;
    }
}
