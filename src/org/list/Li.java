package org.list;

import java.util.ArrayList;
import java.util.List;

public class Li {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(10);
		l.add(23);
		l.add(10);
		System.out.println(l);
		l.add(1, 99);
		System.out.println(l);
		l.set(2, 111);
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object remove = l.remove(3);
		System.out.println(remove);
		
		System.out.println(l);
		
		List l1=new ArrayList();
		boolean empty = l1.isEmpty();
		System.out.println(empty);
		
		boolean all = l1.addAll(l);
		System.out.println(l1);
		
		System.out.println(all);
		
		l1.add(434);
		l1.add(213);
		System.out.println(l1);
		
		boolean retainAll = l1.retainAll(l);
		System.out.println(l1);
		
		l1.removeAll(l);
		System.out.println(l1);
		boolean a = l1.addAll(l);
		System.out.println(l1);
		
		boolean retainAll2 = l1.retainAll(l);
		System.out.println(l1);
		
		
		
		
		
		
		
	}

}
