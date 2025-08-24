package Lec5_Exercise;
import java.util.Scanner;
public class CalculateFactorial5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhap so thu ba: ");
        int c = scanner.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("So lon nhat la: " + max);
        scanner.close();
    }
}
