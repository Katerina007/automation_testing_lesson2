package com.utils.bobko;

import static org.apache.commons.lang3.RandomUtils.*;

public class RandomUtilsTest {
    public static void main(String[] args) {

        System.out.println("boolean");
        System.out.println(nextBoolean());

        System.out.println("byte array");
        byte[] array = nextBytes(5);
        for (byte a : array)
            System.out.println(a);

        System.out.println("double");
        System.out.println(nextDouble());

        System.out.println("float");
        System.out.println(nextFloat(4.54f, 5.54f));

        System.out.println("int");
        System.out.println(nextInt(0, 5));

        System.out.println("long");
        System.out.println(nextLong());


    }
}
