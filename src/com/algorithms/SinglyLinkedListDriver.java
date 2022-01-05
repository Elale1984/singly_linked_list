package com.algorithms;


public class SinglyLinkedListDriver {

    public static void main(String[] args) {

        //Test the constructor for a node
        Node<String> listHead = new Node<>("Paul");

        //Test the constructor for the singly linked list
        SinglyLinkedList<String> list = new SinglyLinkedList<>(listHead);

        //Test the insertNode method to create the ascending list
        list.insertNode("trevor");
        list.insertNode("dave");
        list.insertNode("john");
        list.insertNode("ziggy");
        list.insertNode("andrew");
        list.insertNode("andre");
        list.insertNode("cameron");

        printList(list);

        list.popFront();
        printList(list);

        list.popBack();
        printList(list);



        // Test the getHead
        System.out.println(list.getFront().data);

        // Test the getTail
        System.out.println(list.getBack().data);

    }

    private static void printList(SinglyLinkedList<String> list) {
        //Print the list
        Node<String> tempHead = list.head;
        while(tempHead != null){
            System.out.println(tempHead.data);
            tempHead = tempHead.nextNode;
        }

        System.out.println();
    }
}

