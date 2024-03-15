//Practice questions of lecture 2 q1
import java.util.*;
public class JavaBasics13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three numbers");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int sum=A+B+C;
        float avg=sum/3.0f;
        System.out.println(avg);

    }
}