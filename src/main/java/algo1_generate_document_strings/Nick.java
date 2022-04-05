package main.java.algo1_generate_document_strings;

public class Nick {

    public static void main(String[] args) {

        System.out.println(canGenerate( "!veDJaCyd vaeo perelo xw",  "Cydeo Java Developer!"));
    }

    public static boolean canGenerate(String avialableStr, String generatedStr) {
        String [] generateArr= generatedStr.split("");
        String avialableStrUpdated="";
        for (int i=0; i<=generatedStr.length()-1; i++){
            avialableStrUpdated=avialableStr.replaceFirst(generateArr[i],"");

            if(avialableStrUpdated.length()==avialableStr.length()){
                return false;
            }
            avialableStr=avialableStrUpdated;
        }
        return true;
    }

}
