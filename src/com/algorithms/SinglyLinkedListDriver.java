package com.algorithms;


public class SinglyLinkedListDriver {

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.addNodeToList("Bob");
        list.addNodeToList("sara");
        list.addNodeToList("Fletcher");

        System.out.println(list.tail.data);

    }
}
