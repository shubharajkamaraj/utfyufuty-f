import java.util.Scanner;

public class Pascal {
    public static void main(String args[]) {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter number of rows ");
        int rows = scin.nextInt();
        Triangle(rows);
    }
	public static void Triangle(int rows) {
        for (int i = 0; i < rows; i++) {
    
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
	    Row(1, i + 1);

            System.out.println();
        }
    }
	public static void Row(int current, int max) {
        if (current > max) {
            return;
        }
	System.out.print("* ");

        Row(current + 1, max);
    }
}


