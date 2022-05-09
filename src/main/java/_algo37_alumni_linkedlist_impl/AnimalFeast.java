package main.java._algo37_alumni_linkedlist_impl;

public class AnimalFeast {

    /*
    All the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start
    and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and
    the chickadee is bringing chocolate cake.

    Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate
    whether the beast is allowed to bring the dish to the feast.

    Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish may
    contain hyphens and spaces, but these will not appear at the beginning or end of the string.
    They will not contain numerals.
    */

    public static void main(String[] args) {
        System.out.println("isAnimalDish(\"cat\", \"fish\") = " + isAnimalDishEquals("cat", "fish"));
        System.out.println("isAnimalDish(\"cat\", \"carrot\") = " + isAnimalDishEquals("cat", "carrot"));
        System.out.println("isAnimalDishEquals(\"cat\", \"cookie\") = " + isAnimalDishEquals("cat", "cookie"));
        System.out.println("isAnimalDishEquals(\"cat\", \"meat\") = " + isAnimalDishEquals("cat", "meat"));
    }

    public static boolean isAnimalDishEquals(String animalName, String dishName){

        return animalName.substring(0, 1).equals(dishName.substring(0, 1)) && animalName.substring(animalName.length() - 1).equals(dishName.substring(dishName.length() - 1));
    }


}
