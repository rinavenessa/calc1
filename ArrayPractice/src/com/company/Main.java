package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number");
        double number1 = input.nextDouble();
        System.out.println("enter operator");
        char operator = input.next().charAt(0);
        System.out.println("enter 2nd number");
        double number2 = input.nextDouble();

        Add obj = new Add();
        Subtract obj1 = new Subtract();
        Multiply obj2 = new Multiply();
        Divide obj3 = new Divide();


        switch (operator) {
            case '+':
                obj.add(number1, number2);
                break;

            case '-':
        obj1.subtract(number1, number2);
        break;
            case '*':
                obj2.multiply(number1, number2);
        break;
            case '/':
                obj3.divide(number1, number2);
                break;
            default:
                System.out.println(" please enter a valid operator");
        }

    }

}
