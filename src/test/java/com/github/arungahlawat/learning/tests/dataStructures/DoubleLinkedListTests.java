package com.github.arungahlawat.learning.tests.dataStructures;

import com.github.arungahlawat.learning.dataStructures.helpers.TwoWayNode;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoubleLinkedListTests {
    public static void main(String[] args) {
        System.out.println("Double linked list options: ");
        System.out.println("----------------------------");
        System.out.println("1 : Add node");
        System.out.println("2 : Remove node");
        System.out.println("3 : Print list");
        System.out.println("0 : Exit");
        System.out.println("----------------------------");
        Scanner scanner = new Scanner(System.in);
        int choice = 3;
        TwoWayNode head = null;
        int data;
        do {
            System.out.print("Enter choice : ");
            try {
                choice = scanner.nextInt();
            } catch (NoSuchElementException | IllegalStateException exception) {
                System.out.println("Wrong choice.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Input node value : ");
                    try {
                        data = scanner.nextInt();
                    } catch (NoSuchElementException | IllegalStateException exception) {
                        System.out.println("Wrong input.");
                        continue;
                    }
                    if (head == null) {
                        head = new TwoWayNode(data);
                    } else
                        head.insert(data);
                    break;
                case 2:
                    if (head == null) {
                        System.out.println("Empty list.");
                        continue;
                    }
                    System.out.print("Input node to remove : ");
                    try {
                        data = scanner.nextInt();
                    } catch (NoSuchElementException | IllegalStateException exception) {
                        System.out.println("Wrong input.");
                        continue;
                    }
                    head = head.remove(head, data);
                    break;
                case 3:
                    if (head == null) {
                        System.out.println("Empty list.");
                        continue;
                    }
                    head.print(head);
                    break;
            }
        } while (choice != 0);
    }
}
