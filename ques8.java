package assignment2;
import java.util.*;
public class ques8 {
        public static void main(String args[]){
            int ch,ca;
            float atd;
            Scanner sc=new Scanner (System.in);
            System.out.println("The Classes held");
            ch=sc.nextInt();
            System.out.println("The Classes Attended");
            ca=sc.nextInt();
            atd=(ca/ch)*100;
            if(atd>75.0){
                System.out.println("Allowed for Exam");
            }
            else{
                System.out.println("Not Allowed");
            }
        }
    }   

