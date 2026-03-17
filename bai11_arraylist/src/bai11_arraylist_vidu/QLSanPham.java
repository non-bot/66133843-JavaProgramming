package bai11_arraylist_vidu;
import java.util.ArrayList;
import java.util.Scanner;

public class QLSanPham {
	public static void themSP(SanPham a, Scanner sc) {
		int c;
		System.out.print("Nhap ma SP: ");
		a.setMaSP(sc.nextLine());
		System.out.print("Nhap ten SP: ");
		a.setTenSP(sc.nextLine());
		System.out.print("Nhap gia SP: ");		
		a.setGia(sc.nextDouble());
		System.out.print("Nhap so luong SP: ");
		a.setSoLuong(sc.nextInt());
		sc.nextLine();
	}
	public static void inMang(ArrayList<SanPham> a) {
		for (SanPham c : a) {
			System.out.print(c.hienThiThongTin());
		}
	}
	public static void xoaSP(ArrayList<SanPham> a, String ma) {
		int i = 0;
		for (SanPham c : a) {
			if(c.getMaSP().equals(ma)) {
				a.remove(i);
				System.out.println("Xoa xong SP " + ma);
				return;	
			}
			i++;
		}
		System.out.println("Khong tim thay maSP muon xoa");
	}
	
	public static void timSP(ArrayList<SanPham> a, Scanner sc) {
		boolean f = false;
		System.out.print("Nhap ten SP muon tim:");
		String s = new String(sc.nextLine().toLowerCase());
		for (SanPham c : a) {
			if(c.getTenSP().toLowerCase().contains(s)) 
			{
				System.out.println(c.hienThiThongTin());
				f = true;
				break;
			}
		}
		if (f == false) {
			System.out.println("Khong tim thay SP");
		}
	}
	
	public static void sapXepTang(ArrayList<SanPham> a) {
	    for (int i = 0; i < a.size() - 1; i++) {
	        for (int j = i + 1; j < a.size(); j++) {
	            if (a.get(i).getGia() > a.get(j).getGia()) {
	                // swap
	                SanPham temp = a.get(i);
	                a.set(i, a.get(j));
	                a.set(j, temp);
	            }
	        }
	    }
	}
	public static void sapXepGiam(ArrayList<SanPham> a) {
	    for (int i = 0; i < a.size() - 1; i++) {
	        for (int j = i + 1; j < a.size(); j++) {
	            if (a.get(i).getGia() < a.get(j).getGia()) {
	                // swap
	                SanPham temp = a.get(i);
	                a.set(i, a.get(j));
	                a.set(j, temp);
	            }
	        }
	    }
	}
//	Collection.sort
//	java.util.Collections.sort(a, new java.util.Comparator<SanPham>() {
//	    public int compare(SanPham o1, SanPham o2) {
//	        return o1.getGia() - o2.getGia();
//	    }
//	});
	
//	lambda 
//	gia x > gia y sort doi gia x ra sau
//	gia x < gia y sort doi gia y ra sau
//	a.sort((x, y) -> x.getGia() - y.getGia());
	
	public static double tongGTHH(ArrayList<SanPham> a) {
		double tong = 0;
		int i;
		for (i = 0; i < a.size()-1; i+=2) {
			tong += a.get(i).tinhThanhTien() + a.get(i+1).tinhThanhTien();
		}
		if (i+2 < a.size()) {
			tong += a.get(i+2).tinhThanhTien();
		}
		return tong;
	}
	public static void main(String args[]) {
		int n;
		ArrayList<SanPham> a = new ArrayList<SanPham>();
		
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so SP: ");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			SanPham c = new SanPham();
			System.out.println("SP " + (i+1));
			themSP(c, sc);
			a.add(c);
		}
		inMang(a);
		System.out.print("Nhap ma SP muon xoa: ");
		s = sc.nextLine();
		xoaSP(a, s);
		timSP(a, sc);
		System.out.println("Tong gia tri hang hoa: " + tongGTHH(a));
	}
}
