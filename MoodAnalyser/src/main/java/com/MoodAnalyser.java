package com;

public class MoodAnalyser
{
    public String moodAnalyaser(String mood)
    {
        if ("Happy".contains(mood)) {
            return "Happy";
        }
        else
        {
            return "Sad";
        }
    }
}
