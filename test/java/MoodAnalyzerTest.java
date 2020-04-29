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

    }

