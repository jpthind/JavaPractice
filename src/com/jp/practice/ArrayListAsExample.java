package com.jp.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.lang.System.out;

public class ArrayListAsExample {

    public static void main(String[] args) {


        ArrayListAsExample.generics();

    }

    private static void ArraysAsCovariant() {
        Number[] numbers = new Integer[4];
        numbers[0] = 0;
        numbers[2] = 20;

        //{1,2,3};
        for (Number n: numbers
             ) {
            out.println(n);


        }
        numbers[1] = 10.2;

        //out.println(numbers.toString());

    }

    private  static void ArrayAsList() {
        List<String> myStringList = new ArrayList<String>();

        myStringList.add("JP");
        myStringList.add("Kiran");
        out.println(myStringList);


        List<String> myArrayAsList = Arrays.asList("JP", "Kiran");


        myArrayAsList.add("Sheru");
        out.println(myArrayAsList);
    }

    private static void TypeEasureExample() {

        List myInts = new ArrayList();
        myInts.add(1);
        myInts.add(2);


        myInts.add(3.0);


    }

    static long sum(List<Number> numbers) {
        long summation = 0;
        for(Number number : numbers) {
            summation += number.longValue();
        }
        return summation;
    }

    static void generics() {

        List<? extends  Number> myInts = Arrays.asList(1,2,3,4,5);
        List<? extends  Number> myLongs = Arrays.asList(1L, 2L, 3L, 4L, 5L);
        List<? extends  Number> myDoubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        Number number = myInts.get(0);
      //  myInts.add(0);

        out.println(number);

    }
}
