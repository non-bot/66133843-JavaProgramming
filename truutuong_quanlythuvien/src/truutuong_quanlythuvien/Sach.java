package truutuong_quanlythuvien;



public class Sach extends TaiLieu implements CoTheMuon, CoTheGiaHan{
	private boolean borrowed;
	private int tgmuon;
	public Sach() {
		this.borrowed = false;
	}
	@Override
	public void giaHan(int tgmuon){
		
		// TODO Auto-generated method stub
		if (!borrowed)
			System.out.println("Gia han that bai, Sach chua duoc muon");
		else {
			System.out.println("Gia han sach thanh cong");
			this.tgmuon = tgmuon;
		}
	}

	public Sach(boolean borrowed, int tgmuon, String maTL, String tenTL, String tacGia) {
		super(maTL, tenTL, tacGia);
		this.borrowed = borrowed;
		this.tgmuon = tgmuon;
	}
	@Override
	public void muon(int t) {
		// TODO Auto-generated method stub
		if (borrowed)
			System.out.println("Sach da bi muon");
		else {
			System.out.println("Muon sach thanh cong");
			borrowed = true;
			tgmuon = t;
		}
	}

	@Override
	public void tra() {
		// TODO Auto-generated method stub
		if (borrowed) {
			System.out.println("Tra sach thanh cong");
			borrowed = false;
			tgmuon = 0;
		}
		else
			System.out.println("Sach chua duoc muon");
	}

	@Override
	public void kiemTraTrangThai() {
		// TODO Auto-generated method stub
		if (borrowed) {
			System.out.println("Sach [maTL=" + maTL + ", tenTL=" + tenTL + ", tacGia=" + tacGia + "]" + " da duoc muon, thoi gian con: " + tgmuon + " ngay");			
		}
		else
			System.out.println("Sach chua duoc muon");
	}
	

}
