package com.stack;

import java.util.Stack;
public class  MinStack 
{  

        Stack<Integer> s1= new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        void push(int x)
        {
            if(s1.isEmpty() || s2.isEmpty())

            {
                 s1.push(x);
                 s2.push(x);
            }
            else
            {

               s1. push(x);
                int y = (Integer) s2.pop();
                s2.push(y);
                if(x < y)
                    s2.push(x);
            }
        }
        public Integer pop()
        {
            int x;
            x=(Integer) s1.pop();
            s2.pop();
            return x;

        }
    public  int getmin()
        {
            int x1;
            x1= (Integer)s2.pop();
            s2.push(x1);
            return x1;
        }

    public static void main(String[] args) {
        MinStack s = new MinStack();
            s.push(5);
            s.push(2);
            s.push(10);
            s.push(1);
            System.out.println(s.getmin());
            s.pop();
            System.out.println(s.getmin());
        }

}