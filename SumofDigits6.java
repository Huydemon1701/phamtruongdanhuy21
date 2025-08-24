package Lec5_Exercise;
import java.util.Scanner;
public class SumofDigits6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem Toan: ");
        double toan = scanner.nextDouble();
        System.out.print("Nhap diem Ly: ");
        double ly = scanner.nextDouble();
        System.out.print("Nhap diem Hoa: ");
        double hoa = scanner.nextDouble();
        double dtb = (toan + ly + hoa) / 3;
        System.out.println("Diem trung binh = " + dtb);
        if (dtb >= 8.0) {
            System.out.println("Xep loai: Gioi");
        } else if (dtb >= 6.5) {
            System.out.println("Xep loai: Kha");
        } else if (dtb >= 5.0) {
            System.out.println("Xep loai: Trung binh");
        } else {
            System.out.println("Xep loai: Yeu");
        }
        scanner.close();
    }
}
