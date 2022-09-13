package assignment1;
import java.util.*;
public class ques10 {
    public static void main(String args[]){
        int fahr;
        double cel=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        fahr=sc.nextInt();
        cel=(5*(fahr-32))/9;
        System.out.println("The Temperature in Degree in Celsius is: "+cel);
    }
}