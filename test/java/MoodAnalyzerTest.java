import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {

    @Test
    public void analyzeSadMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer1.analyzeMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void analyzeHappyMood() throws MoodAnalyzerException {

        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in Happy Mood");
        String mood1 = moodAnalyzer2.analyzeMood();
        Assert.assertEquals("HAPPY", mood1);

    }

    @Test
    public void CatchException() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer =new MoodAnalyzer(null);
        try {

            //ExpectedException expectedException = ExpectedException.none();
            //expectedException.expect(MoodAnalyzerException.class);
            //expectedException.expectMessage("There is no mood");
            moodAnalyzer.analyzeMood();
        }catch(MoodAnalyzerException e){
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_NULL,e.type);
        }

    }

    @Test
    public void CatchExceptionEmpty() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(" ");
        try{
            moodAnalyzer.analyzeMood();
        }catch (MoodAnalyzerException e)
        {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}

