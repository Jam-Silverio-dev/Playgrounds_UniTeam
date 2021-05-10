package com.accenture.bootcamp.day8.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

	//Common Data Structures in Java
	//Set
	//List
	
	
	public static void main(String[] args) {

//		Set<String> actorSet = new HashSet<String>();
		Set<String> actorSet = new TreeSet<String>();
		actorSet.add("Brad");
		actorSet.add("Chris");
		actorSet.add("John");
		actorSet.add("Evan");
		actorSet.add("Al");
		
		
		actorSet.forEach((actor) -> {
			System.out.println(actor);
		});
	}

}
