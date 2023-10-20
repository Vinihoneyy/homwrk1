package homework;
import java.util.Scanner;
public class Homework10 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = input.nextInt();

        System.out.println("Enter Second Number");
        int second = input.nextInt();

        System.out.println("The product of the two numbers are...");
        int total = first * second;
        System.out.println(total);

    }
}
