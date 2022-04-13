package main.java._001_generate_document_strings;

public class StringSolution {

    public static void main(String[] args) {

        System.out.println(canGenerate( "!veDJaCyd vaeo perelo xw",  "Cydeo Java Developer!"));
    }

    public static boolean canGenerate(String avialableStr, String generatedStr) {
        String [] generateArr= generatedStr.split("");                              // All characters to the String Array
        String avialableStrUpdated="";
        for (int i=0; i<=generatedStr.length()-1; i++){
            avialableStrUpdated=avialableStr.replaceFirst(generateArr[i],"");  // Replace char with ""

            if(avialableStrUpdated.length()==avialableStr.length()){                      // if lengths are same return false
                return false;
            }
            avialableStr=avialableStrUpdated;
        }
        return true;
    }

}
