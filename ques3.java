package assignment1;
import java.util.*;
public class ques3 {
    public static void main(String args[]){
        int l,b,area=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
        l=sc.nextInt();
        b=sc.nextInt();
        area=l*b;
        System.out.println("The Area of rectangle is:"+area);
    }
}


