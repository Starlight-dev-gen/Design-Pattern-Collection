package com.starlight.patterns.adapter;

public class TypeZeroDataProcessor implements ITypeZero {

    private String typeZeroData;

    public TypeZeroDataProcessor(String typeZeroData) {
        this.typeZeroData = typeZeroData;
    }

    @Override
    public void ProcessTypeZero() {
        System.out.println(typeZeroData);
    }

    @Override
    public String GetTypeZero() {
        return typeZeroData;
    }
}
