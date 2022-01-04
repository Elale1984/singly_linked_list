package com.algorithms;

public class SinglyLinkedList<T extends Comparable<T>> {


    public Node<T> getTail() {
        return tail;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    Node<T> head;
    Node<T> tail = null;

    public SinglyLinkedList() {
        this.head = null;
    }
    public SinglyLinkedList(Node<T> head) { this.head = head;}

//    insert method
    public void insertNode(T data) {

        Node<T> newNode = new Node<>(data);
        if(head == null || newNode.data.compareTo(head.data) <= 0) {

            newNode.nextNode = head;
            head = newNode;
            if (head.nextNode == null)
                tail = head;

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

    public void setTail(Node<T> head){
        System.out.println(head.data);

        Node<T> currentNode = head;

        while(currentNode != null){
            tail = currentNode;
            currentNode = currentNode.nextNode;
        }

    }
}
