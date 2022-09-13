package assignment2;
import java.util.*;
public class ques6 {
    public static void main(String args[]){
        int age1,age2,age3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of 3 people");
        age1=sc.nextInt();
        age2=sc.nextInt();
        age3=sc.nextInt();
        if(age1>age2&&age1>age3){
            System.out.println("The Oldest among them is: "+age1);
        }
        if(age2>age1&&age2>age3){
            System.out.println("The Oldest among them is: "+age2);
        }
        if(age3>age1&&age3>age2){
            System.out.println("The Oldest among them is: "+age3);
        }
        else{
            System.out.println("The have Equal Ages");
        }
    }
}