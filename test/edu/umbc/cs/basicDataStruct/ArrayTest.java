package edu.umbc.cs.basicDataStruct;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.umbc.cs.basicDataStruct.ArrayPractise;

public class ArrayTest {

	ArrayPractise test = new ArrayPractise();
	
	@Test
	public void uniqueChars() {
		String testString = "aAbCde";
		String testString1 = "abcderf";
		 assertEquals(false, test.checkDuplicateWithExtraSpace(testString)); 
		 assertEquals(true, test.checkDuplicateWithExtraSpace(testString1)); 
	}
	
	@Test
	public void testLength() {
		char [] testString = {'a','b','c','\0'};
		char [] testString1 ={'\0'};
		 assertEquals(3, test.getLength(testString)); 
		 assertEquals(0, test.getLength(testString1)); 
	}
	
	@Test
	public void testReverse() {
		String testString = "aAbCde\0";
		String testString1 = "\0";
		String testString2 = "abc\0";
		 assertEquals(true, new String("edbCAa\0").equals(new String(test.reverse(testString.toCharArray())))); 
		 assertEquals(true, new String("\0").equals(new String(test.reverse(testString1.toCharArray())))); 
		 assertEquals(true, new String("cba\0").equals(new String(test.reverse(testString2.toCharArray())))); 
	}
	
	@Test
	public void testIspermute(){
		 String testString = "abc";
		 assertEquals(true,test.isPermutation(testString,"cba"));
		 assertEquals(false,test.isPermutation(testString,"pqr"));
		 assertEquals(true,test.isPermutation(testString,""));
	}
}
