package com.streamconcepts;

public class Stack {

    static final int stack_size=2000;
    int top;
    int a[]=new int[stack_size];

    Stack()
    {
        top=-1;
    }
    boolean push(int data)
    {
        if(top>stack_size-1)
        {
            System.out.println("Stack is Overflow");
            return false;
        }
        else {
            a[++top]=data;
            System.out.println("The data is pushed into the stack....."+data);
            return true;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("The stack is underflow");
            return 0;
        }
        else {
            int x=a[top--];
            return x;
        }
    }
    void print()
    {
       for(int i=top;i>-1;i--)
       {
           System.out.println(" "+a[i]);
       }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(100);
        s.push(10000);
        s.push(1);
        System.out.println("top of the element is poped from the stack....."+s.pop());
        System.out.println("Elements present in the stack are:");
        s.print();



        StackImplDynamic stackImplDynamic=new StackImplDynamic();
        stackImplDynamic.push(10);
        stackImplDynamic.push(20);
        stackImplDynamic.push(30);
        stackImplDynamic.push(40);
        stackImplDynamic.pop();
        stackImplDynamic.print();
    }

}
