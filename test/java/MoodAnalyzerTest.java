import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void analyzeSadMood() {
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer1.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void analyzeHappyMood() {

        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in Happy Mood");
        String mood1 = moodAnalyzer2.analyzeMood();
        Assert.assertEquals("HAPPY", mood1);

    }

    @Test
    public void CatchException() {
        MoodAnalyzer moodAnalyzer =new MoodAnalyzer(null);
        String mood2=moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood2);


    }
}

