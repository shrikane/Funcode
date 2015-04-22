package edu.umbc.cs.basicDataStruct;

import java.util.HashSet;
import java.util.Set;

class Node<T> {
	Node<T> next;
	T data;

	Node(T inputData) {
		data = inputData;
		next = null;
	}
}

public class LinkedList<E> {

	private Node<E> head;

	@Override
	public String toString() {
		StringBuffer bf = new StringBuffer();
		Node<E> node = head;
		while (node.next != null) {
			bf.append(node.data + ",");
			node = node.next;
		}
		bf.append(node.data);
		return bf.toString();
	}

	public void add(E data) {
		if (head != null) {
			Node<E> node = head;
			while (node.next != null) {
				node = node.next;
			}
			Node<E> newNode = new Node<E>(data);
			node.next = newNode;
		} else {
			head = new Node<E>(data);
		}
	}

	public void deleteNode(Node<E> nodeToDelete) {
		Node<E> node = head;
		if (nodeToDelete == head) {
			head = head.next;
		} else {

			while (node.next != null) {
				// System.out.println(node.next.data);
				if (node.next == nodeToDelete) {
					node.next = nodeToDelete.next;
					nodeToDelete = null;
					break;
				}
				node= node.next;
			}
		}
	}
	
	
	
	
	public LinkedList<E> deDup(LinkedList<E> inputList){
		Set<E> elements = new HashSet<E>(); 
		Node<E> node = inputList.head;
		while(node.next!= null){
			if(elements.contains(node.data)){
				deleteNode(node);
			}else{
				elements.add(node.data);
			}
			node = node.next;
		}
		// last element
		if(elements.contains(node.data))
			deleteNode(node);
		return inputList;
	}
	
	/*
	public LinkedList<E> patition(LinkedList<Double> inputList,Double value){
		LinkedList<E> partitionedList = new LinkedList<E>();
		Node<Double> node = inputList.head;
		while(node.next!= null){
			if(node.data < value){
				
			}
		}
		
	}*/

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(1);
		l.add(1);
		l = l.deDup(l);
		System.out.println(l);
	}
}
