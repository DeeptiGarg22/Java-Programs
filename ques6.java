package assignment1;
import java.util.*;
public class ques6 {
    public static void main(String args[]){
        int a,b,c,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        y=a>b&&a>c?a:b>c?b:c;
        System.out.println("The Greatest Number is: "+y);
    }

}
