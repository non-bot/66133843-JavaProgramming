package nhapxuat;

import java.util.Scanner;

public class BaiTap1TinhTong2So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Nhap so thu 2: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.printf("Tổng của %.2f và %.2f là: %.2f", num1, num2, sum);

        sc.close();
    }
}
