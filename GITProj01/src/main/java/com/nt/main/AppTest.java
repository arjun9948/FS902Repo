package com.nt.main;

import com.nt.service.ArithmeticOperations;

public class AppTest {

	public static void main(String[] args) {
		
		ArithmeticOperations ar = new ArithmeticOperations();
		System.out.println("sum:"+ ar.sum(20, 40));
		System.out.println("sub:"+ar.sub(20, 30));
		System.out.println("-----------------------");
	}
}
