package com.company;
import java.util.List;
import java.util.*;
public class Add {
    private ArrayList<Begin> list = new ArrayList<Begin>();
    public void add(Begin state)
    {
        list.add(state);
    }
    public Begin getindex(int index)
    {
        return list.get(index);
    }
}
