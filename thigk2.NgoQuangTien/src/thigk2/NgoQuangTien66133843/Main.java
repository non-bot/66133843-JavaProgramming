package thigk2.NgoQuangTien66133843;

import java.util.ArrayList;
import java.util.Scanner;
//Tao lop scanner roi dung lop do cho nguoi dung nhap thong tin vao
// roi lay can nang chia binh phuong chieu cao roi in ra chi so BMI va tinh trang co the
//Tao mang sinh vien roi them tung phan tu vao roi in ra man hinh
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu cao cua ban (m)");
		double chieuCao = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhap can nang cua ban (kg)");
		double canNang = sc.nextDouble();
		sc.nextLine();
		double bMI = canNang/(chieuCao*chieuCao);
		System.out.println("Chi so BMI cua ban: " + bMI);
		System.out.println("Thong tin tinh trang co the:");
		if(bMI < 18.5) System.out.println("Gay");
		else if(bMI < 24.9) System.out.println("Binh thuong");
		else if(bMI < 29.4) System.out.println("Thua can");
		else System.out.println("Beo phi");
		
		ArrayList<SinhVien> sV = new ArrayList<SinhVien>();
		sV.add(new SinhVien(66123456,"Nguyen Van A", 2006, "Nha Trang"));
		sV.add(new SinhVien(66123654, "Nguyen Van B", 2006, "Nha Trang"));
		sV.add(new SinhVien(66654321, "Nguyen Van C", 2006, "Nha Trang"));
		int n = 3;
		
		
	}
	public void themSV(ArrayList<SinhVien> sV, Scanner sc, int n) {
		int a, c;
		String b, d;
		boolean check;
		do{
			System.out.println("Nhap mssv");
			a = sc.nextInt();
			for (int i = 0; i < n; i++) {
				if (a == sV.get(i).getmSSV()) {
					check = false;
					break;
				}
				else {
					check = true;
				}
			}
			
		}while (check == false);
		
	}
}
