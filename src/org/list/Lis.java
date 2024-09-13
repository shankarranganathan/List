package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lis {
	public static void main(String[] args) {
		List l=new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(15);
		System.out.println(l);
		l.add(2, 15);
		System.out.println(l);
		l.set(2, "null");
		System.out.println(l);
		List l1=new ArrayList();
		l1.addAll(l);
		System.out.println(l1);
		l1.add(343);
		l1.add(3434);
		System.out.println("l1:"+l1);
		l1.set(2, "shankar");
		System.out.println(l1);
		l1.add(0, "ianm");	
		System.out.println(l1);
		
	}

}
