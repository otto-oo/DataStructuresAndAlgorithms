package main.java.code_wars.who_likes_it;

public class WhoLikesIt {
    public static void main(String[] args) {
        //String[] arr = {};
        //String[] arr = {"Peter"};
        //String[] arr = {"Peter", "Mike"};
        //String[] arr = {"Peter", "Mike", "John"};
        String[] arr = {"Peter", "Mike", "John", "Matt"};
        System.out.println("whoLikesIt(arr) = " + whoLikesIt(arr));
    }
    public static String whoLikesIt(String[] arr){
        if (arr.length == 0){
            return "no one likes this";
        }
        if (arr.length == 1){
            return arr[0] + " likes this";
        }
        if (arr.length == 2){
            return arr[0] + " and " + arr[1] + " like this";
        }
        if (arr.length == 3){
            return arr[0] + ", " + arr[1] + " and " + arr[2] + " like this";
        }
        if (arr.length >= 4){
            return arr[0] + ", " + arr[1] + " and " + " 2 others like this";
        }
        return null;
    }
}
