package lab11.FirstTask;

public class Logger {
    private static Logger instance = new Logger();
    private Logger (){}
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message){
        logMessage("Log", message);

    }
    public void logInfo(String message){
        logMessage("Info", message);

    }
    public void logWarning(String message){
        logMessage("Warning", message);

    }
    public void logError(String message){
        logMessage("Error", message);

    }
    public  void logMessage(String option, String message){
        System.out.println(option+": "+message);
    }
}
