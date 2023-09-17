package com.github.arungahlawat.learning.tests;

import com.github.arungahlawat.learning.Node;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Linked list options");
        System.out.println("--------------------");
        System.out.println("1 : Add node");
        System.out.println("2 : Remove node");
        System.out.println("3 : Print list");
        System.out.println("0 : Exit");
        System.out.println("--------------------");
        Node head = null;
        int choice = 3;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter choice: ");
            try {
                choice = scanner.nextInt();
            } catch (NoSuchElementException | IllegalStateException exception) {
                System.out.println("Invalid choice. Retry..");
                continue;
            }
            int data;
            switch (choice) {
                case 1:
                    System.out.print("Input node value to insert: ");
                    try {
                        data = scanner.nextInt();
                    } catch (NoSuchElementException | IllegalStateException exception) {
                        System.out.println("Invalid data");
                        continue;
                    }
                    if (head == null)
                        head = new Node(data);
                    else
                        head.insert(data);
                    break;
                case 2:
                    if (head == null) {
                        System.out.println("Linked list is empty.");
                        continue;
                    }
                    System.out.print("Input node value to remove: ");
                    try {
                        data = scanner.nextInt();
                    } catch (NoSuchElementException | IllegalStateException exception) {
                        System.out.println("Invalid data");
                        continue;
                    }
                    head = head.remove(head, data);
                    break;
                case 3:
                    if (head == null) {
                        System.out.println("Linked list is empty.");
                        continue;
                    }
                    head.print(head);
                    break;
            }
        } while (choice != 0);
    }
}
