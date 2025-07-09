
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;arr[i++]=sc.nextInt());
		
		int evenCount=0;
		int oddCount=0;
		
		for(int nums:arr) {
			if(nums%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		int[] odd=new int[oddCount];
		int[] even=new int[evenCount];
		
		int o = 0, e = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                even[e++] = num;
            else
                odd[o++] = num;
        }
        
        for(int i=0;i<odd.length-1;i++) {
        	for(int j=i+1;j<odd.length;j++) {
        		if(odd[i]>odd[j]) {
        			int temp=odd[i];
        			odd[i]=odd[j];
        			odd[j]=temp;
        		}
        	}
        }
        for(int i=0;i<even.length-1;i++) {
        	for(int j=i+1;j<even.length;j++) {
        		if(even[i]<even[j]) {
        			int temp=even[i];
        			even[i]=even[j];
        			even[j]=temp;
        		}
        	}
        }
        for(int i=0;i<odd.length;i++) {
        	System.out.print(odd[i]);
        }
        for(int i=0;i<even.length;i++) {
        	System.out.print(even[i]);
        }

	}

}
