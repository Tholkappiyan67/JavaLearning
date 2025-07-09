// // 1) sum of Even and Odd Digits in the given Number
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        int even=0;
//        int odd=0;

//        while (num>0) {
//         int last=num%10;

//         if(last%2==0){
//             even+=last;
//         }
//         else{
//             odd+=last;
//         }
//         num/=10;
//        }
//        System.out.println(even);
//        System.out.println(odd);
        

//     }
// }

// // 2)
// public class Main {

//     public static void main(String[] args) {
//         String s="Hi";
//         for(int i=0;i<5;i++){
//             System.out.println(s);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=20;i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         for(int i=10;i>=1;i--){
//             System.out.println(i);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
        
//         for(int i=0;i<=10;i++){
//             int sqr=i*i;
//             System.out.println(sqr);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         int sum=0;
//         for(int i=1;i<=10;i++){
//              sum+=i;
//         }
//          System.out.println("The sum first 10 Natural num: "+sum);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         int cnt=0;
//         for(int i=1;i<50;i++){
//             if(i%5==0){
//             System.out.println(i);
//             cnt++;
//          }
             
//             System.out.println(cnt);
//         }
//     }
// }

// Factorial
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int fact=1;

//         for(int i=1;i<=num;i++){
//             fact*=i;
            
//         }
//         System.out.println("The Factorial of"+" "+num +" "+"is"+ fact);
//     }
// }

// 1 to 50 div by 5
//  class Main{
//     public static void main(String[] args) {
//         for(int i=1;i<=50;i++){
//             if(i%5==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             if(i%3==0 && i%7==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          int num=sc.nextInt();
//         int rev=0;
//          for(int i=0;i<=num;i++){
//             int digit=num%10;
//              rev=rev*10+digit;
//             num/=10;
//          }
//          System.out.println(rev);
//     }
// }

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int count=0;

//         while (num!=0) {
            
        
//             num/=10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int digit=0;
//         int sum=0;
//        while(n!=0){
//             digit=n%10;
//             sum+=digit;
//             n/=10;
//         }
//         System.out.print(sum);
        
//     }
// }

//Prime Number

// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         boolean isPrime=true;

//         if(n<=1){
//             System.out.println(n+  "is Not a PrimeNumber");
//         }else{
//             for(int i=2;i*i<=n;i++){
//                 if(n%i==0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//         }
//         if(isPrime){
//             System.out.println(n+  "is a PrimeNumber");
//         }else{
//             System.out.println(n+  "is Not a PrimeNumber");
//         }
//     }
// }

//Odd numbers

// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++){
//             if(i%2!=0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


//Numbers with their Sqr
// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++){
//             System.out.println(i+" "+i*i);
//         }
//     }
// }


//print each char
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();

//         char[] chr=str.toCharArray();
//         for(char ch: chr){
//             System.out.println(ch);

//         }
//     }
// }

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();

//         int[] arr=new int[a];

//         for(int i=0;i<a;i++){
//             arr[i]=sc.nextInt();
           
//         }
//         for(int i=0;i<a;i++){
//          System.out.print(arr[i]+" ");
//         }

//     }
// }

// class Main{
//     public static void main(String[] args) {
//         for(int i=1;i<=50;i++){
//             if((i%3==0 || i%5==0) && !(i%3==0 && i%5==0)){
//                 System.out.println(i+" ");
//             }
//         }
//     }
// }


// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int digit=0;
//         int even=0;

//        while (num > 0) {
//              digit = num % 10;
//             if (digit % 2 == 0) {
//                 even += digit;
//             }
//             num /= 10;
//         }

//         System.out.println("Sum of even digits: " + even);
//     }
// }

// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         int gcd=1;

//         for(int i=1;i<a && i<b;i++){
//             if(a%i==0 && b%i==0){
//                 gcd=i;
//             }
//         }
//         System.out.println("GCD of"+a+"and"+b+"is"+gcd);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

        
//     }
// }

//Fibonacci
// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int ft=0;
//         int st=1;
//         int nt=0;
//         int n=sc.nextInt();
//         for(int i=2;i<=n;i++){
            
//             nt=ft+st;
//             ft=st;
//             st=nt;
//         }
//         System.out.println(nt);
//     }
// }

// import java.util.*;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int N=sc.nextInt();

//         long prod=1;
//         for(int i=1;i<=N;i++){
//             prod*=i;
//         }
//         System.out.println(prod);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         int num = s.nextInt();
//         System.out.println("Multiplication  of " + num + ":");
//         for(int i=1;i<=10;i++){

//             System.out.println(i*num);
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         for(int i=1;i<=50;i++){
//             if(i%2!=0 && i%3!=0 ){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         int  sqr=0;
//         for(int i=1;i<=100;i++){
//             sqr=i*i;
//             System.out.println("The square of " + i + " is: " + sqr);
//         }
//     }
// }

//Humming Number

// public class Main{
//     public static void main(String[] args) {
//         int num=31;
//         while(num>0){
//             while(num%2==0) num/=2;
//             while(num%3==0) num/=3;
//             while(num%5==0) num/=5;
//             if(num==1){
//                 System.out.println("Humming Number");
//                 return;
//             } else {
//                 System.out.println("Not a Humming Number");
//                 return;
//             }
//         }
//     }
// }
import java.util.*;

//Average of N Numbers
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         double avg=0;
//         for(int i=1;i<n;i++){
//             arr[i]=sc.nextInt();
//             avg+=arr[i];
//         }
//         System.out.println("The Average of N Numbers is: " + (avg/n));
//     }
// }

//Check if arr is sorted or not
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n-1;i++){
//             if(arr[i]>arr[i+1]){
//                 System.out.println("Array is not  sorted");
//                 return;
//             }   
//         }
//         System.out.println("Array is  sorted");
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        int ascii=(int)ch;


//         System.out.println("The ASCII value of " + ch + " is: " + ascii);
//     }
// }

//pyramid pattern

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int rows=sc.nextInt();

//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=rows-1;j++){
//                 System.out.println(" ");
//             }
//             for(int k=1;k<=2 * i - 1;k++){
//             System.out.print("*");
//         }
//         }
    
        
//         System.out.println();
//     }
// }

//pangram


// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine().toLowerCase();

//         int count = 0;

//         for (char ch = 'a'; ch <= 'z'; ch++) {
//             if (str.indexOf(ch) != -1) {
//                 count++;
//             }
//         }

//         if (count == 26) {
//             System.out.println("It is a Pangram.");
//         } else {
//             System.out.println("It is NOT a Pangram.");
//         }
//     }
// }

// public class Main {
  
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();

//        for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//           System.out.print(j+" ");
//         }
//         System.out.println();
//        }
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
        
//         while (num >= 10) {
//             int sum = 0;
//             while (num > 0) {
//                 sum += num % 10;
//                  num /= 10;
//             }
//             num = sum;
//         }

//         System.out.println("Single digit: " + num);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4};
//         int n = arr.length;
//         int[] result = new int[n];

//         for (int i = 0; i < n; i++) {
//             int prod = 1;
//             for (int j = 0; j < n; j++) {
//                 if (i != j) {
//                     prod *= arr[j]; 
//                 }
//             }
//             result[i] = prod;
//         }

//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }

//Missing number

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 4, 5, 6}; 
//         int n = 6;  

//         int total = n * (n + 1) / 2;
//         int sum = 0;
//         for (int num : arr) {
//             sum += num;
//         }

//         int missing = total - sum;
//         System.out.println("Missing number is: " + missing);
//     }
// }

//no of pairs
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         int cnt=0;

//         int[] arr=new int[n];
//         for(int i=0;i<n;arr[i++]=sc.nextInt());

//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==k){
//                     cnt++;
//                 }
//             }
//         }
//         System.out.println(cnt);
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();

//         int[] arr=new int[size];

//         for(int i=0;i<size;arr[i++]=sc.nextInt());

//         int max=0;
//         for(int i=0;i<size;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.print(max);
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         int[] arr=new int[n];

        
//         for(int i=0;i<n;arr[i++]=sc.nextInt());

//         int st=0;
//         int end=n-1;
// while(st<end){
//         int temp=arr[st];
//         arr[st]=arr[end];
//         arr[end]=temp;

//         st++;
//         end--;
// }

//         for(int num:arr){
//             System.out.print(num+" ");
//         }
//     }
// }


// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int[] arr=new int[n];

//         for(int i=0;i<n;arr[i++]=sc.nextInt());

//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                 System.out.print(arr[i]+" ");
//                }
//             }
//         }
//     }
// }

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         int[] freq = new int[n];
//         int visited = -1;

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < n; i++) {
//             if (freq[i] == visited)
//                 continue;

//             int count = 1;  

//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                     freq[j] = visited; 
//                 }
//             }

//             freq[i] = count;
//         }

//         for (int i = 0; i < n; i++) {
//             if (freq[i] != visited) {
//                 System.out.println(arr[i] + " -> " + freq[i]);
//             }
//         }
//     }
// }
    
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         int[] arr=new int[n];

//         int max1=0,max2=0;

//         for(int i=0;i<n;arr[i++]=sc.nextInt());

//         if(arr[0]>arr[1]){
//             max1=arr[0];
//             max2=arr[1];
//         }else{
//             max1=arr[1];
//             max2=arr[0];
//         }

//         for(int i=2;i<n;i++){
//             if(arr[i]>max1){
//                 max2=max1;
//                 max1=arr[i];
//             }
//             else if(arr[i]>max2){
//                 max1=max2;
//                 max2=arr[i];

//             }
//         }
//         System.out.print(max2);
//     }
// }


