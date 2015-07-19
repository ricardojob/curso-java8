/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 1 homework
 */
package edu.job.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Speakjava (simon.ritter@oracle.com)
 * @author Ricardo Job
 */
public class Lesson1 {

    /**
     * Run the exercises to ensure we got the right answers
     */
    public void runExercises() {
        System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
        System.out.println("Running exercise 1 solution...");
        exercise1();
        System.out.println("Running exercise 2 solution...");
        exercise2();
        System.out.println("Running exercise 3 solution...");
        exercise3();
        System.out.println("Running exercise 4 solution...");
        exercise4();
        System.out.println("Running exercise 5 solution...");
        exercise5();
    }

    /**
     * All exercises should be completed using Lambda expressions and the new
     * methods added to JDK 8 where appropriate. There is no need to use an
     * explicit loop in any of the code. Use method references rather than full
     * lambda expressions wherever possible.
     */
    /**
     * Exercise 1
     *
     * Create a string that consists of the first letter of each word in the
     * list of Strings provided. HINT: Use a StringBuilder to construct the
     * result.
     */
    private void exercise1() {
        List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
        StringBuilder builder = new StringBuilder();
        list.forEach(s -> builder.append(s.substring(0, 1)));
        System.out.println("builder = " + builder.toString());
    }

    /**
     * Exercise 2
     *
     * Remove the words that have odd lengths from the list. 
     * HINT: Use one of the new methods from JDK 8
     */
    private void exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        list.removeIf(new Predicate<String>() {

            @Override
            public boolean test(String t) {
                 return t.length()% 2!=0;
            }
        });
        
        System.out.println("list = " + list);
    }
 

    /**
     * Exercise 3
     *
     * Replace every word in the list with its upper case equivalent. HINT: Use
     * one of the new methods from JDK 8
     */
    private void exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        /* YOUR CODE HERE */
    }

    /**
     * Exercise 4
     *
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order. HINT: Again, use a
     * StringBuilder to construct the result String. Use one of the new JDK 8
     * methods for Map.
     */
    private void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        /* YOUR CODE HERE */
    }

    /**
     * Exercise 5
     *
     * Create a new thread that prints the numbers from the list. HINT: This is
     * a straightforward Lambda expression.
     */
    private void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /* YOUR CODE HERE */
    }

    /**
     * Main entry point for application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lesson1 lesson = new Lesson1();
        lesson.runExercises();
    }
}
