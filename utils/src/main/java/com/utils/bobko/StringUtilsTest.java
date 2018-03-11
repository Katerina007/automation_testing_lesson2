package com.utils.bobko;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {

        String str1 = "English is a world language";
        String str2 = "Belorussian and Russian are national languages of Belarus";
        String newStr1 = str1.toUpperCase();
        String newStr2 = str2.toLowerCase();
        //compare
        System.out.println("compare");
        if (StringUtils.compare(str1,str2) != 0){  //different
            System.out.println("Strings are different");
        }
        else System.out.println("Strings are equal");

        if (StringUtils.compare(str1,"English is a world language") != 0){  //equal
            System.out.println("Strings are different");
        }
        else System.out.println("Strings are equal");

        if (StringUtils.compare(str1,newStr1) != 0){  //different
            System.out.println("Strings are different");
        }
        else System.out.println("Strings are equal");
        System.out.println();

        //compareIgnoreCase
        System.out.println("compareIgnoreCase");
        if (StringUtils.compareIgnoreCase(str1,newStr1) != 0){ //equal
            System.out.println("Strings are different");
        }
        else System.out.println("Strings are equal");

        if (StringUtils.compareIgnoreCase(str2,newStr2) != 0){ //equal
            System.out.println("Strings are different");
        }
        else System.out.println("Strings are equal");
        System.out.println();
        //contains
        System.out.println("contains");
        if (StringUtils.contains(str1, "English")) //true
            System.out.println("str1 contains word English");
        else System.out.println("str1 does not contain word English");

        if (StringUtils.contains(str1, "english")) //false
            System.out.println("str1 contains word english");
        else System.out.println("str1 does not contain word english");
        System.out.println();
        //equals
        System.out.println("equals");
        if (StringUtils.contains(str1, "English is a world language")) //true
            System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");

        if (StringUtils.contains(str1, newStr1)) //false
            System.out.println("Strings are equal");
        else System.out.println("Strings are not equal");
        System.out.println();

        //getDigits
        System.out.println("getDigits");
        System.out.println(StringUtils.getDigits("car number 111")); //"111"
        System.out.println(StringUtils.getDigits("1.English; 2.Russian")); //"12"
        System.out.println();

        //indexOf
        System.out.println("indexOf");
        int i = StringUtils.indexOf(str1, newStr1);
        System.out.println(i); // -1

        i = StringUtils.indexOf(str1, "English");
        System.out.println(i); // 0

        i = StringUtils.indexOf(str1, "is");
        System.out.println(i); //4

        //isBlank
        System.out.println("isBlank");
        if (StringUtils.isBlank(""))
            System.out.println("is Blank");
        if (StringUtils.isBlank(str2))
            System.out.println("is not Blank");
        System.out.println();

        //isNumeric
        System.out.println("isNumeric");
        if (StringUtils.isNumeric("123456"))
            System.out.println("is numeric");
        if (StringUtils.isNumeric("1.English; 2.Russian"))
            System.out.println("is not numeric");
        System.out.println();

        //replace
        System.out.println("replace");
        System.out.println(StringUtils.replace(str1,"language","lang"));
        System.out.println();

        //split
        System.out.println("split");
        String[] arr = StringUtils.split(str1);
        for (String str : arr)
            System.out.println(str);
        System.out.println();

        String str3 = "1.English; 2.Russian; 3.French; 4.Spanish";
        arr = StringUtils.split(str3, "; ");
        for (String str: arr)
            System.out.println(str);
        System.out.println();

        //substring
        System.out.println("substring");
        System.out.println(StringUtils.substring(str1, 11));
        System.out.println(StringUtils.substring(str2, 0, 23));
        System.out.println();

        //trim
        System.out.println("trim");
        System.out.println(StringUtils.trim("      "+str1+"  \n  "));
    }
}
