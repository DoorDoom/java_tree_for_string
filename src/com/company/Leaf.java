package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leaf {

    public List<Leaf> rel_leaf;
    public int cnt;
    public String current_str;
    public String outstr;

    public Leaf(int i_cnt, String s)
    {
        rel_leaf = new ArrayList<Leaf>();
        this.cnt = i_cnt;
        current_str = s;
        outstr = "";
    };
    public Leaf(int i_cnt)
    {
        String s = "";
        rel_leaf = new ArrayList<Leaf>();
        this.cnt = i_cnt;
        current_str = s;
        outstr = "";
    };
}
