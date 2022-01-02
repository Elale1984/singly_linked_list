package com.algorithms;


public class SinglyLinkedListDriver {

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.insertNode("Z");
        list.insertNode("C");
        list.insertNode("B");
        list.insertNode("B");

        Node temp = list.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.nextNode;
        }



    }
}
