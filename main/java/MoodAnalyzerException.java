public class MoodAnalyzerException extends Exception{
    public MoodAnalyzerException(String moodMessage) {
    }

    enum ExceptionType {
            ENTERED_NULL, ENTERED_EMPTY
        }
        ExceptionType type;

    public MoodAnalyzerException(ExceptionType type,String moodMessage)
    {
        super(moodMessage);
        this.type=type;
    }
}
