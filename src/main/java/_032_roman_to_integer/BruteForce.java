package main.java._032_roman_to_integer;

public class BruteForce {

    public static void main(String[] args) {
        int number = romanToInteger("MDC");
        System.out.println("number = " + number);

    }

    public static int romanToInteger(String s){
        int sum = 0;
        boolean beforeI = false;                        // check letter if before
        boolean beforeLC = false;
        boolean beforeDM = false;
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){                       // checking all of the letters 'V', 'L', 'D', 'M', 'I', 'X', 'C'
                case 'V':
                    if(beforeI){
                        sum = sum + 3;
                        beforeI = false;
                    }else{
                        sum += 5;
                        beforeI = true;
                    }
                    break;
                case 'L':
                    if(beforeLC){
                        sum = sum + 30;
                        beforeLC = false;
                    }else{
                        sum += 50;
                        beforeLC = true;
                    }
                    break;
                case 'D':
                    if(beforeDM){
                        sum = sum + 300;
                        beforeDM = false;
                    }else{
                        sum += 500;
                        beforeDM = true;
                    }
                    break;
                case 'M':
                    if(beforeDM){
                        sum = sum + 800;
                        beforeDM = false;
                    }else{
                        sum += 1000;
                    }
                    break;
                case 'I':
                    sum += 1;
                    beforeI = true;
                    break;
                case 'X':
                    if(beforeI){
                        sum = sum + 8;
                        beforeI = false;
                    }else{
                        sum += 10;
                        beforeLC = true;
                    }
                    break;
                case 'C':
                    if(beforeLC){
                        sum = sum + 80;
                        beforeLC = false;
                    }else{
                        sum += 100;
                        beforeDM = true;
                    }
                    break;
                default:
                    System.out.println("There is no such Roman Literal");
                    break;
            }
        }
        return sum;
    }
}
