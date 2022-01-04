package com.algorithms;

public class SinglyLinkedList<T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertNode(T data) {

        Node<T> newNode = new Node<>(data);
        if(head == null || newNode.data.compareTo(head.data) <= 0) {

            newNode.nextNode = head;
            head = newNode;

        }
        else {

            Node<T> currentNode = head;
            Node<T> tempNode = currentNode;

            while (currentNode != null && currentNode.data.compareTo(newNode.data) < 0) {
                tempNode = currentNode;
                currentNode = currentNode.nextNode;
            }

            newNode.nextNode = currentNode;
            tempNode.nextNode = newNode;

        }
    }
}
