//Type promotion in java
//type promotion 1
/*
public class JavaBasics12 {
    public static void main (String args[]){
        char a='a';
        char b='b';
        char c=(char)(b-a);
        short d=5;
        byte e=25;
        char f='c';
        byte bt=(byte)(d+e+f);
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b-a);
        System.out.println(c);
        System.out.println(bt);
    }
}
*/

//type promotion 2
public class JavaBasics12 {
    public static void main (String args[]){
        int a=10;
        float b=20.25f;
        long c=25;
        double d=30;
        int ans=(int)(a+b+c+d);//java converted all a,b,c,d to double types and a+b+c+d result is of double type and double cannot be converted to int implicitly therefore i am using explicit conversion.
        System.out.println(ans);
    }
}


