package com.company;
import java.util.Scanner;
//import java.lang.*;
//import java.util.*;
//import java.io.*;


public class Calculator {

    private String name;
    public Calculator(){
        name = "unknown";
    }

    public float addition(float A, float B) {
        return A + B;
    }

    public float subtraction(float A, float B) {
        return A - B;
    }

    public float multiplication(float A, float B) {
        return A * B;
    }

    public void setname(String N) {
        name = N;
    }

    public String getname() {
        return name;
    }

    public static void main(String[] args) {
        // write your code here
        Calculator mycalc = new Calculator();
        mycalc.setname("group22");
        String n = mycalc.getname();

        while (true) {

            System.out.println("Welcome to the Calculator designed by mycalc." + n);
            System.out.println("Enter A to Add, S to Subtract, M to Multiply , and Q to quit. (Case sensitive)");
            Scanner scanner = new Scanner(System.in);

            String operation = scanner.nextLine();

            if (operation.equals("Q")) {
                break;
            }

            try {
                System.out.println("Enter argument 1: ");
                String arg1 = scanner.nextLine();
                float Arg1 = Float.parseFloat(arg1);


                System.out.println("Enter argument 2: ");
                String arg2 = scanner.nextLine();
                float Arg2 = Float.parseFloat(arg2);

                switch (operation) {

                    case ("A"):
                        float sum = mycalc.addition(Arg1, Arg2);
                        String sum2 = Float.toString(sum);
                        System.out.println("The addition of " + arg1 + " and " + arg2 + " is " + sum2);
                        break;

                    case ("S"):
                        float sub = mycalc.subtraction(Arg1, Arg2);
                        String sub2 = Float.toString(sub);
                        System.out.println("The subtraction of " + arg1 + " and " + arg2 + " is " + sub2);
                        break;

                    case ("M"):
                        float product = mycalc.multiplication(Arg1, Arg2);
                        String product2 = Float.toString(product);
                        System.out.println("The multiplication of " + arg1 + " and " + arg2 + " is " + product2);
                        break;

                    default:
                        System.out.println("No match.");
                        break;
                }
            }
            catch (NumberFormatException number) {
                System.out.println("Enter numeric values like 1, 2, or 3.");
                //continue;
            }
        }
    }
}

