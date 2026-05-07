package com.starlight.patterns.template;

import java.sql.SQLOutput;

public class TemplateSubtypeOne extends Template{
    @Override
    void Step1() {
        System.out.println("Taking uncommon step 1 in way B...");
    }

    @Override
    void Step3() {
        System.out.println("Taking uncommon step 3 likewise...");
    }

    @Override
    protected void Step2() {
        System.out.println("Also carrying out optional step 2...");
    }
}
