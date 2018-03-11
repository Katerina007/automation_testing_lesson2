package com.exadel.human;
import com.exadel.human.Employee;
import com.exadel.human.Gender;

public class Teacher extends Employee {
    String Name;
    int Age;
    String Subject;
    public String schoolNumber;

    public Teacher (String Name, int Age, Gender Gender, String Subject){
        super ("school");
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
        this.Subject = Subject;
    };

    public void getSpecificInfo(){
        System.out.println(this.Name + " teaches " + this.Subject + " during " + this.getExperience(this.getStartYear()) + " year/years");
    };

    public String getName(){
        return Name;
    };

    public void setName(String Name){
        this.Name = Name;
    };

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getStatus(){
        return "works in " + this.Company + this.schoolNumber + " from " + this.getStartYear();
    };
}
