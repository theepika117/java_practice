package DSA.stack;

import java.util.ArrayList;

public class StringStack {

    int top = 0;
    ArrayList<String> stack = new ArrayList<>();

    public void push(String data)
    {
        stack.add(data);
        top++;
    }

    public String pop()
    {
        String str = stack.get(top - 1);
        stack.remove(top-1);
        top--;
        return str;
    }

    public void show()
    {
        for(String n : stack)
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

    public String peek()
    {
        return stack.get(top-1);
    }

    public int size()
    {
        return stack.size();
    }


}
