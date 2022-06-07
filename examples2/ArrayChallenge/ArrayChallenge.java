package examples2.ArrayChallenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ArrayChallenge {
    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int size = 5;
        printArray(size);

    }

    public static int[] getIntegers(int size){
        int[] unsortedArray = new int[size];
        for(int i = 0; i < unsortedArray.length; i++){
            unsortedArray[i] = scanner.nextInt();
        }
        return unsortedArray;
    }

    public static void printArray(int size){
        int[] array = sortIntegers(size);
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int size){
        int[] sortedIntegers = getIntegers(size);
        int temporary = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedIntegers.length - 1; i++){
                if(sortedIntegers[i] < sortedIntegers[i + 1]){
                    temporary = sortedIntegers[i+1];
                    sortedIntegers[i + 1] = sortedIntegers[i];
                    sortedIntegers[i] = temporary;
                    flag = true;

                }
            }
        }

        return sortedIntegers;
    }


}
