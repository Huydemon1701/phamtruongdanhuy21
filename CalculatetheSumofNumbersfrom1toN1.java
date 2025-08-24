package Lec5_Exercise;
import java.util.Scanner;
public class CalculatetheSumofNumbersfrom1toN1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong N: ");
        int N = nhap.nextInt();
        int tong = 0;
        for (int i = 1; i <= N; i++) {
            tong += i;
        }
        System.out.println("Tong cac so tu 1 den " + N + " la: " + tong);
    }    
}
