package com.company;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
    static byte[] myArray = new byte[10];
    static int i=0;

    public static void main(String[] args) {
        Assignment1();
        Assignment2();
        Assignment3();
    }

    static void Assignment1() {
        int[] array = {5, 3, 7, 6, 2, 8};
        //for loop
        System.out.println("For loop:");
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
        //for each
        System.out.println("For each loop:");
        for (int tempVar : array)
            System.out.println(tempVar);
        //while
        //System.out.println("While loop:");
        //   int i=0;
        //    while (i<array.length) {
        //        System.out.println(array[i]);
        //       i++;
        //  }
        //do while loop
        System.out.println("Do while loop:");
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        }
        while (i < array.length);
    }

    static void Assignment2() {
        int[] array2 = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        //negative elements
        System.out.println("Negative elements in the array are: ");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < 0) {
                System.out.println(array2[i]);
            }
        }
        //odd elements
        int oddnumber = 0;
        System.out.println("Odd numbers in the array are:");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 != 0) {
                System.out.println(array2[i]);
            oddnumber++;
            }
            }
        System.out.println("There are "+ oddnumber + " odd numbers in the array.");
       //if there are multiple elements
        System.out.println("Dublicate verification: ");
        boolean doEqualsExist = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (array2[i] == array2[j]) {
                    doEqualsExist = true;
                }
            }
        }
        if (doEqualsExist) {
            System.out.println("There are elements with the same value.");
        } else {
            System.out.println("There are no elements with the same value.");
        }
//each second element
        System.out.println("Each second element of the array is: ");
        for (int i = 1; i < array2.length; i = i + 2) {
            System.out.println(array2[i]);
        }
//array average
        System.out.println("The average of the array is: ");
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum = sum + array2[i];
        }
        double averageValue = sum / array2.length;
        System.out.println(averageValue);

        //smaller than average
        int smallerThanAverageCount = 0;

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < averageValue) {
                //System.out.println(myArray1[i]);
                smallerThanAverageCount++;
            }
        }
        System.out.println("There are " + smallerThanAverageCount + " elements smaller than average (" + averageValue + ".");
    }

    static void Assignment3() {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter 10 grades: ");
            for (int i = 0; i < myArray.length; i++) {

                while (!scanner.hasNextByte()) {
                    System.out.println("That's not a number! Enter valid grade:");
                    scanner.next();
                }

                byte element = scanner.nextByte();
                if ((element <= 10 && element >= 0)) {
                    myArray[i] = element;
                } else {
                    i--;
                    System.out.println("Please, enter valid value!");
                }
            }
// histogram
            int[] grades = new int[11];
            int counter = 0;
            for (i = 0; i < grades.length; i++) {
                counter = 0;
                for (int j = 0; j < myArray.length; j++) {
                    if (i == myArray[j]) {
                        counter++;
                    }
                }
                grades[i] = counter;
            }
            for (int i = 0; i < grades.length; i++) {
                System.out.println(grades[i] + " students with the grade " + i);
            }

            System.out.println(Failed() + " students failed, but " + GotA() + " students got A mark.");
        }


        public static int Failed() {
            int count = 0;
            for (int i : myArray) {
                if (i < 4) {
                    count++;
                }
            }
            return count;
        }

        public static int GotA() {
            int a = 0;
            for (int i : myArray) {
                if (i == 10) {
                    a++;
                }
            }
            return a;
        }
        }









