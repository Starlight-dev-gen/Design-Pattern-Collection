package com.starlight.patterns.adapter;

import java.time.LocalDateTime;

public class Adapter implements ITypeOne{
    // Implement the one being converted to

    private String convertedData;

    // Inject data with the constructor
    public Adapter(ITypeZero typeZeroData) {
        // Simulated conversion here
        convertedData = "{"+typeZeroData+":"+LocalDateTime.now()+"}";
    }

    @Override
    public void ProcessTypeOne() {
        System.out.println(convertedData);
    }

    @Override
    public String GetTypeOne() {
        return convertedData;
    }
}
