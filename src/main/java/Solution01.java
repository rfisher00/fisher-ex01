/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Fisher
 */

/*pseudocode:
include necessities for input
prompt user for input
return input in a string
 */

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name= sc.nextLine();
        System.out.printf("Hello, %s, nice to meet you!%n", name);
    }
}