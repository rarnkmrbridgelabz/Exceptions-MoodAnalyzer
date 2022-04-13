package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class MoodAnalyzer {

        List<String> list = new ArrayList<>();
        String sad1 = "Sad";
        String sad2 = "sad";

        public static void main(String[] args) {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer();
            System.out.println("Welcome to MoodAnalyser:");
            String str = "I am in any mood";
            System.out.println(str);
            System.out.println(moodAnalyser.analyseMood(str));
        }

        private String analyseMood(String str) {
            String find = "sad";
            String mood = null;
            int i = str.indexOf(find);
            if(i>0) {
                mood = find;
            }
            else {
                mood = "Happy";
            }
            return mood;
        }
    }

