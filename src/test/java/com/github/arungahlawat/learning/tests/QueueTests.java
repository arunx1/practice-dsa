package com.github.arungahlawat.learning.tests;

import com.github.arungahlawat.learning.Queue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QueueTests {
    public static void main(String[] args) {
        System.out.println("Queue options:");
        System.out.println("1 : Insert item");
        System.out.println("2 : Remove item");
        System.out.println("3 : Print queue");
        System.out.println("0 : Exit");
        int choice;
        Object data;
        Queue<Object> queue = new Queue<>();
        do {
            System.out.print("Enter choice : ");
            try {
                choice = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                choice = -1;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter data : ");
                    try {
                        data = new Scanner(System.in).nextLine();
                    } catch (InputMismatchException exception) {
                        System.out.println("Invalid input");
                        break;
                    }
                    queue.insert(data);
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue empty");
                        break;
                    }
                    data = queue.remove();
                    System.out.println(data + " removed.");
                    break;
                case 3:
                    queue.print();
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}
