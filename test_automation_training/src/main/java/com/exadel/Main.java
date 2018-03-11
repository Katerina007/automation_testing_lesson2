package com.exadel;
import com.exadel.human.Driver;
import com.exadel.human.Teacher;
import com.exadel.human.Gender;
import com.exadel.DriversComparator;
import com.exadel.TeachersComparator;
import com.exadel.Vehicle;

import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Teacher teacher1 = new Teacher("Harry", 26, Gender.valueOf("MALE"), "Math");
    	teacher1.setStartYear(2012);
    	teacher1.schoolNumber = "#1";
    	System.out.println(teacher1.getName() + " "+ teacher1.getStatus());
		teacher1.getSpecificInfo();

    	Teacher teacher2 = new Teacher ("Alex", 24, Gender.valueOf("MALE"), "English");
		teacher2.setStartYear(2008);
		teacher2.schoolNumber = "#1";
		System.out.println(teacher2.getName() + " "+ teacher2.getStatus());
		teacher2.getSpecificInfo();

		List <Teacher> teachersList = new ArrayList <>();
		teachersList.add(teacher1);
		teachersList.add(teacher2);

		teachersList.sort(new TeachersComparator());

		for (Teacher t : teachersList){
			System.out.println(t.getName() + " " + t.getAge());
		}

		Driver driver1 = new Driver("Bony", 32, Gender.MALE, Vehicle.CAR );
		driver1.setStartYear(2008);
		driver1.phoneNumber = "123";
		driver1.vehicleNumber = "1111AM-1";
		System.out.println(driver1.getName() + " " + driver1.getStatus());
		driver1.getSpecificInfo();

		Driver driver2 = new Driver("Andrew", 42, Gender.MALE, Vehicle.BUS );
		driver2.setStartYear(2006);
		driver2.phoneNumber = "321";
		driver2.vehicleNumber = "1111AM-2";
		System.out.println(driver2.getName() + " " + driver2.getStatus());
		driver2.getSpecificInfo();

        Driver driver3 = new Driver("Kristin", 36, Gender.FEMALE, Vehicle.CAR );
        driver3.setStartYear(2010);
        driver3.phoneNumber = "456";
        driver3.vehicleNumber = "1111AM-3";
        System.out.println(driver2.getName() + " " + driver3.getStatus());
        driver3.getSpecificInfo();

        Driver driver4 = new Driver("Kristin", 36, Gender.FEMALE, Vehicle.CAR );
        driver4.setStartYear(2010);
        driver4.phoneNumber = "456";
        driver4.vehicleNumber = "1111AM-3";
        System.out.println(driver2.getName() + " " + driver4.getStatus());
        driver4.getSpecificInfo();

		ArrayList <Driver> driversList = new ArrayList <>();
		driversList.add(driver1);
		driversList.add(driver2);
		driversList.add(driver3);
		driversList.add(driver1);

        System.out.println();
        System.out.println("*before sort*");
        for (Driver d : driversList)
            System.out.println(d.getName());

        System.out.println();
        System.out.println("*after sort*");
		driversList.sort(new DriversComparator());
		for (Driver d : driversList)
            System.out.println(d.getName());

        Set <Driver> driversHash = new HashSet <>();
        driversHash.add(driver3);
        driversHash.add(driver2);
        driversHash.add(driver2);
        driversHash.add(driver4);

        System.out.println("*print driversHash*");
        for (Driver dHash : driversHash)
            System.out.println(dHash.getName());


        Set <String> driversTree = new TreeSet <>();
        driversTree.add(driver1.getName());
        driversTree.add(driver2.getName());
        driversTree.add(driver3.getName());
        driversTree.add(driver1.getName());

        System.out.println();
        System.out.println("*print driversTree*");
        for (String dTree : driversTree)
            System.out.println(dTree);

        Map<Driver, String> driversMap = new HashMap<>();
        driversMap.put(driver1, "driver1");
        driversMap.put(driver2, "driver2");
        driversMap.put(driver3, "driver3");
        driversMap.put(driver4, "driver4 as a driver3");

        System.out.println();
        System.out.println("*print driversMap*");
        driversMap.forEach ((k, v) -> System.out.println("key: " + k.getName() + ", value: " + v));

    }
}
