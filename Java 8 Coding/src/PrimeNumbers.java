
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		int count=0;
		//int num=1;
		//int i=1;
		for(int num=2;num<=n;num++) {
			for (int i=2;i<=Math.sqrt(num)+1;i++) {
				if(num%i==0) {
					count=0;
					break;
				} else {
					count=1;
				}
				
			}
			if(count==1) {
				System.out.println(num);
			}
		}

	}

}
