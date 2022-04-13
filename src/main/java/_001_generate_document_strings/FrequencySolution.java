package main.java._001_generate_document_strings;

public class FrequencySolution {

    public static void main(String[] args) {
        String character = "!veDJaCyd vaeo perelo xw";
        String document  = "Cydeo Java Developer!";

        System.out.println("generateDocumentStrings(character, document) = " + generateDocumentStrings(character, document));
    }

    // time complexity O(n^2), space complexity O(n)
    public static boolean generateDocumentStrings(String character, String document){

        for (int i = 0; i < document.length(); i++){        // base string is document, logic depends on document string
            char letter = document.charAt(i);
            int frequencyCharacter = 0;
            int frequencyDocument = 0;
            for(int j = 0; j < character.length(); j++){    // checking frequency of letter for character string
                if (character.charAt(j) == letter){
                    frequencyCharacter++;
                }
            }
            for(int k = 0; k < document.length(); k++){     // checking frequency of letter for document string
                if (document.charAt(k) == letter){
                    frequencyDocument++;
                }
            }
            if(frequencyDocument <= frequencyCharacter){    // comparing two frequency
                continue;
            }else return false;
        }
        return true;
    }

}
