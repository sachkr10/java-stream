package interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import sream.practice.realWorldExample.Employee;

public class PracticeDaythree {

	public static void main(String[] args) {
		System.out.println("1. Even Number...!");
		List<Integer> numbers1 =Arrays.asList(2,3,4,5,6,1,23,43,44);
		System.out.println(numbers1.stream().filter(n -> n%2 == 0).collect(Collectors.toList()));
		
		System.out.println("2. Convert String to UpperCase...!");
		List<String> list2 = Arrays.asList("tree","beer","monk");
		System.out.println(list2.stream().map(String::toUpperCase).collect(Collectors.toList()));
        
		System.out.println("3. First Element greater than 10...!");
		List<Integer> numbers3 =Arrays.asList(2,3,4,5,6,1,23,43,44);
		System.out.println(numbers3.stream().filter(n -> n>10).findFirst().get());
		
		System.out.println("4. Sort in descending order...!");
		List<Integer> numbers4 =Arrays.asList(2,3,4,5,6,1,23,43,44);
		System.out.println(numbers4.stream().sorted((o1,o2) -> o2-o1).collect(Collectors.toList()));
		
		System.out.println("5. Find Duplicate in the list...!");
		List<Integer> numbers5 =Arrays.asList(2,3,4,2,6,1,23,6,23);
		Set<Integer> set5 = new HashSet<>();
		System.out.println(numbers5.stream().filter(n -> !set5.add(n)).collect(Collectors.toList()));
		
		System.out.println("6. Find Max and Min from the list...!");
		List<Integer> numbers6 =Arrays.asList(2,3,4,2,6,1,23,6,23);
		System.out.println("MAX: "+numbers6.stream().max((o1,o2) -> o1-o2).get());
		System.out.println("MIN: "+numbers6.stream().min((o1,o2) -> o1-o2).get());
		
		System.out.println("7. Sum Of all elements...!");
		/*
		 * mapToInt() -> Convert Stream<Integer> to Specialized Integer Stream
		 * intValue() -> Convert Integer Object to the primitive int
		 */
		List<Integer> numbers7 =Arrays.asList(2,3,4,2,6,1);
		System.out.println(numbers7.stream().mapToInt(n ->n.intValue()).sum());
		
		System.out.println("8. Comma seperated and prefix [ and suffix ]...!");
		//delimiter, prefix, suffix
		List<String> strings8 = Arrays.asList("Amaravani", "Sachin","Likki");
		System.out.println(strings8.stream().collect(Collectors.joining(", ","[","]")));
		
		System.out.println("9. SecondHighest...!");
		List<Integer> numbers9 =Arrays.asList(2,3,4,2,6,1);
		System.out.println(numbers9.stream().sorted((o1,o2) -> o2-o1).skip(1).findFirst().get());
		
System.out.println("10. Group Employee on the basis of Department and find the highest salary from the each department");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Amaravani", "IT", 1500000));
		employees.add(new Employee(5, "Sachin", "IT", 1100000));
		employees.add(new Employee(8, "Vinod", "AWS", 3500000));
		employees.add(new Employee(7, "Bhavesh", "Cloud+", 7500000));
		employees.add(new Employee(2, "Prashant", "AWS", 1200000));
		
	Map<String,Employee> check=	employees.stream().
		collect(Collectors.groupingBy(Employee::getDept, 
				Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
	System.out.println(check);
	
	System.out.println("11. Partition Even and Odd...!");
	List<Integer> numbers11 =Arrays.asList(2,3,4,2,6,1);
	Map<Boolean, List<Integer>> l11 =numbers11.stream().collect(Collectors.partitioningBy(n -> n%2==0));
	System.out.println("EVEN: "+l11.get(true));
	System.out.println("ODD: "+l11.get(false));
	
	System.out.println("12. Frequency Of Each Characters...!");
	String s12 = "banana";
	
	Map<Character,Long> check12 = s12.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	System.out.println(check12);
	}

}
