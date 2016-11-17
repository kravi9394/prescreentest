/**
 * 
 */
package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Naveen Chintala
 *
 */
public class ProblemStatement4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Integer> integerMap = new HashMap<>();
		integerMap.put(1, 5);
		integerMap.put(10, 3);
		integerMap.put(20, 26);
		integerMap.put(30, 73);
		integerMap.put(40, 22);
		integerMap.put(50, 99);
		integerMap.put(60, 43);
		integerMap.put(70, 37);
		List<Integer> integerList = new ArrayList<Integer>(integerMap.values());
		// If value is not primitive or wrapper define a custom comparator and
		// sort it.
		Collections.sort(integerList);
		Collections.reverse(integerList);
		System.out.println("Printing in descending order : ");
		for (Integer value : integerList) {
			System.out.println(value);
		}
	}

}
