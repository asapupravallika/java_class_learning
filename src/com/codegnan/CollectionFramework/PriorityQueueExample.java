package com.codegnan.CollectionFramework;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class PriorityQueueExample {

	public static void main(String[] args) {
		/*Queue<Integer> pq = new PriorityQueue<>();
		pq.add(5);
		pq.add(3);
		pq.add(1);
		pq.add(4);
		pq.add(2);
		pq.add(6);
		System.out.println(pq);*/
		
		Deque<String> dq = new LinkedBlockingDeque<>(2);
		dq.offerFirst("Java");
		dq.offerFirst("Python");
		System.out.println(dq);
		dq.offerFirst("C");
		System.out.println(dq);
	}

}
