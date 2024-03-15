//input in java
import java.util.*;
public class JavaBasics6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine(); 
        /*
        once one input is taken,next input should not be of nextLine
        if you want nextLine input along with other inputs then nextLine should be the first
        input.
        */
        System.out.println(name);

        String input=sc.next();
        /*
        next will take only one word as input
        if you give two words it will generate error
        */
        System.out.println(input);

        
        int number=sc.nextInt();
        System.out.println(number);

        
        float price=sc.nextFloat();
        System.out.println(price);

        boolean val=sc.nextBoolean();
        System.out.println(val);

        short num=sc.nextShort();
        System.out.println(num);

        long alongnum=sc.nextLong();
        System.out.println(alongnum);

    }

}
