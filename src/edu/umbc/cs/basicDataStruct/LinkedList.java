package edu.umbc.cs.basicDataStruct;

import java.util.HashSet;
import java.util.Set;

import org.hamcrest.core.IsInstanceOf;

/***
 * 
 * @author Shrinivas node basic attribute of linked-list
 * @param <T>
 *            node with object specified
 */

public class LinkedList<E> {

	class Node<T> {
		private Node<T> next;
		private T data;

		Node(T inputData) {
			data = inputData;
			next = null;
		}

		Node(Node<T> node) {
			next = node.next;
			data = node.data;
		}

		T getData() {
			return data;
		}

		@Override
		public String toString() {
			return "Data is " + data;
		}
	}

	boolean isDataEqual(Node<E> input, Node<E> testNode) {
		
			if (input.data instanceof Double) {
				System.out.println("in double");
				if ((double)new Double((Double) input.data) == (double) new Double(
						(Double) input.data)) {
					return true;
				} else {
					return false;
				}

			} else {
				if (input.data instanceof Long) {
					if ((long)new Long((Long) input.data) == (long)new Long(
							(Long) input.data)) {
						return true;
					} else {
						return false;
					}
				}
			}
		
		return false;
	}

	private Node<E> head;

	public Node<E> getHead() {
		return head;
	}

	@Override
	public String toString() {
		StringBuffer bf = new StringBuffer();
		Node<E> node = head;
		while (node != null) {
			bf.append(node.data + ",");
			node = node.next;
		}
		return bf.toString();
	}

	/**
	 * Inserts node to linked-list
	 * 
	 * @param data
	 *            data element of node
	 */
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

	/**
	 * removes specific node from linked-list
	 * 
	 * @param nodeToDelete
	 */
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
				node = node.next;
			}
		}
	}

	/**
	 * removes duplicate elements in linked-list custom objects will require
	 * equals method overridden in their class
	 * 
	 * @param inputList
	 * @return list without duplicate elements
	 */
	public LinkedList<E> deDup(LinkedList<E> inputList) {
		Set<E> elements = new HashSet<E>();
		Node<E> node = inputList.head;
		while (node != null) {
			if (elements.contains(node.data)) {
				deleteNode(node);
			} else {
				elements.add(node.data);
			}
			node = node.next;
		}
		return inputList;
	}

	/**
	 * Partitions link based on value works only with numeric data (thats why
	 * double)
	 * 
	 * @param inputList
	 *            inputlist (optimization can use just head node if you have
	 *            access :))
	 * @param value
	 *            pivot value
	 * @return list with partitoned data
	 */
	public LinkedList<Double> patition(LinkedList<Double> inputList,
			Double value) {
		LinkedList<Double> partitionedList = new LinkedList<Double>();
		Node<Double> node = (Node<Double>) inputList.getHead();
		while (node != null) {
			if (node.data > value) {
				partitionedList.add(node.data);

			} else {
				Node<Double> tempNode = new Node<Double>(node.data);
				tempNode.next = (Node<Double>) partitionedList.head;
				setHead((Node<E>) tempNode);
			}
			node = node.next;
		}
		return partitionedList;
	}

	void addList(Node<Double> list1Node, final LinkedList<Double> summedResult) {
		while (list1Node != null) {
			summedResult.add(list1Node.data);
		}
	}

	public LinkedList<Double> SumList(LinkedList<Double> firtsList,
			LinkedList<Double> secondList) {
		Node<Double> list1Node = (Node<Double>) firtsList.head;
		Node<Double> list2Node = (Node<Double>) secondList.head;
		LinkedList<Double> summedResult = new LinkedList<Double>();
		double extra = 0;
		while (list1Node != null && list2Node != null) {
			double sum = list1Node.data + list2Node.data;
			double nextSum = sum;
			sum = (sum + extra) % 10.0;
			extra = 0;
			extra = (int) nextSum / 10;
			summedResult.add(sum);
			list2Node = list2Node.next;
			list1Node = list1Node.next;
		}
		addList(list1Node, summedResult);
		addList(list2Node, summedResult);
		return summedResult;
	}

	Node<E> get(int index) {
		Node<E> node = head;
		int i = 0;
		while (node != null) {
			if (i == index) {
				return node;
			}
			node = node.next;
			i++;
		}
		return null;
	}

	/***
	 * Reverse linked-list
	 * 
	 * @param inputList
	 * @return
	 */
	public LinkedList<E> reverse(LinkedList<E> inputList) {
		Node<E> reversedPart = null;
		Node<E> current = inputList.head;
		while (current != null) {
			Node<E> next = current.next;
			current.next = reversedPart;
			reversedPart = current;
			current = next;
		}
		head = reversedPart;
		return inputList;
	}

	

	private void setHead(Node<E> node) {
		head = node;
	}

	public static void main(String[] args) {
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(7.0);
		l.add(1.0);
		l.add(6.0);
		l.add(54.0);
		// l.add(30.9);
		LinkedList<Double> l1 = new LinkedList<Double>();
		l1.add(5.0);
		l1.add(9.0);
		l1.add(2.0);
		// l1.add(54.0);
		// l1.add(30.9);
		// l = l.deDup(l);
		// l = l.patition(l, 35.0);
		// System.out.println(l);
		// l1 = l.reverse(l);
		// System.out.println(l1);
		// l=l.SumList(l, l1);
		// System.out.println(l);
	}
}
