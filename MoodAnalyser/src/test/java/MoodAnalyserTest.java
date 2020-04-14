import com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void testHappy()
    {
        String userMood = "Happy";
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.moodAnalyaser(userMood);
        Assert.assertEquals("Happy",userMood);
    }
    @Test
    public void testSad()
    {
        String userMood = "Sad";
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.moodAnalyaser(userMood);
        Assert.assertEquals("Sad",mood);
    }
    @Test
    public void testCaseInvalid()
    {
        String userMood = "Nothing";
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.moodAnalyaser(userMood);
        Assert.assertEquals("InvalidMood",mood);

    }

}
