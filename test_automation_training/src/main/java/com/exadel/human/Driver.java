package com.exadel.human;
import com.exadel.Vehicle;
import com.exadel.human.Employee;

import java.util.Objects;

public class Driver extends Employee {
    private String Name;
    private int Age;
    public String phoneNumber;
    public Vehicle Vehicle;
    public String vehicleNumber;

    public Driver(String Name, int Age, Gender Gender, Vehicle Vehicle) {
        super("transport enterprise");
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.Vehicle = Vehicle;
    }

    public void getSpecificInfo() {
        System.out.println(this.Name + " drives the " + this.Vehicle + " numbered " + this.vehicleNumber + " during " + this.getExperience(this.getStartYear()) + " year/years");
    }

    public String getStatus () {
        return "works in " + this.Company + " as a " + this.Vehicle + " driver from " + this.getStartYear();
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Age == driver.Age &&
                Objects.equals(Name, driver.Name) &&
                Objects.equals(phoneNumber, driver.phoneNumber) &&
                Vehicle == driver.Vehicle &&
                Objects.equals(vehicleNumber, driver.vehicleNumber)&&
                Gender == driver.Gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, phoneNumber, Vehicle, vehicleNumber, Gender);
    }

}
