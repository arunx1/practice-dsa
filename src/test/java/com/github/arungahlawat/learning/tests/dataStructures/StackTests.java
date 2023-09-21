package com.github.arungahlawat.learning.tests.dataStructures;

import com.github.arungahlawat.learning.dataStructures.Stack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTests {
    public static void main(String[] args) {
        System.out.println("Stack options:");
        System.out.println("1 : Push to stack");
        System.out.println("2 : Pop from stack");
        System.out.println("3 : Print stack");
        System.out.println("4 : Peek stack");
        System.out.println("0 : Exit");
        Stack<Object> stack = new Stack<>();
        int choice;
        Object data;
        do {
            System.out.print("Enter choice: ");
            try {
                choice = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("Input data: ");
                    try {
                        data = new Scanner(System.in).nextLine();
                    } catch (InputMismatchException exception) {
                        System.out.println("Invalid data");
                        break;
                    }
                    stack.push(data);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack empty");
                        break;
                    }
                    data = stack.pop();
                    System.out.println("Popped : " + data);
                    break;
                case 3:
                    stack.print();
                    break;
                case 4:
                    stack.peek();
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
