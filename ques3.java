package assignment2;
import java.util.*;
public class ques3 {
    public static void main(String args[]){
        int qty;
        double dis=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quantity");
        qty=sc.nextInt();
        if(qty>1000){
            dis=qty-((qty*10))/100;
            System.out.println("The Quantity is: "+dis);
        }
        else{
            System.out.println("The Quantiyt is: "+qty);
        }
    }
}
