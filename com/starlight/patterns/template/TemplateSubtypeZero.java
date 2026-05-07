package com.starlight.patterns.template;

public class TemplateSubtypeZero extends Template{
    @Override
    void Step1() {
        System.out.println("Taking uncommon step 1 in way A...");
    }

    @Override
    void Step3() {
        System.out.println("Taking uncommon step 3 also...");
    }
}
