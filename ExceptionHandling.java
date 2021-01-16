/*
 * Author: Brian Klein
 * Date: 10/11/17
 * Program: ExceptionHandling.java
 * Description: The following formula can be used to calculate a moving 
 *              object’s kinetic energy: Write a program that asks the user to 
 *              enter m and v, then calculates and outputs the kinetic energy 
 *              if the user inputs are valid. If the user enters an invalid 
 *              input, use Java exception handling techniques to handle the 
 *              exceptions until the user enters a valid input.
 */

import java.util.*;

public class ExceptionHandling {

    //declare constants
    static final double NUM = 0.5, SENTINEL = -1;

    //create the Scanner object representing the keyboard
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        //declare variables
        double k, m, v;

        //input m
        m = enterMass();

        //input v
        v = enterVelocity();

        //call calculateNRG method
        k = calculateNRG(m, v);

        //output k
        System.out.printf("\nThe kinetic energy of the object is %,.2f\n", k);

    }// end main

    public static double calculateNRG(double m, double v) {
        double k; //to hold k

        //calculate k
        k = m * (v * v) * NUM;

        return k;

    } //end calcKinNRG method

    public static double enterMass() {

        double mass = 0;
        boolean flag = false;

        do {
            try {
                System.out.print("\nEnter the mass of the object in Kilograms ( -1 to exit): ");
                mass = console.nextDouble();

                if (mass == SENTINEL) {
                    System.out.println("Thank you for using this program!");
                    System.exit(1);
                } else if (mass < 1) {
                    throw new InvalidMassException();
                }

                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid, enter a positive integer.");
                console.next();
            } catch (InvalidMassException e) {
                System.out.println(e.toString());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } while (!flag);

        return mass;

    }//end enterMass() method

    public static double enterVelocity() {

        double velocity = 0;
        boolean flag = false;

        do {
            try {
                System.out.print("\nEnter the velocity of the object in meters per second ( -1 to exit): ");
                velocity = console.nextDouble();

                if (velocity == SENTINEL) {
                    System.out.println("Thank you for using this program!");
                    System.exit(1);
                } else if (velocity < 1) {
                    throw new InvalidVelocityException();
                }

                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid, enter a positive integer.");
                console.next();
            } catch (InvalidVelocityException e) {
                System.out.println(e.toString());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } while (!flag);

        return velocity;

    }//end enterVelocity() method
}
