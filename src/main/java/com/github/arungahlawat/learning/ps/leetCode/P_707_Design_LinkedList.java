package com.github.arungahlawat.learning.ps.leetCode;
/*
Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement the MyLinkedList class:

MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.

Example 1:
Input
["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
[[], [1], [3], [1, 2], [1], [1], [1]]
Output
[null, null, null, null, 2, null, 3]

Explanation
MyLinkedList myLinkedList = new MyLinkedList();
myLinkedList.addAtHead(1);
myLinkedList.addAtTail(3);
myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
myLinkedList.get(1);              // return 2
myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
myLinkedList.get(1);              // return 3

Constraints:
0 <= index, val <= 1000
Please do not use the built-in LinkedList library.
At most 2000 calls will be made to get, addAtHead, addAtTail, addAtIndex and deleteAtIndex.
 */
public class P_707_Design_LinkedList {
    static class MyLinkedList {
        int val;
        MyLinkedList next;
        int length;
        MyLinkedList head;

        public MyLinkedList() {
            this.val = 0;
            this.next = null;
            this.length = 0;
            this.head = null;
        }

        public int get(int index) {
            if(index >= this.length || this.length == 0)
                return -1;
            if(index == 0)
                return this.head.val;
            MyLinkedList pointer = this.head;
            int i=0;
            while(i<index){
                pointer = pointer.next;
                i++;
            }
            return pointer.val;
        }

        public void addAtHead(int val) {
            MyLinkedList newNode = new MyLinkedList();
            newNode.val = val;
            newNode.next = this.head;
            this.head = newNode;
            this.length++;
        }

        public void addAtTail(int val) {
            if(this.length == 0){
                addAtHead(val);
                return;
            }
            MyLinkedList newNode = new MyLinkedList();
            newNode.val = val;
            MyLinkedList pointer = this.head;
            while(pointer.next!=null){
                pointer = pointer.next;
            }
            pointer.next = newNode;
            this.length++;
        }

        public void addAtIndex(int index, int val) {
            if(index > this.length)
                return;
            if(index == 0){
                addAtHead(val);
                return;
            } else if(index == this.length){
                addAtTail(val);
                return;
            } else{
                MyLinkedList currentPointer = this.head;
                int currentIndex = 0;
                while(currentIndex < index-1){
                    currentPointer = currentPointer.next;
                    currentIndex++;
                }
                MyLinkedList newNode = new MyLinkedList();
                newNode.val = val;
                newNode.next = currentPointer.next;
                currentPointer.next = newNode;
                this.length++;
            }
        }

        public void deleteAtIndex(int index) {
            if(index >= this.length)
                return;
            if(index ==0){
                this.head = this.head.next;
                this.length--;
                return;
            }
            int counter = 0;
            MyLinkedList currentPointer = this.head;
            while(counter<index-1){
                currentPointer = currentPointer.next;
                counter++;
            }
            currentPointer.next = currentPointer.next.next;
            this.length--;
        }
    }
}
