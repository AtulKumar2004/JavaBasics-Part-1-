//print numbers from 1 to range taking range as input from user
import java.util.*;
public class JavaBasics39 {
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter range to print numbers from 1 to range");
        int range=sc.nextInt();
        int counter=1;
        while (counter <= range){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
    }
}