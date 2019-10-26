/**
 * 
 */
package com.ikea.lambda.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SINAD3
 *
 */
public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Siva");
		list.add("Raj");
		list.add("Mani");
		list.add("Rajesh");

//		for (String st : list) {
//			if (st.startsWith("S")) {
//				System.out.println(st);
//			}
//		}

//		list.stream().forEach(t -> System.out.println(t));
		
		list.stream().filter(t->t.startsWith("R")).forEach(t -> System.out.println(t));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "tets");

//		map.forEach((key, value) -> System.out.println(key + "  : " + value));
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));

	}

}
