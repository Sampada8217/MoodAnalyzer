public class MoodAnalyzer {
    private String moodMessage;

    public MoodAnalyzer(String moodMessage) {
        this.moodMessage=moodMessage;
    }

    public String analyzeMood()
    {
        if(moodMessage=="I am in Sad Mood")
        {
            return "SAD";
        }
        else
            return "HAPPY";
    }

}
