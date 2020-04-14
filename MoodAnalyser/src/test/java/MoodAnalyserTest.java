import com.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void testHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.moodAnalyaser("Happy");
        Assert.assertEquals("Happy",mood);
    }
    @Test
    public void testSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood =moodAnalyser.moodAnalyaser("Sad");
        Assert.assertEquals("Sad",mood);
    }

}
