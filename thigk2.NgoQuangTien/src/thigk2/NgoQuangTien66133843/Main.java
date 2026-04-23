package thigk2.NgoQuangTien66133843;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;
//Tao lop scanner roi dung lop do cho nguoi dung nhap thong tin vao
// roi lay can nang chia binh phuong chieu cao roi in ra chi so BMI va tinh trang co the
//Tao mang sinh vien roi them tung phan tu vao roi in ra man hinh
//Tao bien them sv kiem tra mssv nhap vao co trung voi mssv da co hay khong va kiem tra nam sinh la so
public class Main {
	public static void main(String[] args) {
//		thong tin bmi
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu cao cua ban (m)");
		double chieuCao = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhap can nang cua ban (kg)");
		double canNang = sc.nextDouble();
		sc.nextLine();
		double bMI = canNang/(chieuCao*chieuCao);
		System.out.printf("Chi so BMI cua ban: %.2f\n", bMI);
		System.out.println("Thong tin tinh trang co the:");
		if(bMI < 18.5) System.out.println("Gay");
		else if(bMI < 24.9) System.out.println("Binh thuong");
		else if(bMI < 29.4) System.out.println("Thua can");
		else System.out.println("Beo phi");
//		hard code danh sach sinh vien
		ArrayList<SinhVien> sV = new ArrayList<SinhVien>();
		sV.add(new SinhVien(66123456,"Nguyen Van A", 2006, "Nha Trang"));
		sV.add(new SinhVien(66123654, "Nguyen Van B", 2006, "Nha Trang"));
		sV.add(new SinhVien(66654321, "Nguyen Van C", 2006, "Nha Trang"));
		int n = 3;
//		in ra man hinh
		for (int i = 0; i < n; i++) {
			System.out.println(sV.get(i).toString());
		}
//		them moi 1 sinh vien
		SinhVien themSV;
		int mSSV, namSinh = 2006;
		String tenSV, noiSong;
		boolean check;
		do{
			System.out.println("Nhap mssv");
			mSSV = sc.nextInt();
			sc.nextLine();
			check = true;
			for (int i = 0; i < n; i++) {
				if (mSSV == sV.get(i).getmSSV()) {
					check = false;
					break;
				}				
			}
			if (!check) {
		        System.out.println("MSSV da ton tai, nhap lai!");
		    }
		}while (check == false);
		System.out.println("Nhap ten sinh vien");
		tenSV = sc.nextLine();
		do {
			System.out.println("Nhap nam sinh");
			String c = sc.nextLine();
			try {
		        namSinh = Integer.parseInt(c);
		        check = true;
		    } catch (NumberFormatException e) {
		        check = false;
		        System.out.println("Nhap mot so");
		    }
		}while (!check);
		System.out.println("Nhap noi song");
		noiSong = sc.nextLine();
		themSV = new SinhVien(mSSV, tenSV, namSinh, noiSong);
		sV.add(themSV);
		n++;
//		in ra man hinh danh sach moi
		for (int i = 0; i < n; i++) {
			System.out.println(sV.get(i).toString());
		}
//		in ra man hinh cac sinh vien lon hon 20 tuoi
		ArrayList<SinhVien> sVB = new ArrayList<SinhVien>();
		int currentYear = Year.now().getValue();
		for (int i = 0; i < n; i++) {
			int a = currentYear - sV.get(i).getNamSinh();
			if (a > 20)
				sVB.add(sV.get(i));
		}
		check = false;
		for (SinhVien e : sVB) {
			System.out.println(e.toString());
			check = true;
		}
		if (!check) {
			System.out.println("Khong co sinh vien nao tren 20 tuoi");
		}
//		doc file van ban
		ArrayList<Integer> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("Untitled.txt"));
		
	}
	
}
