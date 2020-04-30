public class MoodAnalyzer {
    private String moodMessage;

    public MoodAnalyzer(String moodMessage) {

        this.moodMessage = moodMessage;
    }

    public String analyzeMood() {
        try
        {
            if (moodMessage == "I am in Sad Mood") {
            return "SAD";
            }
            return "HAPPY";
         }catch (Exception NullPointerException)
        {
            return "HAPPY";
        }
}}

