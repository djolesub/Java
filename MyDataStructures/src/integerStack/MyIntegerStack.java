package integerStack;

import java.util.Arrays;

public class MyIntegerStack implements IntegerStack{
	//Defining fields 
	private int top;
	private int[] data;
	private static final int DEFAULT_CAPACITY = 10;
	
	//Constructor
	public MyIntegerStack(){
		this.top = -1;
		this.data = new int[DEFAULT_CAPACITY];
	}
	
	public MyIntegerStack(int capacity){
		this.top=-1;
		this.data = new int[capacity];
	} 
	
	public MyIntegerStack(int[] array){
		this.top=-1;
		this.data = Arrays.copyOf(array, array.length);
	}
	
	//Methods 
	public boolean isEmpty(){
		return this.top == -1;
	}
	public int peek(){
		return data[top];
	}
	public int pop(){
		if(isEmpty()) return 1;
		return data[top--];
	}
	
	public void push(int item){
		
		data[++top] = item;
		
	}
	
	public int size(){
		return top+1;
	}
	
	
	
	public void listData(){
		for(int num:data){
			System.out.println(num);
		}
	}
	
}
