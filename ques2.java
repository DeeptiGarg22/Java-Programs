package assignment2;
import java.util.*;
public class ques2 {
    public static void main(String args[]){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st no.");
        num1=sc.nextInt();
        System.out.println("Enter the 2nd no.");
        num2=sc.nextInt();
        if(num1>num2){
            System.out.println("The Greatest no. is: "+num1);
        }
        else{
            System.out.println("The Greatest no. is: "+num2);
        }
    }
}

