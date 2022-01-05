package com.algorithms;

public class SinglyLinkedList<T extends Comparable<T>> {

    public Node<T> head;
    public Node<T> tail;

    //Default Constructor
    public SinglyLinkedList() {
        this.head = null;
    }

    //Parameterized Constructor
    public SinglyLinkedList(Node<T> head) { this.head = head;}

    //Copy Constructor
    public SinglyLinkedList<T> CopyList (SinglyLinkedList<T> oldList) {

        if(oldList.head == null)
            return null;
        else{

            Node<T> currentNode = oldList.head;
            Node<T> copyNode = currentNode;
            while(currentNode != null){
                copyNode.nextNode = currentNode.nextNode;
                currentNode = currentNode.nextNode;
            }
            return new SinglyLinkedList<>(copyNode);
        }


    }
    //Insert method
    public void insertNode(T data) {

        Node<T> newNode = new Node<>(data);
        if(head == null || newNode.data.compareTo(head.data) <= 0) {

            newNode.nextNode = head;
            this.head = newNode;

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
