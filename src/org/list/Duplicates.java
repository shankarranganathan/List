package org.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Duplicates {
public static void main(String[] args) {
	List<Integer > a=new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(2);
	a.add(1);
	a.add(19);
	a.add(21);
	System.out.println(a);
	Set s=new HashSet();
	boolean all = s.addAll(a);
	System.out.println(s);
	int size = a.size();
	System.out.println(size);
	int indexOf = a.indexOf(1);
	System.out.println(indexOf);
	int lastIndexOf = a.lastIndexOf(1);
	System.out.println(lastIndexOf);

for (Object object : a) {
	System.out.println(object);
	
}
for (int i = 0; i < a.size(); i++) {
	Object object = a.get(i);
	System.out.println(object);
	
}
Object object = a.get(2);
System.out.println(object);
a.remove(2);
System.out.println(a);
Integer integer = a.get(2);
int b=integer+50;
Integer set = a.set(2, b);
System.out.println(a);
a.replaceAll(null);

	
}
}
