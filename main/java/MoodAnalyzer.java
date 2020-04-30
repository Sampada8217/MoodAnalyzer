public class MoodAnalyzer {
    private final String moodMessage;

    public MoodAnalyzer(String moodMessage) {

        this.moodMessage = moodMessage;
    }

    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if (moodMessage.contains("I am in Sad Mood")) {
                return "SAD";
            }
            else
                return "HAPPY";

            } catch (NullPointerException e ) {
               throw new MoodAnalyzerException("Please Enter Another message");
           }
    }
}


