package Lec5_Exercise;
import java.util.Scanner;
public class InputValidation8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        do {
            System.out.print("Nhap mot so tu 1 den 10: ");
            so = sc.nextInt();
            if (so < 1 || so > 10) {
                System.out.println("So khong hop le, vui long nhap lai.");
            }
        } while (so < 1 || so > 10);

        System.out.println("Ban da nhap so: " + so);
        sc.close();
    }
}
