package com.random;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

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
        for (int i = input.length() - 1; i >= 0; i--) {
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
    public void swapTwoStrings() {
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
        System.out.println("s4: " + s4 + " s5: " + s5);
    }

    /**
     * Question 3: Write a Java Program to print the Fibonacci Series.
     * Solution 3. As we know Fibonacci series is a series of numbers in which each number is the sum of the two preceding numbers.
     * For writing a Java Program, first we declare an array and assign the values 0 and 1 to the indexes 0 and 1 of the defined array.
     * Then we write the logic to get the values of all the indexes of the total Fibonacci series length.
     */
    @Test
    public void fibonacciSeries() {
        int arrLength = 10;
        int[] arr = new int[arrLength];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arrLength; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Question 4: Write a Java Program to check if a number is Armstrong number or not.
     * Solution 4: An Armstrong Number is a number in which the sum of the cubes of each digit is equal to the number itself. For ex:
     * 371 = 3*3*3 + 7*7*7 + 1*1*1
     * The sum of the cubes is 3,7,1 is equal to 371.Another example is 153 which is an Armstrong number. You can explore other numbers too!!!
     */
    @Test
    public void armStrongNumber() {
        int num = 371;
        String[] numArr = String.valueOf(num).split("");
        int armStrongNum = Arrays.stream(numArr).mapToInt(Integer::parseInt).map(n -> n * n * n).sum();
        System.out.println("Is Given Number is an Armstrong number? : " + (num == armStrongNum));
    }

    /**
     * Question 5: Write a Java Program to print the sum of digits of a given integer.
     * Solution 5: We can solve the question using a while loop.
     * Using the % operator we get the remainder and keep adding to the sum variable until the number becomes 0.
     * The total sum will be the total of all the digits of the given integer.
     */
    @Test
    public void sumOfDigits() {
        int num = 123;
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            sum += lastDigit;
        }
        System.out.println("Sum of the Digits is: " + sum);
    }

    /**
     * Question 6: Write a Java Program to check if a number is Prime or not.
     * Solution 6. A prime number is a number which is divisible by 1 and itself.
     * This problem can be solved by a simple for loop and we check the condition that the given number returns a remainder value.
     * If the remainder is 0, then the number is not prime. Else its a prime number.
     */
    @Test
    public void checkPrimeNumber() {
        int num = 5;
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is Non Prime");
        }
    }

    /**
     * Question 7:  Write a Java Program to count the number of characters in a given String.
     * Solution 7: We can use hashmap for counting the number of each character in the given string.
     * We create hashmap object to store each character as key and the total count of characters as its value.
     */
    @Test
    public void countCharsInString() {
        String s1 = "Abdul Hameed";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s1.replaceAll(" ", "").toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

    /**
     * Question 8: Write a Java Program to find the duplicates of a given String.
     * Solution 8: HashMap is used to store elements in the form of key value pairs.
     * We create a hashmap object and store each character as key
     * and the total count of each character as value.
     * Then we check the keys whose values are more than 1 using the keySet() method.
     * Thus, we get the duplicates in the given String.
     */
    @Test
    public void duplicateCharsInString() {
        String s1 = "Abdul Hameed";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s1.replaceAll(" ", "").toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Character> duplicateChars = map.keySet().stream()
                .filter(k -> map.get(k) > 1)
                .collect(Collectors.toSet());

        System.out.println("Duplicate Characters: " + duplicateChars);
    }

    /**
     * Question 9: Write a Java Program for swapping of 2 numbers.
     * Solution 9: In this problem , we would be given two numbers as input. We need to swap those 2 numbers which can be done a simple logic.
     * <p>
     * Below is the java program.
     */
    @Test
    public void swapTwoNumbers() {
        // Logic 1 with a third variable
        int num1 = 6;
        int num2 = 4;
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Swapped Numbers : " + "num1: " + num1 + " and" + " num2: " + num2);

        // Logic 2 without using third variable
        int num4 = 6;
        int num5 = 4;
        num4 = num4 + num5;
        num5 = num4 - num5;
        num4 = num4 - num5;
        System.out.println("Swapped Numbers : " + "num4: " + num4 + " and" + " num5: " + num5);
    }

    /**
     * Question 10: Write a Java Program to reverse an array?
     * Solution 10: In this problem, we are given an array of characters as input. This problem can be solved by writing a while loop.
     * By using a third variable, we reverse the array as below.
     */
    @Test
    public void reverseArray() {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            char c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            start++;
            end--;
        }
        System.out.println("Reversed Array is : " + Arrays.toString(arr));
    }

    /**
     * Question 11: Write a Java Program to get the count of Capitalized words in a String.
     * Solution 11:  Capitalized words in a given String which are those words which starts with a Capital Letter.
     * We need the total count of these words. This problem can be solved by using a for loop and iterate through each character in the String.
     */
    @Test
    public void countCapitalizedWordInString() {
        String str = "Abdul Hameed";
        int count = 0;
        // Logic 1 using loop
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        System.out.println("Capitalized count is: " + count);
        // Logic 2 using stream
        long count2 = str.chars().mapToObj(o -> (char) o).filter(c -> c >= 'A' && c <= 'Z').count();
        System.out.println("Capitalized count is: " + count2);
    }

    /**
     * Question 12: Write a Java Program to find the longest consecutive occurrence of integers in a given array.
     * Solution 12: In this problem, we need to find the length of the longest consecutive occurrence.
     * As given in the array below, we have an array of integers.
     * As you can see the longest consecutive occurrence of integers are 6,7,8,9.
     * There is a consecutive increment of 1 . So the output will be 4.
     */
    @Test
    public void findLargestConsecutiveIntegers() {
        int[] arr = {4, 3, 25, 6, 7, 8, 9, 2, 3, 10};
        //int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7, 8, 8, 9};
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } else {
                max = Math.max(max, count + 1);
                count = 0;
            }
        }
        System.out.println("Longest consecutive integers count is : " + max);
    }
}
