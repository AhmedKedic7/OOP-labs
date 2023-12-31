package lab11.FirstTask;

public class SingletonMain {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.logInfo("Welcome to Kedi's program!");
        logger.log("Processing...");
        logger.logWarning("Low battery!");
        logger.logError("Program crashed!");
    }
}
