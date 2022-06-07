package exapmles;

import java.util.Scanner;

public class Examples {
    private final static String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] agrs) {
//        printMegaBytesAndKiloBytes(2049);
//        System.out.println(isLeapYear(2700));
//        System.out.println(areEqualByThreeDecimalPlaces(1.45846484, 1.4584));
//        calcFeetAndInchesToCentimeter(100);
//        System.out.println(getDurationString(546846465L, 8464684L));
//        System.out.println(getDurationString(456844568546L));
//        System.out.println(area(54));
//        System.out.println(area(45, 65));
//        printYearsAndDays(48465128468L);
//        printEqual(45, 45, 45);
//        switchTest('e');
//        printDayOfAWeek(7);
//        printNumberInWord(7);
//        System.out.println(getDaysInMonth(2, 2013));
//        interestLoop(200000);
//        printPrimeNumbers();
//        sum();
//        System.out.println(sumOdd(5, 45));
//        System.out.println(isEvenNumber(4));
//        whileLoop(4, 20);
//        System.out.println(sumDigits(14568));
//        System.out.println(isPalindrome(-12321));
//        System.out.println(sumFirstAndLastDigit(456));
//        System.out.println(getEvenDigitSum(123456));
//        System.out.println(hasSharedDigit(12, 14));
//        System.out.println(hasSameLastDigit(23, 457, 327));
//        System.out.println(getGreatestCommonDivisor(65, 78));
//        printFactors(90);
//        System.out.println(isPerfectNumber(28));
//        numberToWords(0);
//       System.out.println(reverse(-1234));
//        System.out.println(getDigitNumber(12034));
//        System.out.println(canPack(1,0,4));
//        System.out.println(getLargestPrime(21));
//        printSquareStar(5);
//        sumNumbers();
//        minAndMaxChallange();
//        inputThenPrintSumAndAverage();
//        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
//        System.out.println(getBucketCount(7.25, 4.3, 2.35));
//        System.out.println(getBucketCount(3.26, 0.75));
        sumNumbers();
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            int megabytes = kiloBytes / 1024;
            int kilobytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay > 23 || hourOfDay < 0) {
            return false;
        }
        if ((isBarking == true) && ((hourOfDay < 8) || (hourOfDay > 22))) {
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year > 9999 || year < 1) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month > 12 || month <= 0) || (year > 9999 || year < 1)) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 30;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber *= 1000;
        secondNumber *= 1000;
        if (((int) secondNumber == (int) firstNumber)) {
            return true;
        }
        return false;
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int sum) {
        if ((firstNumber + secondNumber) == sum) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber > 13 && firstNumber <= 19) || (secondNumber > 13 && secondNumber <= 19) || (thirdNumber > 13 && thirdNumber <= 19)) {
            return true;
        }
        return false;
    }

    public static double calcFeetAndInchesToCentimeter(int feet, int inches) {
        if ((feet < 0) || (inches < 0 && inches >= 12)) {
            return -1;
        }

        return (((feet * 12) + inches) * 2.54);
    }

    public static double calcFeetAndInchesToCentimeter(int inches) {
        if (inches < 0) {
            return -1;
        }
        int feet = inches / 12;
        inches = inches % 12;
        System.out.println(feet + " feet " + inches + " inches");
        return calcFeetAndInchesToCentimeter(feet, inches);
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0)) {
            return INVALID_VALUE_MESSAGE;
        }
        if (seconds >= 60) {
            minutes = minutes + (seconds / 60);
            seconds = seconds % 60;
        }
        long hours = minutes / 60;
        minutes = minutes % 60;
        String hoursString = hours + "h ";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = minutes + "m ";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return (Math.pow(radius, 2)) * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long years = minutes / 525600L;
            long remainingMinutes = minutes % 525600L;
            long days = remainingMinutes / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

    public static void printEqual(int number1, int number2, int number3) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            System.out.println("Invalid Value");
        } else if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else if ((number1 != number2 && number1 == number3) || (number2 != number3 && number1 == number2) || (number1 != number3 && number2 == number3)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    public static boolean isPlaying(boolean summer, int temperature) {
        if (summer == true && (temperature > 45 && temperature < 25)) {
            return true;
        } else if (summer == false && (temperature < 35 && temperature > 25)) {
            return true;
        } else {
            return false;
        }
    }

    public static void switchTest(char letter) {
        switch (letter) {
            case 'a':
                System.out.println("found a");
                break;
            case 'b':
                System.out.println("found b");
                break;
            case 'c':
                System.out.println("found c");
                break;
            case 'd':
                System.out.println("found d");
                break;
            case 'e':
                System.out.println("found e");
                break;
            default:
                System.out.println("not a, b, c, d or e");

        }
    }

    public static void printDayOfAWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
        }
    }

    public static void interestLoop(double amount) {
        for (int i = 12; i >= 0; i--) {
            System.out.println(amount + " * " + i + "% = " + String.format("%.5f", calculateInterest(amount, i)));
        }
    }

    public static double calculateInterest(double amount, double percentage) {
        return (amount * (percentage / 100));
    }


    public static void printPrimeNumbers() {
        int numberOfPrimes = 0;
        for (long i = 10L; i < 100L; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                numberOfPrimes++;
            }
            if (numberOfPrimes == 50) {
                break;
            }
        }
    }

    public static void sum() {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sum = sum + i;
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if ((start > end) && (start > 0) && (end > 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum = +i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void whileLoop(int number, int finish) {
        int count = 0;
        while (number <= finish) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even Number" + number);
            count++;
            if (count == 5) {
                break;
            }
        }
        System.out.println("Even numbers found" + count);
    }

    public static int sumDigits(int number) {
        int digit;
        int sum = 0;
        if (number < 10) {
            return -1;
        }
        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        int palidromeNumberFirst = 0;
        int palidromeNumberSecond = Math.abs(number);
        int digit;

        while (palidromeNumberSecond > 0) {
            digit = palidromeNumberSecond % 10;
            palidromeNumberSecond /= 10;
            palidromeNumberFirst *= 10;
            palidromeNumberFirst += digit;

        }
        if (number < 0) {
            palidromeNumberFirst *= -1;
        }

        if (palidromeNumberFirst == number) {
            return true;
        }
        return false;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return number * 2;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int digit = 0;
        int sum = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99))) {
            return false;
        }

        int number1FirstDigit;
        int number1SecondDigit;
        int number2FirstDigit;
        int number2SecondDigit;

        number1FirstDigit = number1 % 10;
        number1 /= 10;
        number1SecondDigit = number1 % 10;

        number2FirstDigit = number2 % 10;
        number2 /= 10;
        number2SecondDigit = number2 % 10;

        if (number1FirstDigit == number2FirstDigit || number1FirstDigit == number2SecondDigit
                || number1SecondDigit == number2FirstDigit || number1SecondDigit == number2SecondDigit) {
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (!isValid(number1) || !isValid(number2) || !isValid(number3)) {
            return false;
        }

        int number1LastDigit;
        int number2LastDigit;
        int number3LastDigit;

        number1LastDigit = number1 % 10;
        number2LastDigit = number2 % 10;
        number3LastDigit = number3 % 10;

        if (number1LastDigit == number2LastDigit || number1LastDigit == number3LastDigit || number2LastDigit == number3LastDigit) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if ((number < 10 || number > 1000)) {
            return false;
        }
        return true;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int firstDivisor = 0;
        int secondDivisor = 0;

        for (int i = first; i > 0; i--) {
            if (first % i == 0) {
                firstDivisor = i;
            }
            for (int j = second; j > 0; j--) {
                if (second % j == 0) {
                    secondDivisor = j;
                }
                if (firstDivisor == secondDivisor) {
                    return firstDivisor;
                }
            }
        }
        return 0;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int factor;
        int count = 1;
        while (count <= number) {
            if (number % count == 0) {
                factor = count;
                System.out.println(factor);
            }
            count++;
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int factor = 0;
        int count = 1;
        int sum = 0;
        while (count < number) {
            if (number % count == 0) {
                factor = count;
                sum += factor;
            }
            count++;

        }
        if (sum == number) {
            return true;
        }
        return false;

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        int whileNumber = reverse(number);
        while (whileNumber > 0) {
            int digit = whileNumber % 10;
            switch (digit) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            whileNumber /= 10;
        }
        if (getDigitCount(number) != getDigitCount(reverse(number))) {
            int count = getDigitCount(number) - getDigitCount(reverse(number));
            while (count > 0) {
                System.out.println("Zero");
                count--;
            }
        }
    }

    public static int reverse(int number) {
        int numberToReverse = Math.abs(number);
        int reverseNumber = 0;
        int digit;
        while (numberToReverse > 0) {
            reverseNumber *= 10;
            digit = numberToReverse % 10;
            reverseNumber += digit;
            numberToReverse /= 10;
        }
        if (number < 0) {
            reverseNumber *= -1;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitNumber = 0;
        while (number > 0) {
            number /= 10;
            digitNumber++;
        }
        return digitNumber;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (smallCount < 0 || bigCount < 0 || goal < 0) {
            return false;
        }
        if (goal > bigCount * 5 + smallCount) {
            return false;
        }
        if (goal % 5 > smallCount) {
            return false;
        }
        return true;
    }

    public static boolean isPrimeNumber(long number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrime(int number) {
        if (number <= 0 || number <= 1) {
            return -1;
        }
        int largestPrime = 2;
        while (largestPrime < number) {
            if (number % largestPrime != 0) {
                largestPrime++;
            } else {
                number = number / largestPrime;

            }
        }
        return number;
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid number");
            return;
        }
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (col == 1 || row == 1 || col == number || row == number) {
                    System.out.print("*");
                } else if (row == col) {
                    System.out.print("*");
                } else if (col == (number - row + 1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 1;
        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
                continue;
            }
            count++;
        }
        System.out.println(sum);
    }

    public static void minAndMaxChallange() {
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number");
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int number = scanner.nextInt();
//                if(maxNumber == 0 && minNumber == 0){
//                    maxNumber = number;
//                    minNumber = number;
//                }
                if (number > maxNumber) {
                    maxNumber = number;
                } else if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
        }
        System.out.println("Max Number: " + maxNumber);
        System.out.println("Min Number: " + minNumber);
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 1;
        long avg = 0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                int number = scanner.nextInt();
                sum += number;
                avg = (long) sum / count;
                avg = Math.round(avg);
                count++;
            }else{
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0){
            return -1;
        }
        return (int) Math.ceil((((width * height) / areaPerBucket)) - extraBuckets);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil(((width * height) / areaPerBucket));
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil((area / areaPerBucket));
    }
}