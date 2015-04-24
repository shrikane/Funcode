package edu.umbc.cs.basicDataStruct;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	
	@Test
	public void addTest() {
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(1.0);
		l.add(2.0);
		assertEquals(true, l.toString().equals("1.0,2.0,"));
	}

	@Test
	public void getTest(){
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(1.0);
		l.add(2.0);
		assertEquals((double)2.0,(double) l.get(1).getData(),0.0);
		assertEquals((double)1.0,(double) l.get(0).getData(),0.0);
	}
	
	@Test
	public void testDeleteNode() {
		LinkedList<Double> l = new LinkedList<Double>();
		l.add(1.0);
		l.add(2.0);
		LinkedList<Double> l1 = new LinkedList<Double>();;
		l1.add(2.0);
		l.deleteNode(l.getHead());
		assertEquals(true, l.toString().equals("2.0,"));
		l.add(1.0);
		l.deleteNode(l.get(1));
		assertEquals(true, l.toString().equals("2.0,"));
	}
	

}
