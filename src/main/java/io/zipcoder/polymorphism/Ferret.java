package io.zipcoder.polymorphism;

public class Ferret extends Pet {

    public Ferret(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "meep";
    }
}
