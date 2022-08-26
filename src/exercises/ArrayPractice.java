package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";


//        for(int i = 0; i < myArray.length; i++) {
//            if (myArray[i] % 2 == 0) {
//                continue;
//            }
//            System.out.println(myArray[i]);
//        }

        String[] words = phrase.split("\\.");
        System.out.println(words);
        System.out.println(Arrays.toString(words));




    }
}
