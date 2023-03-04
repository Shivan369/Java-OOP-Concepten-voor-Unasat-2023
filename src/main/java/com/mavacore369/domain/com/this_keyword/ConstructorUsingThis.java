package com.mavacore369.domain.com.this_keyword;

public class ConstructorUsingThis {
	public ConstructorUsingThis() {
		System.out.println("This is a constructor!");
	}
	public ConstructorUsingThis(String str) {
		this();
		System.out.println("Value: "+str);
	}
	public static void main(String[] args) {
		ConstructorUsingThis cUsingThis = new ConstructorUsingThis("Hello");
	}

}
