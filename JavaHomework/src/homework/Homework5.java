package homework;

public class Homework5 {
    public static void main(String[] args)
    {
        int rows = 10;


        for (int a = 1; a <= rows; a++) {

            for (int b = rows; b >= a; b--) {
                System.out.print(" ");
            }

            for (int c = 1; c <= a; c++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

