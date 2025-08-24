package Lec5_Exercise;
import java.util.Scanner;
public class CalculateAverageUntil0isEntered9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int so;
        int tong = 0;
        int dem = 0;

        System.out.print("Nhap mot so (nhap 0 de dung): ");
        so = sc.nextInt();

        while (so != 0) {
            tong += so;
            dem++;

            System.out.print("Nhap mot so (nhap 0 de dung): ");
            so = sc.nextInt();
        }

        if (dem > 0) {
            double tb = (double) tong / dem;
            System.out.println("Trung binh cong la: " + tb);
        } else {
            System.out.println("Khong co so nao duoc nhap.");
        }

        sc.close();
    }
}
