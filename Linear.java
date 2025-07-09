import java.util.*;

public class Linear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int key=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		
		
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(key==arr[i]) {
				System.out.print("Element is found at index"+" "+i);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.print("Element is not found");
		}
		
		

	}

}
