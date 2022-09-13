package assignment1;
import java.util.*;
public class ques7 {
    public static void main(String args[]){
        int yr;
        String y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        yr=sc.nextInt();
        y=((yr%400==0 && yr%4==0)||yr%100!=0?"Leap Year":"NOT");
    }   
}
