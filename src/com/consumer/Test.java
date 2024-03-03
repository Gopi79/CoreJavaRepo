package com.consumer;

import java.util.function.Consumer;

public class Test 
{
	public static void main(String[] args) {
		Consumer<String> c=t->System.out.println(t);
		c.accept("Alex");
	}
}