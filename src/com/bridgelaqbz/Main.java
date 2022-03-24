package com.bridgelaqbz;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Stack Program");
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        stack.showElements();
        stack.pop();
        stack.showElements();
        stack.pop();
        stack.showElements();
        stack.pop();
        stack.showElements();

    }
}

