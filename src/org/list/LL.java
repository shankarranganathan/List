package org.list;

import java.util.ArrayList;
import java.util.List;

public class LL {
public static void main(String[] args) {
	List <Integer>l=new ArrayList();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	l.add(50);
	List <Integer>l1=new ArrayList();
	l1.add(30);
	l1.add(40);
	l1.add(50);
	l1.add(60);
	l1.add(80);
	l.removeAll(l1);
	System.out.println(l);
	
	
}
}
