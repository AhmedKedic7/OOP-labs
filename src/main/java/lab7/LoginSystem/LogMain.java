package lab7.LoginSystem;

import java.sql.SQLOutput;

public class LogMain {
    public static void main(String[] args) {

        Logger recordLogger = new RecordLogger("RecordLogger");
        Logger classLogger = new ClassLogger("ClassLogger");
        logMessageWithLogger(recordLogger, "This is a log message for RecordLogger.");
        logMessageWithLogger(classLogger, "This is a log message for ClassLogger.");



    }
    private static void logMessageWithLogger(Logger logger, String message) {


        logger.logMessage(message);
}
}
