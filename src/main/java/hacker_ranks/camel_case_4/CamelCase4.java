package main.java.hacker_ranks.camel_case_4;

import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()){
            String word = scanner.nextLine();
            System.out.println(findSolution(word));
        }
        scanner.close();
    }

    private static String findSolution(String word){
        String[] wordArray = word.split(";");
        char operation = wordArray[0].charAt(0);
        char type = wordArray[1].charAt(0);
        char[] wordCharArray = wordArray[2].toCharArray();
        String result = "";

        if (operation == 'S') {
            for(int i = 0; i < wordCharArray.length; i++){
                if (Character.isUpperCase(wordCharArray[i])){
                    if (i == 0) {
                        result += Character.toLowerCase(wordCharArray[0]);
                    }else{
                        result += " " + Character.toLowerCase(wordCharArray[i]);
                    }
                }else if (wordCharArray[i] !='(' && wordCharArray[i] !=')') {
                    result += wordCharArray[i];
                }
            }
        }else{
            for(int i = 0; i < wordCharArray.length; i++){
                if (i==0 && type == 'C') {
                    result += Character.toUpperCase(wordCharArray[0]);
                    continue;
                }
                if (wordCharArray[i]==' ') {
                    result += Character.toUpperCase(wordCharArray[i+1]);
                    i++;
                }else {
                    result += wordCharArray[i];
                }
            }
            if (type=='M') {
                result += "()";
            }
        }




        return result;
    }
}
