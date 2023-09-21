package com.github.arungahlawat.learning.tests.dataStructures;

import com.github.arungahlawat.learning.dataStructures.LinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LinkedListTests {
    public static void main(String[] args) {
        System.out.println("Linked list options");
        System.out.println("--------------------");
        System.out.println("1 : Add node");
        System.out.println("2 : Remove node");
        System.out.println("3 : Print list");
        System.out.println("4 : Clear list");
        System.out.println("0 : Exit");
        System.out.println("--------------------");
        LinkedList linkedList = new LinkedList();
        int choice;
        do {
            System.out.print("Enter choice: ");
            try {
                choice = new Scanner(System.in).nextInt();
            } catch (InputMismatchException exception) {
                choice = -1;
            }
            int data;
            switch (choice) {
                case 1:
                    System.out.print("Input node value to insert: ");
                    try {
                        data = new Scanner(System.in).nextInt();
                    } catch (InputMismatchException exception) {
                        System.out.println("Invalid input");
                        break;
                    }
                    linkedList.add(data);
                    linkedList.print();
                    break;
                case 2:
                    if (linkedList.isEmpty()) {
                        System.out.println("List empty");
                        break;
                    }
                    System.out.print("Input node value to remove: ");
                    try {
                        data = new Scanner(System.in).nextInt();
                    } catch (InputMismatchException exception) {
                        System.out.println("Invalid input");
                        break;
                    }
                    linkedList.remove(data);
                    linkedList.print();
                    break;
                case 3:
                    linkedList.print();
                    break;
                case 4:
                    linkedList.clear();
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
