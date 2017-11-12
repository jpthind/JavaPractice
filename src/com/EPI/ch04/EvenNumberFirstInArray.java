package com.EPI.ch04;

import static java.lang.System.out;

public class EvenNumberFirstInArray {

    public static void getEvenNumberFirstInArray(int[] inputArray) {

        if (inputArray == null) {
            return;
        }

        int lastEvenIndexCounter = 0;

        for (int i = 0; i < inputArray.length; i++) {

            //  if number is even , then bring it next position
            if ((inputArray[i] % 2) ==  0 ) {
                swapArrayElements(inputArray, i, lastEvenIndexCounter);
                lastEvenIndexCounter++;
            }

        }
    }

    public static void swapArrayElements(int[] intArray, int swapIndex1,
                                         int swapIndex2) {
        if (intArray == null &&
                (intArray.length < swapIndex1 ||
                        intArray.length < swapIndex2)) {
            return;
        }

        int elementAtIndex1 = intArray[swapIndex1];
        intArray[swapIndex1] = intArray[swapIndex2];
        intArray[swapIndex2] = elementAtIndex1;
        return;

    }

    public static void main(String[] args) {

       int[] myArray = {2, 5, 6, 1, 8,20,13,50,11,9,17,22};
       // int[] myArray = {5, 1, 13,11,9,17,2};

        EvenNumberFirstInArray.getEvenNumberFirstInArray(myArray);

        for (int numInArray : myArray) {
            out.println(numInArray);
        }
    }

}

