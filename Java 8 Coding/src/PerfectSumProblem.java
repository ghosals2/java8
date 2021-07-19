
public class PerfectSumProblem {
	static int count,sum,length;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count=0;
		int arr[]= {1,2,3,5,6,7};
		sum=8;
		length=arr.length;
		findSumSubsets(arr,0,0);
		System.out.println(count);
				

	}

	private static void findSumSubsets(int[] arr, int i, int currsum) {
		// TODO Auto-generated method stub
		if(currsum==sum) {
			count++;
			return;
		}
		if(currsum<sum && i<length) {
			findSumSubsets(arr,i+1,currsum+arr[i]);
			findSumSubsets(arr,i+1,currsum);
		}
		
	}

}
