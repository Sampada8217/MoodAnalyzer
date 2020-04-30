public class MoodAnalyzer {
    private final String moodMessage;

    public MoodAnalyzer(String moodMessage) {

        this.moodMessage = moodMessage;
    }

    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if(moodMessage.length()==0){
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_EMPTY," ");
            }

            if (moodMessage.contains("I am in Sad Mood")) {
                return "SAD";
            }
            else
                        return "HAPPY";

        } catch (NullPointerException e ) {
               throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL,"NULL");

           }
    }
}


