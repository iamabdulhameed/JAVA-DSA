package com.random;

import org.testng.annotations.Test;

public class Random1 {


    /**
     * Question 1: Write a Java Program to reverse a String.
     * Solution 1: As asked in the above question, we need to reverse a String. For Ex:
     * The Input is : "RahulShettyAcademy"
     * Output should be : "ymedacAyttehSluhaR"
     */
    @Test
    public void reverseString() {
        String input = "RahulShettyAcademy";
        StringBuilder output = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        System.out.println(output);
    }

    /**
     * Question 2:  Write a Java Program to swap two given Strings
     * Solution 2. As asked in the above question, for swapping of two strings we need to use the substring method of the String class in Java.
     * Substring method returns part of the string.
     * We have the start index and end index in the substring method where
     * start index is inclusive and end index is exclusive.
     */

    @Test
    public void swapTwoString() {
        // Logic 1
        String s1 = "Rahul";
        String s2 = "Shetty";
        String s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("s1: " + s1 + " s2: " + s2);
        // Logic 2
        String s4 = "Hello";
        String s5 = "World";
        s4 = s4 + s5;
        s5 = s4.substring(0, s4.length() - s5.length());
        s4 = s4.substring(s4.length() - s5.length());
        System.out.println("s4: " + s4 + " s5: " +s5);
    }
}
