package main.java._001_generate_document_strings;

import java.util.HashMap;
import java.util.Map;

public class MapSolution {

    public static void main(String[] args) {
        String character = "!veDJaCyd vaeo perelo xw";
        String document  = "Cydeo Java Developer!";                   // expected
        //String document  = "";                                        // ""
        //String document  = "Cydeo Java Developer!eeeeeeellll";        // chars.length()<doc.length()
        //String document  = "Cydeo Java Developer!X";                    // document has a character that character does not contain

        System.out.println("generateDocumentStrings(character, document) = " + generateDocs(character, document));
    }

    // time complexity O(n), space complexity O(n)
    public static boolean generateDocs(String chars, String doc){
        if (doc.equals("")) return true;
        if (chars.length()<doc.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : chars.toCharArray()){                       // character puts in the map with ch (key) and int (value of occurrence)
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }

        for (Character ch : doc.toCharArray()){                         // searching ch for document in the map.
            if (!map.containsKey(ch) || map.get(ch) == 0){
                return false;                                           // map does not contain ch of doc OR value of ch is 0
            }
            map.put(ch, map.get(ch) - 1);                               // if not update the value of ch
        }
        return true;
    }

}
