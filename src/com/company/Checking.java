package com.company;

import com.sun.source.tree.BreakTree;

import java.util.Stack;

public class Checking {

    public static boolean Check(String inp_str){
        Stack<Integer> brackets = new Stack<>();

        if(inp_str.matches("[^a-z0-9\\[\\]]+"))
            return true;
        if(inp_str.matches("[0-9]+"))
            return true;

        for (int i = 1; i < inp_str.length(); ++i)
        {
            char ch = inp_str.charAt(i);
            char pervent_ch = inp_str.charAt(i-1);
            if ((pervent_ch >= '0' && pervent_ch <= '9')&& ch=='[') { //проверка на соблюдение правила число[
                brackets.push(i);
            }
            else if (ch == ']')
            {
                if(brackets.isEmpty()) return true;
                brackets.pop();
            }
            else if((inp_str.charAt(i) >= 'a' && inp_str.charAt(i) <= 'z'));
        }
        if(brackets.isEmpty()) return false;
        else return true;
    }

}