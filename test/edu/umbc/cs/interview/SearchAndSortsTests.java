package edu.umbc.cs.interview;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class SearchAndSortsTests extends TestCase{

	SearchAndSorts s;
	
	@Override
	protected void setUp() {
		s = new SearchAndSorts();
	}
	
	@Test
	public void testQSortWithRandomNumbers() {
		int a[] = { 9, 6, 7, 8, 5 };
		s.Qsort(a, 0, a.length-1);
		assertArrayEquals(new int[]{5, 6,7,8,9},a);
	}
	
	@Test
	public void testQSortWithSortedNumberAscending() {
		int a[] = { 5, 6,7,8,9 };
		s.Qsort(a, 0, a.length-1);
		assertArrayEquals(new int[]{5, 6,7,8,9},a);
	}
	
	@Test
	public void testQSortWithSortedNumberDesending() {
		int a[] = {9,8,7,6,5 };
		s.Qsort(a, 0, a.length-1);
		assertArrayEquals(new int[]{5, 6,7,8,9},a);
	}
	
	
	@Test
	public void testbinarySearchAtLowIndex() {
		int a[] = { 5, 6,7,8,9 };
		assertEquals(0, s.binarySearch(a, 5,0, a.length-1));
	}
	
	@Test
	public void testbinarySearchAtHighIndex() {
		int a[] = { 5, 6,7,8,9 };
		assertEquals(4, s.binarySearch(a, 9,0, a.length-1));
	}
	
	@Test
	public void testbinarySearchNotFound() {
		int a[] = { 5, 6,7,8,9 };
		assertEquals(-1, s.binarySearch(a, 10,0, a.length-1));
	}
	
	
	
	
	
	

}
