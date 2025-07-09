// public class Main1 {
//     public static void main(String[] args) {
//         String n="RADAR";
//         String  r="";
//         char ch;
        
//         for (int i=0;i<n.length();i++){
//             ch=n.charAt(i);

//             r=ch+r; 
//         }
//         System.out.println(r);
//         if(r.equals(n)){
//                 System.out.print("Palindrome");
//         }else{
//                 System.out.println("Not a palindrome");
//             }
//     }
// }
// public class Main1{
//     public static void main(String[] args) {
//         String s="Java";
//         int vow=0, con=0;

//         s=s.toLowerCase();

//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);

//             if(ch>='a' && ch<='z'){
//                 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//                     vow++;
//                 }else{
//                     con++;
//                 }
               
//             }
//         }

//         System.out.println("Vowels :"+vow);
//         System.out.println("Consonants :"+con); 
//     }
// }




// // Swapping in Array
// import java.util.*;
// public class Main1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] num=new 
//     }
// }

//star pattern

// import java.util.Scanner;

// public class Main1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//             // Print each column in row
//             for (int j = 1; j <= i; j++) {
//                 if (j == 1 || j == i || i == n) {//
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println(); // Move to next line
//         }
//     }
// }
