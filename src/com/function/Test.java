package com.function;

import java.util.function.Function;

public class Test 
{
	public static void main(String[] args) 
	{
		//apply(input); method
		Function<Integer, Integer>f=val->val*2;
		Integer result = f.apply(2);
		System.out.println(result); //4
		
		//andThen Method --> function1.andThen(function2).apply(input);
		Function<Integer, Integer>f1=val1->val1*2;
		Function<Integer, Integer>f2=val2->val2*val2*val2;
		Integer res= f1.andThen(f2).apply(4);
		System.out.println(res);
		
		Function<String, Integer>f3=str->str.length();
		Function<Integer, Integer>f4=a->a*2;
		Function<Integer, Integer>f5=b->b*b*b;
		Integer result1 = f3.andThen(f4).andThen(f5).apply("GopiKrishna");
		System.out.println(result1);
		
		//compose Method -->fun1.compose(fun2).apply(input);
		Function<Integer, Integer>f6=x->x*2;
		Function<Integer, Integer>f7=y->y*y*y;
		Integer comp_result = f6.compose(f7).apply(4);
		System.out.println(comp_result);
		
	}
}