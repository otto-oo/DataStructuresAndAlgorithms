package main.java.hacker_ranks.a_square_of_squares;

public class ASquareOfSquares {
    public static void main(String[] args) {
        System.out.println("aSquareOfSquares(5) = " + aSquareOfSquares(5));
    }
    public static boolean aSquareOfSquares(int number){
        for (int i = 0; i < 100; i++){
            if (number == i * i){
                return true;
            }
        }
        return false;
    }
}
