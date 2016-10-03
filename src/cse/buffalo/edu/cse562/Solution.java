package cse.buffalo.edu.cse562;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by SaiManoj on 10/02/2016.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<expression.length();i++)
        {
            char curr=expression.charAt(i);
            if(curr=='('||curr=='{'||curr=='[')
            {
                stk.push(curr);
            }
            else if(curr==')'||curr=='}'||curr==']')
            {
                char popped=stk.pop();

               if((popped == '(' && curr == ')')
                       || (popped == '{' && curr == '}')
                       || (popped == '[' && curr == ']')) {
                   continue;
               } else {
                   return false;
               }

            }
        }
        return stk.isEmpty();
    }

}
