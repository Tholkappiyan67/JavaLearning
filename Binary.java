import java.util.*;
public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;arr[i++]=sc.nextInt());
        Arrays.sort(arr);
        int key=sc.nextInt();

        int start=0;
        int end=n-1;
         
        boolean found=false;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                System.out.print("Element is found at"+" "+mid);
                found=true;
                break;
            }
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
        }
        if(!found){
            System.out.print("Element is not Found");
        }

    }
}
