package examples2.MinElementChallenge;

import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(5)));

    }

    public static int[] readIntegers(int count) {
        int[] intArray = new int[count];
        int counter = 0;
        while(counter < count) {
            System.out.println("Enter element #" + counter);
            int number = scanner.nextInt();
            scanner.nextLine();
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                intArray[counter] = number;
            }else{
                System.out.println("Invalid number");
                continue;
            }
            counter++;
        }
        return intArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length - 1; i++){
            int temporaryMin = Math.min(array[i], array[i + 1]);
            if(temporaryMin < min){
                min = temporaryMin;
            }
        }
        return min;
    }
}