//To calculate area of circle taking radius from the user.
import java.util.*;
public class JavaBasics8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println(area);
    }
}