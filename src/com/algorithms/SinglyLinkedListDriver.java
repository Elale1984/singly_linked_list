package com.algorithms;


public class SinglyLinkedListDriver {

    public static void main(String[] args) {

        Node<String> listHead = new Node<>("Paul");


        SinglyLinkedList<String> list = new SinglyLinkedList<>(listHead);



        list.insertNode("trevor");

        list.insertNode("dave");
        list.insertNode("john");

        list.insertNode("ziggy");

        list.insertNode("andrew");
        list.insertNode("andre");

        list.insertNode("cameron");

        Node<String> tempHead = list.head;
        while(tempHead != null){
            System.out.println(tempHead.data);
            tempHead = tempHead.nextNode;
        }


        System.out.println(list.getHead().data);
        System.out.println(list.getTail().data);

    }
}
