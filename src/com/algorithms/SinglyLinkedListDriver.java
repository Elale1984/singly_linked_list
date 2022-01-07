package com.algorithms;


public class SinglyLinkedListDriver {

    public static void main(String[] args) {

        //Test the constructor for a node
        Node<String> listHead = new Node<>("paul");

        //Test the constructor for the SinglyLinkedList
        SinglyLinkedList<String> list = new SinglyLinkedList<>(listHead);

        //Test the insertNode method to create the ascending SinglyLinkedList
        list.insertNode("trevor");
        list.insertNode("dave");
        list.insertNode("john");
        list.insertNode("ziggy");
        list.insertNode("andrew");
        list.insertNode("andre");
        list.insertNode("cameron");

        System.out.println("\n\nPrinting the list after insertNode is called multiple times...\n");
        printList(list);

        // Test getting the head and tail of the SinglyLinkedList
        System.out.println("The head is " + list.getFront().data);
        System.out.println("The tail is " + list.getBack().data);

        // Test the copy constructor
        System.out.println("\nUsing the Copy constructor... ");
        System.out.println("\nOriginal List:");
        printList(list);

        SinglyLinkedList<String> copyList = new SinglyLinkedList<>(list);
        System.out.println("Copy List:");
        printList(copyList);

        // Testing the popFront method

        list.popFront();
        System.out.println("After calling the popFront method: ");
        printList(list);


        list.popBack();
        System.out.println("\nAfter calling the popBack method: ");
        printList(list);


        // Test SinglyLinkedList size()
        System.out.println("\nThe size of the list is " + list.size());

        // Test if the SinglyLinkedList is empty
        SinglyLinkedList<String> aList = new SinglyLinkedList<>();
        System.out.println("\nOriginal list empty? " + list.isEmpty());
        System.out.println("\nNew list empty? " + aList.isEmpty());



        System.out.println("Testing the mergeList method...");
        System.out.println("\nCreated a new SinglyLinkedList containing: ");
        Node<String> list2Head = new Node<>("uncle bob");
        SinglyLinkedList<String> list2 = new SinglyLinkedList<>(list2Head);

        list2.insertNode("nikki");
        list2.insertNode("izabella");
        list2.insertNode("natalee");

        printList(list2);
        System.out.println("Merging the two lists make the new list as follows: ");
        list.mergeLists(list2);
        printList(list);

        // Test reverse the SinglyLinkedList
        System.out.println("\nThe current list is as follows: ");
        printList(list);
        System.out.println("\nThe reversed list is as follows: ");
        SinglyLinkedList<String> reversedList = new SinglyLinkedList<>(list.reverse());
        printList(reversedList);
        System.out.println("The new head is " + list.getHead().data +
                " and the new tail is " + list.getTail().data);

    }

    private static void printList(SinglyLinkedList<String> list) {
        //Print the list
        Node<String> tempHead = list.getHead();
        while(tempHead != null){
            System.out.println(tempHead.data);
            tempHead = tempHead.nextNode;
        }

        System.out.println();
    }
}

