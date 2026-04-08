package NQTien.mssv66133843;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		HocSinh hs1 = new HocSinh();
		hs1.setTenHS("Tran Van S");
		short tuoiHS = 14;
		hs1.setTuoiHS(tuoiHS);
		hs1.setLopHS("8/2");
		HocSinh hs2 = new HocSinh("Nguyen Van D", (short)12, "6/3" );
		System.out.println(hs1.toString());
		System.out.println(hs2.getTenHS()+", tuoi: "+hs2.getTuoiHS()+", lop: "+hs2.getLopHS());
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten hs 3: ");
		String tenHS3 = sc.nextLine();
		System.out.print("Nhap tuoi hs 3: ");
		Short tuoiHS3 = sc.nextShort();
		sc.nextLine();
		System.out.print("Nhap lop hs 3: ");
		String lopHS3 = sc.nextLine();
		HocSinh hs3 = new HocSinh(tenHS3, tuoiHS3, lopHS3);
		System.out.println(hs3.toString());
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		System.out.print("Nhap so luong hoc sinh: ");
		int n = sc.nextInt();
		sc.nextLine();
		dsHocSinh.add(hs1);
		dsHocSinh.add(hs2);
		dsHocSinh.add(hs3);
		n = dsHocSinh.size();
		for (int i=0; i < n; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		//them hoc sinh
		System.out.println("Danh Bao sau khi them");
		
		dsHocSinh.add(new HocSinh("Tran Trong Z", (short)10, "4/1"));
		n++;
		for (int i=0; i < n; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
//		tim hoc sinh roi xoa
		for (int i=0; i < n; i++) {
			HocSinh xoaHS = dsHocSinh.get(i);
			if (xoaHS.getTenHS() == "Tran Trong Z") {
				dsHocSinh.remove(xoaHS);
				n--;
				break;
			}
		}
		System.out.println("Danh Bao sau khi xoa");

		for (int i=0; i < n; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
	}
}
