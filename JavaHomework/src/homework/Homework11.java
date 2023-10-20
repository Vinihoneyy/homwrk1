package homework;
import java.util.Scanner;
public class Homework11 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = input.nextInt();
        System.out.println("Enter How Many Times would you like to multiple by? for example."+ first +" x 10");
        int b = input.nextInt();
        for (int a = 1; a <= b; a++) {
            System.out.println(first + " * " + a + " = "
                    + first * a);
        }
    }
}