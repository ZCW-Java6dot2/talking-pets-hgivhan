package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Owner {
    private ArrayList<Pet> petsList;

    public Owner(ArrayList<Pet> aPetslist){
        this.petsList = aPetslist;
    }

    public void setPetsList(ArrayList<Pet> aPetList){
        this.petsList = aPetList;
    }

    public ArrayList<Pet> getPetsList(){
        return petsList;
    }
}
