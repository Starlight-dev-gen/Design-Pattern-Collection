package com.starlight.patterns.builder;

import java.util.Date;
import java.time.LocalDateTime;

public class Build {

    private String name0;
    private String name1;
    private int id;
    private String data0;
    private String data1;

    public Build(Builder builder) {
        this.name0 = builder.name0;
        this.name1 = builder.name1;
        this.id = builder.id;
        this.data0 = builder.data0;
        this.data1 = builder.data1;
    }

    public static class Builder{
    // Builder constructor has the same fields

        private String name0;
        private String name1;
        private int id;
        private String data0;
        private String data1;

        public Builder(String name0, String name1) {
            this.name0 = name0;
            this.name1 = name1;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder data0(String data0) {
            this.data0 = data0;
            return this;
        }

        public Builder data1(String data0) {
            this.data1 = data1;
            return this;
        }
        public Build Create(){
            Build b =  new Build(this);
            return b;
        }
    }



    @Override
    public String toString() {
        return "...";
    }
}
