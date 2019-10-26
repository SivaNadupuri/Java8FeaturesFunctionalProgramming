/**
 * 
 */
package com.ikea.lambda.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author SINAD3
 *
 */
public class SortingCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(3);

		List<Employee> empList = DataBase.getEmployees();

//		Collections.sort(empList,new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getSalary()-o2.getSalary());
//			}
//			
//		});
//		
//		Collections.sort(empList, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
//
//		// with Lambda Approach
//
//		System.out.println(empList);

		// using Stream api
//		empList.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);
		
		// final optimization code
		//empList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
		
				empList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

//		Collections.sort(list);
//		Collections.reverse(list);
//		System.out.println(list);
//		list.stream().sorted().forEach(s -> System.out.println(s));// Ascending order
//
//		System.out.println("-------------------------------------------");
//
//		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));// Descending order

	}

}

//class MySorting implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return (int) (o1.getSalary()-o2.getSalary());
//	}
//	
//}
