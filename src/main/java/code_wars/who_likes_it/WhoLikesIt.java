package main.java.code_wars.who_likes_it;

public class WhoLikesIt {
    public static void main(String[] args) {
        //String[] arr = {};
        //String[] arr = {"Peter"};
        //String[] arr = {"Peter", "Mike"};
        //String[] arr = {"Peter", "Mike", "John"};
        String[] names = {"Peter", "Mike", "John", "Matt"};
        System.out.println("whoLikesIt(arr) = " + whoLikesIt(names));
    }
    public static String whoLikesIt(String[] names){
        if (names.length == 0) return "no one likes this";
        if (names.length == 1) return names[0] + " likes this";
        if (names.length == 2) return names[0] + " and " + names[1] + " like this";
        if (names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        if (names.length >= 4) return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        return null;
    }
}
