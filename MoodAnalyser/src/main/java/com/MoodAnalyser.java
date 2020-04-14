package com;

public class MoodAnalyser
{
    public String moodAnalyaser(String mood)
    {
        if ("Happy".contains(mood)) {
            return "Happy";
        }
        else if("Sad".contains(mood))
        {
            return "Sad";
        }
        else
        {
            return "InvalidMood";
        }
    }
}
