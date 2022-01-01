package com.algorithms;


import java.util.Comparator;

public class SinglyLinkedList<T> implements Comparator<T> {

    Node<T> head;
    Node<T> tail;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addNodeToList(T data) {

        Node<T> tempNode = new Node<>(data);

        if(head == null || head.data.(temp) {
            head = tempNode;
            tail = tempNode;

        }
        else {
            Node<T> currentNode = head;

            while (currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = tempNode;
            tail = tempNode;
        }
    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
