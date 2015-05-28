package edu.umbc.cs.interview;


import junit.framework.TestCase;
import org.junit.Test;


public class SearchNextMaximumNumberTest extends TestCase {

	SearchNextMaximumNumber s;

	
	private Integer getInteger(int num){
		return new Integer(num);
	}
	
	
	@Override
	protected void setUp() {
		s = new SearchNextMaximumNumber();
	}

	@Test
	public void testNormalInput() {
		int[] input = { 1, 4, 6, 8, 12, 29, 29, 31 };
		assertEquals(getInteger(1),  s.search(2, 0, input.length, input));   
	}
	
	@Test
	public void testElementNotFound() {
		int[] input = { 1, 4, 6, 8, 12, 29, 29, 31 };
		assertEquals(null,  s.search(90, 0, input.length, input));   
	}

	
	@Test
	public void testduplicateInputs() {
		int[] input = { 1,1,2,2,2,2,2,3 };		
		assertEquals(getInteger(2),  s.search(1, 0, input.length, input));   
	}
	
	@Test
	public void testAllDuplicateEntiresElemntNotFound() {
		int[] input = { 1,1,1,1,1,1,1,1 };
		assertEquals(null,  s.search(5, 0, input.length, input));   
	}

	@Test
	public void testElemntAtLowerBoundry() {
		int[] input = {1,2,3,4,5,6 };
		assertEquals(getInteger(0),  s.search(0, 0, input.length, input));   
	}
	
	
	@Test
	public void testElemntAtUpperBoundry() {
		int[] input = {1,2,3,4,5,6 };
		assertEquals(getInteger(5),  s.search(5, 0, input.length, input));   
	}
}
