package com.utils.bobko;

import static org.apache.commons.lang3.RandomStringUtils.*;

public class RandomStringUtilsTest {
    public static void main(String[] args) {

        System.out.println(randomNumeric(5));
        System.out.println(randomAlphabetic(5));
        System.out.println(randomAscii(5));
        System.out.println(random(5));
        System.out.println(random(5, 65,67,true, false));
        System.out.println(random(10,48,54,false,true));
    }
}
