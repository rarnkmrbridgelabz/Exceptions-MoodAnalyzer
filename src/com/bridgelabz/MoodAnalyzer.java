package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class MoodAnalyzer {
    public String message;

    public MoodAnalyzer(String message){
        this.message = message;
    }
    public  String analyseMood() {
        if(this.message.toLowerCase().contains("sad")) {
            return "sad";
        }
        else {
            return  "Happy";
        }
    }

    }

