package lab11.ThirdTask;

public class TextEditor {
    private TextFormatter textFormatter;
    public void setTextFormatter(TextFormatter textFormatter){
        this.textFormatter=textFormatter;
    }
    public String formatText(String text){
        if(textFormatter==null){
            throw new IllegalStateException("Text formatter not set.");
        }
        return textFormatter.formatText(text);
    }
}
