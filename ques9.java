package assignment1;
import java.util.*;
public class ques9 {
        public static void main(String args[]){
            int a,b;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the 2 no.");
            a=sc.nextInt();
            b=sc.nextInt();
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("The 2 no.s after Swapping is 1"+a +" "+b);
        }
    }