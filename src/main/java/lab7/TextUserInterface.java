package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextUserInterface {private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        HashMap<String, String> statements = new HashMap<>();
        statements.put("add", "adds a word pair to the dictionary");
        statements.put("translate", "asks a word and prints its translation");
        statements.put("quit", "quits the text user interface");

        System.out.println("Statements: ");
        for(Map.Entry<String, String> statement : statements.entrySet()) {
            System.out.println(" " + statement.getKey() + " - " + statement.getValue());
        }

        boolean running = true;

        while(running) {
            System.out.println();
            System.out.print("Statement: ");
            String statement = this.reader.nextLine();

            switch(statement) {
                case "quit":
                    System.out.println("Cheers!");
                    running = false;
                    break;

                case "add":
                    System.out.print("In Finnish:");
                    String finnishWord = reader.nextLine();
                    System.out.print("Translation: ");
                    String translatedWord = reader.nextLine();
                    this.dictionary.add(finnishWord, translatedWord);
                    break;

                case "translate":
                    System.out.print("Give a word: ");
                    String givenWord = reader.nextLine();
                    System.out.println("Translation: "+ dictionary.translate(givenWord));
                    break;

                default:
                    System.out.println("Unknown statement");
            }
        }
    }
}
