package com.demo.commitcheck;

public class CommitCheck {
    private int counter = 0;
    public void process() {
        System.out.println("Version 6");
    }

    public void validate() {
        System.out.println("validate");
    }
    public void audit() {
        System.out.println("audit");
    }
}