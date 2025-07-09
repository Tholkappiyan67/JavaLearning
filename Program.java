import java.util.*;
public class Program {
    public static void main(String[] args) {
    int[] a={2,2,2,0,6,0,6,6,0,8,1};

    for(int i=0;i<a.length-1;i++){
    if(a[i]==a[a.length-1]) 
        break;

        if(a[i]==a[i+1]){
            a[i]=a[i]+a[i+1];
            a[i+1]=0;
        }
    }
    int ind=0;
    for(int i=0;i<a.length;i++){
        if(a[i]!=0){
            a[ind++]=a[i];
        }
    }
        while(ind<a.length){
            a[ind++]=0;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
    }

