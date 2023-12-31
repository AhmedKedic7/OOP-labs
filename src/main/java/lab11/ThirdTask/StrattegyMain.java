package lab11.ThirdTask;

public class StrattegyMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();


        textEditor.setTextFormatter(new UpperCaseFormatter());
        String upperCaseResult = textEditor.formatText("Hello World!");
        System.out.println("Upper Case: " + upperCaseResult);

        textEditor.setTextFormatter(new LowerCaseFormatter());
        String lowerCaseResult = textEditor.formatText("Hello World!");
        System.out.println("Lower Case: " + lowerCaseResult);

        textEditor.setTextFormatter(new CamelCaseFormatter());
        String camelCaseResult = textEditor.formatText("Hello World!");
        System.out.println("Camel Case: " + camelCaseResult);
    }
}
