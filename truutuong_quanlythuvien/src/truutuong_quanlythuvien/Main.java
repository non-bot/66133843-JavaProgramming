	package truutuong_quanlythuvien;
	
	import java.util.*;
	
	public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n;
			do {
			System.out.println("Nhap\n"
					+ "1: Muon sach || 2: Muon bao || 3: Muon tap chi");
			n = sc.nextInt();
			sc.nextLine();
			if (!(n >= 1 && n <= 3)) {
				System.out.print("Loi! Vui Long nhap lai.");
			}
			}while (n < 1 || n > 3);
			TaiLieu taiLieu;
			
			switch (n) {
			case 1:
				taiLieu = new Sach();
				break;
			case 2:
				taiLieu = new Bao();
				break;
			case 3:
				taiLieu = new TapChi();
				break;
			default:
				System.out.println("Error!");
				return;
			}
			String inp;
			System.out.println("Nhap ma tai lieu");
			inp = sc.nextLine();
			taiLieu.setMaTL(inp);
			System.out.println("Nhap ten tai lieu");
			inp = sc.nextLine();
			taiLieu.setTenTL(inp);
			System.out.println("Nhap ten tac gia");
			inp = sc.nextLine();
			taiLieu.setTacGia(inp);
			System.out.println("Nhap ngay muon");
			inp = sc.nextLine();
			((CoTheMuon) taiLieu).muon(Integer.parseInt(inp));
			((CoTheMuon) taiLieu).kiemTraTrangThai();
			System.out.println("Nhap so ngay muon gia han");
			n = sc.nextInt();
			sc.nextLine();
			((CoTheGiaHan) taiLieu).giaHan(n);
			((CoTheMuon) taiLieu).kiemTraTrangThai();
			
		}
	}
