package assignment2;
import java.util.*;
public class ques4 {
    public static void main(String args[]){
        int ser;
        double sal,bonus=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Service Year of Employee");
        ser=sc.nextInt();
        System.out.println("Enter the Salary of Employee");
        sal=sc.nextDouble();
        if(ser>5){
            bonus=sal+(sal*5)/100;
            System.out.println("The net Amount of the Employee is: "+bonus);
        }
        else{
            System.out.println("The net Amount of the Employee is: "+sal);
        }
    }
}