package com.algorithms;



public class SinglyLinkedList<T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertNode(T data) {

        Node<T> newNode = new Node<>(data);
        Node<T> currentNode;

        if(head == null || newNode.data.compareTo(head.data) <= 0) {
            head = newNode;
        }
        else {
            currentNode = head;

            while (currentNode.nextNode != null && currentNode.nextNode.data.compareTo(newNode.data) > 0){
                if(currentNode.data.compareTo(newNode.data) > 0){
                    currentNode = currentNode.nextNode;
                    newNode.nextNode = currentNode.nextNode;
                    currentNode.nextNode = newNode;
                }
            }




        }
    }
}
