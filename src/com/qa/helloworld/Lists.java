package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Habiba");
		names.add("Steph");
		names.add("Peter");
		names.add("Hacker");
		names.add("Steven");
		
//		System.out.println(names);
//		System.out.println(names.get(0));
		
//		names.set(0, "Rocco");
//		names.remove(3);
//		System.out.println(names);
//		
//		Collections.sort(names);
//		System.out.println(names);
//	    System.out.println(names.size());
	    
	    for (String name : names) {
	    	System.out.println(name);
	    	
	    }
		
		
		
		
		
		
		
		
		
		
		
	}

}
