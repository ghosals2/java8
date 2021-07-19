import java.util.Arrays;

public class SumOfPairs {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,5,6};
		int sum=8;
		findPairs(arr,sum);
		
	}

	private static void findPairs(int[] arr, int sum) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			if(arr[low]+arr[high]==sum) {
				System.out.println("Pair found : {"+ arr[low]+","+arr[high]+"}");
			}
			if(arr[low]+arr[high]<sum) {
				low++;
			}else {
				high--;
			}/* else {
				System.out.println("Pair not found");
				
			}*/
			
		}
		
		
	}
	
	

}
