package org.learningjava.basics;

/**
 * With the completion of this assignment, you should be able to move on to Assignment 1 and learn about Loops, Arrays,
 * Creating Objects, Inheritence, Polymorphism, and more.
 *
 * Read through the Readme file and attempt the assignments at the bottom. They may all be easy, the last may pose
 * a challenge if you don't Google it!
 */
public class Main {

    public static int fibonacci(int number) {
        /**
         * This is where you will put your code for the fibonacci exercise.
         */
    }

    // Add your new methods below here






    // Add your new methods above here

    /**
     * This method does not work. What is wrong? Fix it without destroying its intended result.
     * @param first A huge number
     * @param second some smaller number
     *
     * @returns I should print the result and then return true if the first number is divisble by the second,
     * or, if it is not divisible, divide the first by the second, subtract 1, take half of the second,
     * and run the algorithm again on the result.
     *
     * Fix the obvious issues that make it not run, but then make sure its behaving like its supposed to. Is it
     * returning anything?
     */
    public static void myMethod(short first, short second) {
        if (first % second == 0) { // The % symbol is the modulus operator. You can Google this for more info.
            return true;
            System.out.println(first + " is divisible by " + second + !);
        }
        myMethod((first / second) - 1, second/2);
        System.out.println(first + " was not divisible by" + second "Trying again...");
    }


    /**
     * The main method. Why do those numbers have underscores? Well, thats just to make it more readable. You can't use
     * commas in numbers but you can use underscores. What about the 'L'? Google it!
     */
    public static void main(String[] args) {
        System.out.println(myMethod(1_000_000_000_000L, 987L)); // Don't change this, just make it work!
    }
}
