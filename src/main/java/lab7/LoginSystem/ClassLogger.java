package lab7.LoginSystem;

public class ClassLogger implements Logger{
    private String name;

    public ClassLogger(String name) {
        this.name = name;
    }

    @Override
    public void logMessage(String message) {
        System.out.println(name + ": " + message);
    }
}
