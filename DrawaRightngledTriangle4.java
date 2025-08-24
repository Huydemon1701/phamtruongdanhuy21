package Lec5_Exercise;
import java.util.Scanner;
public class DrawaRightngledTriangle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so N: ");
        int n = scanner.nextInt();
        System.out.println("Bang cuu chuong cua " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}
