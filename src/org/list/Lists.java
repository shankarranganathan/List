package org.list;

import java.util.ArrayList;
import java.util.List;


public class Lists {
public static void main(String[] args) {
	List l =new ArrayList();
	List l1=new ArrayList();
	l.add(10);
	l.add("Greens");
	l.add('a');
	l.add(98.43434f);
	l.add(9840170521l);
	l.add(10);
	System.out.println(l);
	
	
	int size = l.size();
	System.out.println(size);
	
	
	Object object = l.get(2);
	System.out.println(object);
	
	l.add(1,"shankar");
	System.out.println(l);
	
	Object set = l.set(2,"green" );
	System.out.println(l);
	System.out.println(set);
	
	
	Object remove = l.remove(3);
	System.out.println(remove);
	System.out.println(l);
	
	boolean empty = l.isEmpty();
	System.out.println(empty);
	
	boolean contains = l.contains("shankar");
	System.out.println(contains);
	
	int indexOf = l.indexOf(10);
	System.out.println(indexOf);
	
	int lastIndexOf = l.lastIndexOf(10);
	System.out.println(lastIndexOf);
	
	
	boolean all = l1.addAll(l);
	System.out.println(l1);
	
	l1.add(20);
	l1.add(90);
	System.out.println(l1);
	
	
	l1.retainAll(l);
	System.out.println(l1);
	
	l1.removeAll(l);
	System.out.println(l1);
	
	
	
	
	
}
}
