package com.aleksanderjess;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static double getDouble(Scanner inputScanner) throws InputMismatchException {
        System.out.println("Enter a number: ");
        return inputScanner.nextDouble();
    }

    public static void main(String[] args) {
        var doubles = new ArrayList<Double>();

        System.out.println("Press q to quit");

        while (true) {
            try {
                doubles.add(getDouble(scanner));
            } catch (InputMismatchException e) {
                System.out.println("The maximum number is " + Collections.max(doubles));
                System.out.println("The minimum number is " + Collections.min(doubles));
                break;
            }
        }
    }
}
