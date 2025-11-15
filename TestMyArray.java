package com.demo.test;

import com.demo.arrays.MyArray;

public class TestMyArray {

	public static void main(String[] args) {
		MyArray obj = new MyArray();
		System.out.println("Array Elements : ");
		obj.add(10);
		obj.add(2);
		obj.add(5);
		obj.add(3);
		obj.add(7);
		
		obj.addAll();
		obj.primeFact();
		obj.maxPrime();
		System.out.println("\n-------------------------");		
		obj.copyArray();
		System.out.println(obj.reverseNumber(46));
		
		
	}

}
