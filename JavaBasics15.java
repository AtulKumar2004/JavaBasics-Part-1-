//practice questions of lec2 q3
import java.util.*;
public class JavaBasics15 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost of pencil: ");
        float p1=sc.nextFloat();
        System.out.print("Enter the cost of pen: ");
        float p2=sc.nextFloat();
        System.out.print("Enter the cost of eraser: ");
        float p3=sc.nextFloat();
        float tcwogst=p1+p2+p3;
        float gst=0.18f*tcwogst;
        System.out.print("Total cost with gst added: ");
        System.out.print(tcwogst+gst);
    }
}


