package com.company;
public class Start {
    String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Begin save() {
        return new Begin(state);
    }
    public String get(Begin S) {
        state = S.getState();
        return state;
    }
}
