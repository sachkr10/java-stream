package interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeDay1 {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("Even Number"); List<Integer> evenNumber =
		 * Arrays.asList(8,3,4,1,2,3,9); System.out.println(evenNumber.stream().filter(n
		 * -> n % 2 == 0).collect(Collectors.toList()));
		 */
		/*
		 * System.out.println("Convert lowerCase to upperCase.."); List<String> list =
		 * Arrays.asList("hi","to","yutr");
		 * System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.
		 * toList()));
		 */
		
		/*
		 * System.out.println("First element greater than 10...!"); List<Integer>
		 * evenNumber =Arrays.asList(8,3,4,11,2,33,9);
		 * System.out.println(evenNumber.stream().filter(n -> n
		 * >10).findFirst().orElse(-1));
		 */
		
		/*
		 * System.out.println("Sort In descending order...!"); List<Integer> num
		 * =Arrays.asList(8,3,4,11,2,33,9);
		 * System.out.println(num.stream().sorted(Comparator.reverseOrder()).collect(
		 * Collectors.toList()));
		 */
		
		/*
		 * System.out.println("5. Find Duplicate in the list...!"); List<Integer> num =
		 * Arrays.asList(8,3,4,8,2,33,9); Set<Integer> duplicate = new HashSet<>();
		 * System.out.println(num.stream().filter(n ->
		 * !duplicate.add(n)).collect(Collectors.toList()));
		 */
		
		/*
		 * System.out.println("6. Find Max and Min from the list...!"); List<Integer>
		 * numbers6 =Arrays.asList(2,3,4,2,6,1,23,6,23);
		 * 
		 * Integer max = numbers6.stream().max((o1, o2) -> o1-o2).get(); Integer min =
		 * numbers6.stream().min((o1,o2) -> o1 - o2).get();
		 * System.out.println("MAX: "+max+" MIN: "+min);
		 */
		
		/*
		 * System.out.println("7. Sum Of all elements...!"); List<Integer> numbers6
		 * =Arrays.asList(2,3,4,2,6,1,23,6,23); Integer sum =
		 * numbers6.stream().mapToInt(Integer::intValue).sum(); System.out.println(sum);
		 */
//		System.out.println("8. Comma seperated and prefix [ and suffix ]...!");
//		List<String> lists = Arrays.asList("Hi", "Bhukya","Amaravani");
//		System.out.println(lists.stream().collect(Collectors.joining(", ", "[", "]")));
		
		/*
		 * System.out.println("9. SecondHighest...!"); List<Integer> numbers6
		 * =Arrays.asList(2,3,4,2,6,1,21,6,23);
		 * System.out.println(numbers6.stream().sorted(Comparator.reverseOrder()).skip(1
		 * ).findFirst().orElse(-1));
		 */
		/*
		 * System.out.
		 * println("10. Group Employee on the basis of Department and find the highest salary from the each department"
		 * );
		 * 
		 * List<Employee> employees = new ArrayList<>(); employees.add(new Employee(1,
		 * "Amaravani", "IT", 1500000)); employees.add(new Employee(5, "Sachin", "IT",
		 * 1100000)); employees.add(new Employee(8, "Vinod", "AWS", 3500000));
		 * employees.add(new Employee(7, "Bhavesh", "Cloud+", 7500000));
		 * employees.add(new Employee(2, "Prashant", "AWS", 1200000));
		 * 
		 * Map<String,List<Employee>> segregatedOnThebasiOfDept = employees.stream()
		 * .collect(Collectors.groupingBy(Employee::getDept));
		 * System.out.println(segregatedOnThebasiOfDept);
		 * 
		 * Map<String, Employee> result =
		 * employees.stream().collect(Collectors.groupingBy(Employee::getDept,
		 * Collectors.collectingAndThen(
		 * Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
		 * Optional::get))); System.out.println(result);
		 */
		/*
		 * System.out.println("11. Partition Even and Odd...!"); List<Integer> numbers6
		 * =Arrays.asList(2,3,4,2,6,1,21,6,23); Map<Boolean, List<Integer>> partEvenOdd
		 * = numbers6.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));
		 * System.out.println("EVEN: "+partEvenOdd.get(true));
		 * System.out.println("ODD: "+partEvenOdd.get(false));
		 * 
		 */
		System.out.println("12. Frequency Of Each Characters...!");
		String s1 = "banana";
		Map<Object, Long> frequency= s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(n ->n, Collectors.counting()));
		System.out.println(frequency);
	}

}
