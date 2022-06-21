package main.java.code_wars.consecutive_strings;

public class ConsecutiveStrings {
    public static void main(String[] args) {
        String[] strarr = {"treqe", "foling", "trashy", "blue", "abcdef", "uvwxy"};
        System.out.println("longestConsec(strarr, k) = " + longestConsec(strarr, 3));
    }

    public static String longestConsec(String[] strarr, int k) {
        // your code
        String maxStr = "";
        if(strarr.length == 0 || k > strarr.length || k <= 0){
            return "";
        }

        for(int i = 0; i < strarr.length-k+1; i++){
            String tempResult = "";
            for(int j = 0; j < k; j++){
                tempResult += strarr[i+j];
            }
            if(maxStr.length() < tempResult.length()){
                maxStr = tempResult;
            }
        }
        return maxStr;
    }


}
