package com.jp.practice;

import static java.lang.System.out;

public class PassByValue {

    public static void main(String[] args) {
        PassByValue p = new PassByValue();
        int i = 10;
        p.incrementInt(i);
        out.println(i);

    }

    public void incrementInt(int i) {

        i++;

        out.println(i);
    }

}
