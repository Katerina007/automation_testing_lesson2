package com.exadel.human;
import com.exadel.human.Human;
import com.exadel.human.Gender;

public abstract class Employee implements Human {

    protected int startYear;
    public Gender Gender;
    protected String Company;

    public Employee (String Company){
        this.Company = Company;
    }

    public abstract void getSpecificInfo();

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getExperience(int startYear){
        return 2018 - startYear;
    }

}
