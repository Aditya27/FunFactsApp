package com.example.aditya.funfactsapp;

import java.util.Random;

/**
 * Created by aditya on 10/25/15.
 */
public class FactBook {

    public String[] mFacts;

    public FactBook(String[] stringArray) {
        this.mFacts=stringArray;
    }

    public String getFact(){
        Random randomGenerator = new Random();
        int number=randomGenerator.nextInt(mFacts.length);
        return mFacts[number];
    }
}
