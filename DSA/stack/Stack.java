package DSA.stack;

import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> stack = new ArrayList<Integer>();
    int top = 0;

    public void push(int data)
    {
        stack.add(data);
        top++;
    }

    public int pop()
    {
        int val = stack.get(top - 1);
        stack.remove(top-1);
        top--;
        return val;
    }

    public void show()
    {
        for(int n : stack)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public boolean isEmpty()
    {
        if(top == 0)
            return true;
        return false;
    }

    public int peek()
    {
        return stack.get(top-1);
    }

    public int size()
    {
        return stack.size();
    }
    

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(30);
        s.push(40);
        s.show();
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
}



/*
 * output
 * true
    10 11 12 30 40 
    5
    40
    30
    false
 */