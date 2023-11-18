package lab7.LoginSystem;

public record RecordLogger(String loggerName) implements Logger{
    @Override
    public void logMessage(String message) {
        System.out.println(loggerName + ": " + message);
    }
}
