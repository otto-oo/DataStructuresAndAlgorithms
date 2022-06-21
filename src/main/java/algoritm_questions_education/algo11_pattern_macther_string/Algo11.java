package main.java.algoritm_questions_education.algo11_pattern_macther_string;

public class Algo11 {

    public static void main(String[] args) {
        System.out.println("patternMatcher(\"xxyxxy\", \"gogopowerrangergogopowerranger\") = " + patternMatcher("xxyxxy", "gogopowerrangergogopowerranger"));
    }

    public static boolean patternMatcher(String pattern, String text){

        if (pattern.isEmpty() || text.isEmpty()) {
            return false;
        }

        //char[] patternArray = pattern.toCharArray();

        return true;

    }
}
