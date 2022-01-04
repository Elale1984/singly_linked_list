package com.algorithms;


public class SinglyLinkedListDriver {

    public static void main(String[] args) {


        Node<String> head = new Node<>("James");
        SinglyLinkedList<String> list = new SinglyLinkedList<>(head);
        list.setHead(head);
        list.insertNode("trevor");

        list.insertNode("dave");
        list.insertNode("john");

        list.insertNode("ziggy");

        list.insertNode("andrew");
        list.insertNode("andre");

        list.insertNode("cameron");

        while(list.head != null){
            System.out.println(list.head.data);
            list.head = list.head.nextNode;
        }



    }
}
