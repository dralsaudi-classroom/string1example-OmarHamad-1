package com.example.project;

public class String1 {
    private char[] str;
    private int size;

    public String1() {
        size = -1;
        str = new char[80];
    }

    public void append(char c) {
        str[++size] = c;
    }

    public char remove() {
        return str[size--];
    }

    public char getChar(int i) {
        return str[i];
    }

    public int length() {
        return size + 1;
    }

    public void makeEmpty() {
        size = -1;
    }

    public void concat(String1 s) {
        for (int i = 0; i < s.length(); i++) {
            append(s.getChar(i));
        }
    }

    public boolean equal(String1 s) {
        if (s.length() == this.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.getChar(i) != this.str[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void reverse() {
        if (this.length() == 0)
            return;

        int l = this.length() - 1;
        char tmp;
        for (int i = 0; i < l / 2; i++) {
            tmp = this.str[i];
            this.str[i] = this.str[l - i]; 
            this.str[l - i] = tmp;  
        }
    }
}
