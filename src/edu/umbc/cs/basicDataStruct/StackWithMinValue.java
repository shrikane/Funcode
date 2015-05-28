package edu.umbc.cs.basicDataStruct;

import java.util.ArrayList;
import java.util.List;

public class StackWithMinValue {

	private int top;
	private List<Integer> dataStore;
	private int MinValue;
	/***
	 * Implements stack which has push pop and get in in O91)
	 */
	public StackWithMinValue() {
		top =0;
		dataStore = new ArrayList<Integer>();
		MinValue = Integer.MAX_VALUE;  // to compare and find min value at insert let's use Integer max 
	}
	
	
	public void push(int data){
		dataStore.add(data);
		if(data < MinValue){
			MinValue = data;
		}
		top++;
	}
	
	public int pop(){
		return dataStore.get(top--);
	}
	
	public int getMinValue(){
		return MinValue;
	}

}
