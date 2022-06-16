
import java.util.*;

public class Pra {
    public static void main(String[] args) {
        //Write code here
        int a = 4;
        int b = 8;
        int c = 10;
        int sum = a + b+c;
        System.out.println(sum);
//
        float subject1 = 35;
        float subject2 = 70;
        float subject3 = 140;
        float cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println(cgpa);
//
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");
//
//        System.out.println("ENter your number");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());

    }
}