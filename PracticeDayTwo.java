package interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import sream.practice.realWorldExample.Employee;

public class PracticeDayTwo {

	
	public static void main(String[] args) {
		
		System.out.println("1. Even Number...!");
		List<Integer> numbers1 =Arrays.asList(2,3,4,5,6,1,23,43,44);
		System.out.println(numbers1.stream().filter(n ->n%2 == 0).collect(Collectors.toList()));
		
		System.out.println("2. Convert String to UpperCase...!");
		
		List<String> str2 = Arrays.asList("hello","kito");
		System.out.println(str2.stream().map(String::toUpperCase).collect(Collectors.toList()));
		
		System.out.println("3. First Element greater than 10...!");
		List<Integer> str3 = Arrays.asList(3,5,16,12,5,7,8);
		System.out.println(str3.stream().filter(n -> n >10).findFirst().orElse(-1));
		
		System.out.println("4. Sort in descending order...!");
		List<Integer> descending = Arrays.asList(2,3,1,45,65,32);
		System.out.println(descending.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		System.out.println("5. Find Duplicate in the list...!");
		List<Integer> numbers5 =Arrays.asList(2,3,4,2,6,1,23,6,23);
		Set<Integer> hashSet = new HashSet<>();
		System.out.println(numbers5.stream().filter(n -> !hashSet.add(n)).collect(Collectors.toList()));
		
		System.out.println("6. Find Max and Min from the list...!");
		List<Integer> list6 =  Arrays.asList(3,5,1,2,12);
		Integer max= list6.stream().max((n1,n2) -> n1-n2).get();
		Integer min = list6.stream().min((o1, o2) -> o1-o2).get();
		System.out.println("MAX: "+max +" "+"Min: "+min);
		
		System.out.println("7. Sum Of all elements...!");
		
		List<Integer> addAll = Arrays.asList(2,3,4);
		System.out.println(addAll.stream().mapToInt(n -> n.intValue()).sum());
		
		System.out.println("8. Comma seperated and prefix [ and suffix ]...!");
		List<String> list8 = Arrays.asList("Hi","Ammu");
		System.out.println(list8.stream().collect(Collectors.joining(", ","[","]")));
		
		System.out.println("9. SecondHighest...!");
		List<Integer> secondHighest = Arrays.asList(3,2,1);
		System.out.println(secondHighest.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
System.out.println("10. Group Employee on the basis of Department and find the highest salary from the each department");
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Amaravani", "IT", 1500000));
		employees.add(new Employee(5, "Sachin", "IT", 1100000));
		employees.add(new Employee(8, "Vinod", "AWS", 3500000));
		employees.add(new Employee(7, "Bhavesh", "Cloud+", 7500000));
		employees.add(new Employee(2, "Prashant", "AWS", 1200000));
		
		employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors
				.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
		
		
		
		
		
		
		
		
		
		Map<String, Employee> map= employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(
				Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)));
		
		System.out.println(map);
		System.out.println("11. Partition Even and Odd...!");
		List<Integer> list = Arrays.asList(3,2,14,56,13);
		Map<Boolean, List<Integer>> get = list.stream().collect(Collectors.partitioningBy(n -> n%2==0));
		System.out.println("EVEN: "+get.get(true));
		System.out.println("ODD: "+get.get(false));
		
		System.out.println("12. Frequency Of Each Characters...!");
		String s12 = "banana";
		Map<Character, Long> map12 = s12.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(map12);
		
		System.out.println("13. First NoN - Repetetive Character...!");
		String string13 = "sachin";
		
		Character check = string13.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(n ->n.getValue()==1).map(Map.Entry::getKey).findFirst().get();
		System.out.println(check);
		
		System.out.println("13. First Repetetive Character...!");
		String string14 = "sachinn";
		Character check14 = string14.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n ->n.getValue()>1).map(Map.Entry::getKey).findFirst().get();
				System.out.println(check14);
		
		
	}
}
