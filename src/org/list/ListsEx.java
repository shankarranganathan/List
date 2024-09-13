package org.list;

import java.util.ArrayList;
import java.util.List;

public class ListsEx {
public static void main(String[] args) {
	List<Integer> l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	System.out.println(l);
	Object remove = l.remove(2);
	System.out.println(l);
	Integer integer = l.get(2);
	int b=integer+50;
	l.add(2, b);
	System.out.println(l);
	int size = l.size();
	System.out.println(size);
	Integer integer2 = l.get(5);
	int c=integer2+70;
	l.set(5, c);
	System.out.println(l);
	
	
	
}
}
