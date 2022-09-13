package assignment1;
import java.util.*;
public class ques8 {
    public static void main(String args[]){
        String name,sec,course;
        long roll;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of Student");
        name=sc.nextLine();
        System.out.println("Enter teh section of Student");
        sec=sc.nextLine();
        System.out.println("Enter the course of Student");
        course=sc.nextLine();
        System.out.println("Enter the roll no. of Student");
        roll=sc.nextLong();
        System.out.println("The Student Data is:");
        System.out.println(name);
        System.out.println(sec);
        System.out.println(course);
        System.out.println(roll);
    }
}