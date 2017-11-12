package com.jp.practice;

public class LinkedStack  {

    public static interface Linkable {
        public Linkable getNext();
        public void setNext(Linkable node);

    }

    public void push(Linkable node) {

    }

    public Object pop() {
        return null;
    }


    public class LinkableInteger implements LinkedStack.Linkable {
        int i;

        LinkableInteger(int i) {
            this.i = i;
        }

        LinkedStack.Linkable next;


        @Override
        public Linkable getNext() {
            return next;

        }

        @Override
        public void setNext(Linkable node){
             next = node;
        }
    }
}
