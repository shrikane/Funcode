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
	
	@Test
	public void testInplaceReplacement(){
		String testString = "a b c    ";
		String testString1 = "this is test string1 and        ";
		String testString2 = "   ";
		 assertEquals(true,new String(test.replaceAll(testString.toCharArray(), 5)).equalsIgnoreCase("a%20b%20c"));
		 assertEquals(true,new String(test.replaceAll(testString1.toCharArray(), 24)).equalsIgnoreCase("this%20is%20test%20string1%20and"));
		 assertEquals(true,new String(test.replaceAll(testString2.toCharArray(), 1)).equalsIgnoreCase("%20"));
	}
	
	@Test
	public void StringCompressionTest(){
		String testString = "aabbccddde";
		String testString1 = "abc";
		assertEquals(true, "a2b2c2d3e1".equals(test.basicStringCompression(testString)));
		assertEquals(true, "abc".equals(test.basicStringCompression(testString1)));
	}
	
	@Test
	public void testIsroatation(){
		assertEquals(true, test.isRoatation("waterbottle", "erbottlewat"));
	}
}
