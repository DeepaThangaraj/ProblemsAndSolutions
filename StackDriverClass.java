package com.examples.concepts;

public class StackDriverClass {

    public static void main(String[] args) {
        StackImpl stackimpl=new StackImpl();
        stackimpl.push(20);
        stackimpl.push(30);
        stackimpl.push(40);
        stackimpl.pop();
        stackimpl.peek();
        stackimpl.print();
    }
}
