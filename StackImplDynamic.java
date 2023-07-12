package com.streamconcepts;

import static java.lang.System.exit;

public class StackImplDynamic {


    private class Node{
        int data;
         Node link;
    }
    Node top;
    StackImplDynamic()
    {
        top=null;
    }
    public void push(int x)
    {
        Node temp=new Node();

        if(temp==null)
        {
            System.out.println("stack overflow !...");
            return;
        }
        temp.data=x;
        temp.link=top;
        top=temp;
    }
    public void pop()
    {
        if(top==null)
        {
            System.out.println("Stack underflow!.....");
            exit(1);
        }
        top=top.link;
    }
    public void print()
    {
        if(top==null)
        {
            System.out.println("Stack underflow");
            exit(1);
        }
        else
        {
            Node temp=top;
            while(temp!=null)
            {
                System.out.print(temp.data);
                temp=temp.link;
                if(temp!=null)
                {
                    System.out.print("->");
                }
            }
        }
    }
}
