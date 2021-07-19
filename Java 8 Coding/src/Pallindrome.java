
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="malay";
		//char[] ch=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		int count =0;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				count ++;
				break;
				
			}
			i++;
			j--;
		}
		if(count==0) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

	}

}
