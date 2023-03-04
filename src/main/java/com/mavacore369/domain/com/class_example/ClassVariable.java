package com.mavacore369.domain.com.class_example;
/*
 * Shivan MavaCore369
 */
public class ClassVariable {
	
	String hello=new String("Hello");
	
	void sayHello()
	{
		System.out.println(hello);
	}
	
	public static void main(String[] args) {
		// 
		ClassVariable obj=new ClassVariable();
		obj.sayHello();
	}

}
