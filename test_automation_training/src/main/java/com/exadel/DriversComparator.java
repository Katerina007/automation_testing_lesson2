package com.exadel;

import com.exadel.human.Driver;

import java.util.Comparator;

public class DriversComparator implements Comparator<Driver> {

    @Override
    public int compare (Driver d1, Driver d2){
        return d1.getName().toString().compareTo(d2.getName().toString());
    }

}

