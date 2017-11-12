package com.jp.practice;

//local class

public class Weird {
    // A static member interface used below

    public static interface IntHolder {
        public int getValue();
    }


    public static void main(String[] args) {
        IntHolder[] holders = new IntHolder[10];

        for (int i = 0; i < 10; i++) {
            final int fi = i;

            class MyIntHolder implements IntHolder {
                // Use the final variable
                public int getValue() {
                    return fi;
                }
            }
            holders[i] = new MyIntHolder();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(holders[i].getValue());
        }
    }
}

