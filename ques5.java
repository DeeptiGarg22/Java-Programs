package assignment2;
import java.util.*;
public class ques5 {
    public static void main(String args[]){
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of Student");
        marks=sc.nextInt();
        if(marks>80){
            System.out.println("The Grade is: A");
        }
        if(marks>60&&marks<80){
            System.out.println("The Grade is: B");
        }
        if(marks>50&&marks<60){
            System.out.println("The Grade is: C");
        }
        if(marks>45&&marks<50){
            System.out.println("The Grade is: D");
        }
        if(marks>25&&marks<45){
            System.out.println("The Grade is: E");
        }
        if(marks<25){
            System.out.println("The Grade is: F");
        }
    }
}
