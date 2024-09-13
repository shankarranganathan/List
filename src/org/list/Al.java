package org.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.*;

public class Al {
	public static void main(String[] args) {
	    List<Integer> l = new ArrayList<Integer>();
	    l.add(10);
	    l.add(20);
	    l.add(30);
	    l.add(90);
	    l.add(10);
	    l.add(10);
	    l.add(40);
	    l.add(50);
	    l.add(30);
	    System.out.println(l);
	    int c=10;
	    int d=100;
	    l.replaceAll(z->z==c?d:z);
	    System.out.println(l);
	    l.remove(2);
	    System.out.println(l);
	    l.add(10);
	    l.add(23);
	    l.add(23);
	    System.out.println(l);
	    int e=23;
	    int f=34;
	    l.replaceAll(z->z==e?f:z);
	    System.out.println(l);
	  
	}
	
	

}
