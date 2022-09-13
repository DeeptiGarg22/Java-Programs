package assignment2;
import java.util.*;
public class ques1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth: ");
        double b=sc.nextDouble();
        if(l==b)
            System.out.println("Square");
        else
            System.out.println("Not a Square");
    }
}

