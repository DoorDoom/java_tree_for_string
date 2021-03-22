package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Leaf_initialization {

    public static String out_str = "";

    public static Leaf Split(String inp_str, int cnt_by)
    {
        // Работа со структурой дерева
        Stack<Integer> brackets = new Stack<>();
        Leaf l = new Leaf(cnt_by);
        String tmp = "";
        int tmp_int = 1;
        boolean inside=false;
        int j=0;

        for (int i = 0; i < inp_str.length(); ++i)
        {
            char ch = inp_str.charAt(i);
            if (ch == '[') {
                brackets.push(i);
                inside = true;
            }
            else if (ch == ']')
            {

                int openBracket = brackets.pop();
                // Получение числа повторений
                ch = inp_str.charAt(openBracket - 1);
                if (ch >= '0' && ch <= '9')
                {
                    tmp_int = ch-'0';
                }
                else
                {
                    tmp_int = 1;
                }
                // Создание ветки дерева
                if (brackets.isEmpty())
                {
                    l.rel_leaf.add(Split(inp_str.substring(openBracket + 1, openBracket + j ), tmp_int));
                    inside=false;
                    j=0;
                }
                tmp_int = 1;
            }
            // Создание листьев дерева
            else if ((inp_str.charAt(i) >= 'a' && inp_str.charAt(i) <= 'z') && brackets.isEmpty())
                l.rel_leaf.add(new Leaf(1, String.valueOf(inp_str.charAt(i))));
            if(inside) j+=1;
        }

        l.current_str = tmp;
        return l;
    }

    public static String printTree(Leaf l)
    {
        for (int i = 0; i < l.cnt; i++)
        {
            for (Leaf child : l.rel_leaf) {
                printTree(child);
            }
            out_str += l.current_str;
        }

        return out_str;
    }
}
