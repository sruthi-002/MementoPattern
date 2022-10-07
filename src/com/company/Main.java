package com.company;
public class Main {
    public static void main(String[] args) {
        Start s = new Start();
        Add b = new Add();
        s.setState("State 1");
        b.add(s.save());
        s.setState("State 2");
        b.add(s.save());
        s.setState("State 3");
        b.add(s.save());
        System.out.println("First State :");
        System.out.println(s.get(b.getindex(0)));
        System.out.println("Second State :");
        System.out.println(s.get(b.getindex(1)));
        System.out.println("Third State :");
        System.out.println(s.get(b.getindex(2)));
    }
}
