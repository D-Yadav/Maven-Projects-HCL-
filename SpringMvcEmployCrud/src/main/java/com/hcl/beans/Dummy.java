package com.hcl.beans;

import java.util.SortedSet;
import java.util.TreeSet;

public class Dummy {

	
	public static void main(String[] args) {
		SortedSet<Integer> s=new TreeSet<Integer>();
		s.add(7);
		s.add(3);
		s.add(2);
		s.add(4);
		s.add(1);
		SortedSet<Integer> s1=s.subSet(1, 4);
		s1.add(3);
		s1.add(3);
		System.out.println(s1);
	}
}
