// l4 q1
import java.util.*;
public class JavaBasics33 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        if (number>0){
            System.out.println(number+" is positive");
        }
        else if(number<0){
            System.out.println(number+" is negative");
        }
        else{
            System.out.println(number+" is neither positive nor negative");
        }
    }
}