import java.util.*;

public class Vow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();

        String vow="aeiou";

        int vowels=0; 
        int cons=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z'){
                if(vow.indexOf(ch)!=-1){
                    vowels++;
                }
                else{
                    cons++;
                }
            }
        }

        System.out.println(vowels);
        System.out.println(cons);
        



    }
}
