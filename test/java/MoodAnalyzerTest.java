import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void analyzeSadMood() {
       MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
       String mood=moodAnalyzer.analyzeMood("I am in sad Mood");
       Assert.assertEquals("SAD",mood);
    }

    @Test
    public void analyzeAnyMood() {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",mood);

    }
}
