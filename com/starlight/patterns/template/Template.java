package com.starlight.patterns.template;

public abstract class Template {

    // Common and required methods
    private void Step0(){
        System.out.println("Starting process...");
    }
    private void Step4(){
        System.out.println("Finishing up...");
    }

    // Not common but required methods
    abstract void Step1();
    abstract void Step3();

    // Optional methods
    protected void Step2(){}

    // Template method
    public void Execute(){
        Step0();
        Step1();
        Step2();
        Step3();
        Step4();
    }

}