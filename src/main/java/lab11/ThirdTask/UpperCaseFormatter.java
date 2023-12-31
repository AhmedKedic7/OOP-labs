package lab11.ThirdTask;

public class UpperCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
