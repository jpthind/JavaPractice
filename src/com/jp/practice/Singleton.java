package com.jp.practice;
import static  java.lang.System.out;

public class Singleton {

    private static  Singleton singleton;


    private Singleton () {

    }

    public static synchronized Singleton getSingleton() {

        
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;

    }

    @Override
    public String toString() {
        return "EKONKAR JI";
    }

    public static void main(String[] args) {
       out.print( Singleton.getSingleton());

    }


}
