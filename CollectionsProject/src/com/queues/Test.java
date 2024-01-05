package com.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test 
{
	public static void main(String[] args) 
	{
		Queue pq=new PriorityQueue();
		// offer method is used to add element in Queue
		pq.offer(77);
		pq.offer(22);
		pq.offer(10);
		pq.offer(100);
		pq.offer(88);
		pq.offer(9);
		pq.offer(55);
		 
		System.out.println(pq); // [9, 77, 10, 100, 88, 22, 55]
		// poll return Object in Queue Parment delete
		System.out.println(pq.poll()); // 9
		
		System.out.println(pq); // [10, 77, 22, 100, 88, 55]
		// remove return Object in Queue Parmenent delete
		System.out.println(pq.remove()); // 10
		
		System.out.println(pq); // [22, 77, 55, 100, 88]
		// peek return Object in Queue to get firest elememt in Queue if empty return null
		System.out.println(pq.peek()); // 22
		
		System.out.println(pq); // [22, 77, 55, 100, 88]
		// element return Object in Queue to get head element in Queue if empty return Exception NoSuchElementException
		System.out.println(pq.element()); // 22
		
		System.out.println(pq); // [22, 77, 55, 100, 88]
		
	}
}
