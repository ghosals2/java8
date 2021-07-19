import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequenceMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,6,4,10,5,4};
		List<Integer> alist=Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> result=new ArrayList<>();
		result=findMissing(alist);
		System.out.println("Missing number is :");
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i));
		}
		Map<Integer, Integer> duplicateResult=new HashMap<>();
		duplicateResult=findDuplicates(alist);
		duplicateResult.forEach((k,v)->System.out.println("duplicate number :" +k+ "count: "+v));
		
		

	}
	public static List<Integer> findMissing(List<Integer> arr) {
		//int arr2[]= new int[arr.size()];
		List<Integer> result=new ArrayList<Integer>();
		boolean b;
		//int 
		int min=arr.stream().min(Comparator.comparing(Integer::valueOf)).get();
		int max=arr.stream().max(Comparator.comparing(Integer::valueOf)).get();
		//System.out.println("min" + min+ "max" +max);
		
		for(int i=min;i<=max;i++) {
			b=arr.contains(i);
			
			
				if(b==false) {
					//System.out.println("i-->" +i);
					result.add(i);
					
				}
			
			
			
		}
		
		
		return result;
	}
	
	public static Map<Integer,Integer> findDuplicates(List<Integer> arr){
		Map<Integer, Integer> result=new HashMap<>();
		Map<Integer, Integer> result2=new HashMap<>();
		int value=1;
		for(int i=0;i<arr.size();i++) {
			Integer count=result.get(arr.get(i));
			if(count == null) {
				count=0;
			}
			//System.out.println("count :" + count);
			result.put(arr.get(i), count+1);
			if(count>0) {
				result2.put(arr.get(i), count+1);
			}
			
		}
		
		return result2;
		
	}

}
