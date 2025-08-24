package Lec5_Exercise;
import java.util.Scanner;
public class DrawRectanglewithAsterisks3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen duong N: ");
        int n = scanner.nextInt();
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println("Giai thua cua " + n + " la: " + giaiThua);

        scanner.close();
    }
}
