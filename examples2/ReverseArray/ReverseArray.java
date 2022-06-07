package examples2.ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverse(array);
    }

    private static void reverse(int[] array){
        int[] reverseArray = new int[array.length];
        int newArrayLength = array.length;
        for(int i = 0; i < array.length; i++){
            reverseArray[newArrayLength - 1] = array[i];
            newArrayLength -= 1;
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reverseArray));

    }
}
