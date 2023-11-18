package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    HashMap<String, String> dictionary = new HashMap<>();

    public Dictionary() {

    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }

    public String translate(String word) {
        return dictionary.containsKey(word) ? dictionary.get(word) : null;
    }

    public int amountOfWords() {
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<>();
        for(Map.Entry<String, String> word : dictionary.entrySet()) {
            translationList.add(word.getKey() + " = " + word.getValue());
        }
        return translationList;
    }
}
