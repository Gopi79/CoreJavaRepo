package com.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo 
{
	public static void main(String[] args) 
	{
		Queue qp=new PriorityQueue(new MyComparator());
		
		qp.add('Z');
		qp.add('Q');
		qp.add('A');
		qp.add('X');
		qp.add('I');
		qp.add('O');
		
		System.out.println(qp);
	}
}
