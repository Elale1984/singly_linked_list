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
        // TODO: 1/4/2022 still not returning the correct head with the next pointer going to the next node
        if(oldList.head == null)
            return null;
        else{

            Node<T> currentNode = oldList.head;
            Node<T> copyNode = new Node<>(oldList.head.data);
            while(currentNode != null){
                currentNode = currentNode.nextNode;
                copyNode.nextNode = new Node<>(currentNode.data);
                copyNode = copyNode.nextNode;
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

    // Get the Front Node
    public Node<T> getFront(){

        return this.head;
    }

    // Get the Back Node
    public Node<T> getBack(){

        Node<T> currentNode = head;

        if(currentNode == null){
            return null;
        }
        else {
            Node<T> rearNode = currentNode;
            while(currentNode != null){
                rearNode = currentNode;
                currentNode = currentNode.nextNode;
            }
            return rearNode;
        }
    }

    // Remove node from the front of the list
    public void popFront(){
        this.head = head.nextNode;
    }

    // Remove Node from the back of the list
    public void popBack() {
        // TODO: 1/4/2022 PopBack still not working
        Node<T> currentNode = head;
        if(currentNode != null){

            Node<T> tempNode = currentNode;
            while(currentNode != null){
                tempNode = currentNode;
                currentNode = currentNode.nextNode;
            }

            tempNode.nextNode = null;

        }
    }

    // Get the size of the linked list
    public int size(){
        int size = 0;
        Node<T> currentNode = head;
        if(currentNode == null){
            return size;
        }
        else {
            while (currentNode != null){
                size++;
                currentNode = currentNode.nextNode;
            }
        }
        return size;
    }

    // Method returns true if singlyLinkedList is empty and false if it is not empty
    public boolean isEmpty() {
        return head == null;
    }

    // Reverse the singlyLinkedList
    public Node<T> reverse() {
        Node<T> previousNode = null;

        while (head != null){
            Node<T> nextNode = head.nextNode;
            head.nextNode = previousNode;
            previousNode = head;
            head = nextNode;
        }
        return previousNode;
    }



    public void traverse() {

    }

}
