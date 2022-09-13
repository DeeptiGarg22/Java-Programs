package assignment1;
import java.util.*;
public class ques4 {
    public static void main(String args[]){
        double r,area=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        r=sc.nextDouble();
        area=3.14*(r*r);
        System.out.println("The Area of Circle is:"+area);
    }
}

