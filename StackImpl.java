package com.examples.concepts;

public class StackImpl {
    int top;
    static final int MAX=1000;
    int a[]=new int[MAX];
    StackImpl()
    {
        top=-1;
    }
    boolean isEmpty()
    {
        return top<0;
    }
    boolean push(int x)
    {
        if(top>=MAX-1)
        {
            return false;
        }
        else
        {
            a[++top]=x;
            return true;
        }

    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            System.out.println(a[top]);
            return a[top--];
        }
    }
    int peek()
    {
        if(top<0)
        {
            System.out.println("Not found....");
            return 0;
        }
        else {
            int x=a[top];
            System.out.println("found"+a[top]);
            return x;
        }
    }
    void print()
    {
        for(int i=top;i>-1;i--)
        {
            System.out.print(a[i]);
        }
    }

}
