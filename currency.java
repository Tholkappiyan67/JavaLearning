import java.util.*;
public class currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amt=sc.nextInt();
        
        int[] arr={500,200,100,50,20,10,1};

        for(int i=0;i<arr.length;i++){
        int val=amt/arr[i];
        if(val>0){
            System.out.println(arr[i]+":"+val);

            amt=amt%arr[i];
        }
        }
        sc.close();
        
    }
}
