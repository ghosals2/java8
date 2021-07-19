import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> alist=new ArrayList<>();
		alist.add(1);
		alist.add(3);
		alist.add(2);
		alist.add(5);
		alist.add(1);
		int sum=0;
		
		sum= alist.stream().reduce(0, (a, b) -> a + b);
		int sum1=alist.stream().mapToInt(i -> i*i).sum();
		List<Integer> filteredList=alist.stream().map(i->i*i).filter(i-> i>5).collect(Collectors.toList());
		List<Integer> sortedList=alist.stream().distinct().sorted().collect(Collectors.toList());
		int maxValue=alist.stream().max(Comparator.comparing(Integer::valueOf)).get();
		int minValue=alist.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		int occurance=Collections.frequency(alist, 1);
		System.out.println(sum);
		System.out.println(sum1);
		
		filteredList.stream().forEach(i-> System.out.println("new list - > " + i));
		sortedList.stream().forEach(i-> System.out.println(i));
		System.out.println("Max Value " +maxValue);
		System.out.println("Min Value " +minValue);
		System.out.println("No of occurance : " + occurance);
		
		
		
		

	}

	

}
