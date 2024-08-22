package DSA.stack;

import java.util.ArrayList;
import java.util.Scanner;

public class postfix {
    private ArrayList<String> operator;
    public boolean isPostfix(String exp)
    {
        operator = new ArrayList<>();
        operator.add("+");
        operator.add("-");
        operator.add("*");
        operator.add("/");
        operator.add("%");

        //first two characters of the expression must be an operand
        if (!operator.contains(Character.toString(exp.charAt(0))) && !operator.contains(Character.toString(exp.charAt(1))))
        {
            //last character of the expression must be an operator
            if(operator.contains(Character.toString(exp.charAt(exp.length()-1))))
            {
                int val = 0, sym = 0;
                for(int i = 0; i < exp.length(); i ++)
                {
                    if(operator.contains(Character.toString(exp.charAt(i))))
                    {
                        sym++;
                    }
                    else{
                        val++;
                    }
                }
                // for n num of operators there must be n-1 operand
                if (val - sym == 1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else 
        {
            return false;
        }
    }
    
    public int evaluatePostfix(String exp)
    {
        Stack stack = new Stack();
        for(int i = 0; i < exp.length(); i++)
        {
            if(!operator.contains(Character.toString(exp.charAt(i))))
                stack.push(Integer.parseInt(Character.toString(exp.charAt(i))));
            
            else
            {
                int op1 = Integer.valueOf(stack.pop());
                int op2 = Integer.valueOf(stack.pop());
                int ans;
                switch (exp.charAt(i)) {
                    case '+':
                        ans = op1 + op2;
                        stack.push(ans);
                        break;
                    case '-':
                        ans = op2 - op1;
                        stack.push(ans);
                        break;
                    case '*':
                        ans = op1 * op2;
                        stack.push(ans);
                        break;
                    case '/':
                        ans = op2 / op1;
                        stack.push(ans);
                        break;
                    case '%':
                        ans = op2 % op1;
                        stack.push(ans);
                        break;
                    default:
                        break;
                }
                

            }

            
        }

        return stack.peek();
    }



    public static void main(String[] args) {
        
        postfix p = new postfix();
        Scanner scr = new Scanner(System.in);
        String exp = scr.nextLine();
        if(p.isPostfix(exp))
        {
            System.out.println("valid");
            System.out.println(p.evaluatePostfix(exp));
        }
        else
        {
            System.out.println("not valid");
        }
        
    }
    
}




/*
 * output
 * 123*+
    valid
    7

    84/+
    not valid

    234*+5-
    valid
    9



 */