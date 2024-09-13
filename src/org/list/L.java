package org.list;

import java.util.ArrayList;
import java.util.List;

public class L {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList();
		l.add(23);
		l.add(234);
		System.out.println(l);
		int indexOf = l.indexOf(23);
		System.out.println(indexOf);
	}

}
