package main.java.code_wars.exes_ohs;

public class ExesOhs {

    public static void main(String[] args) {
        System.out.println("equals(\"xoxoxxx\") = " + equals("xoxoxxx"));
        System.out.println("equals(\"xoxo\") = " + equals("xoxo"));
    }

    public static boolean equals(String str){
        int countX = 0;
        int countO = 0;
        for (Character ch : str.toLowerCase().toCharArray()) {
            if (ch == 'x'){
                countX++;
            }else if (ch == 'o'){
                countO++;
            }
        }
        return countX == countO;
    }
}
