package main.java._001_generate_document_strings;

public class StringSolution {

    public static void main(String[] args) {

        System.out.println(canGenerate( "!veDJaCyd vaeo perelo xw",  "Cydeo Java Developer!"));
    }

    // time complexity O(n), space complexity O(n)
    public static boolean canGenerate(String availableStr, String generatedStr) {
        String [] generateArr= generatedStr.split("");                              // All characters to the String Array
        String availableStrUpdated="";
        for (int i=0; i<=generatedStr.length()-1; i++){
            availableStrUpdated=availableStr.replaceFirst(generateArr[i],"");  // Replace char with ""
            if(availableStrUpdated.length()==availableStr.length()){                      // if lengths are same return false
                return false;
            }
            availableStr=availableStrUpdated;
        }
        return true;
    }

}
