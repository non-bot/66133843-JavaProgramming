package truutuong_quanlythuvien;

public class TapChi extends TaiLieu implements CoTheMuon, CoTheGiaHan{
	private boolean borrowed;
	private int tgmuon;
	public TapChi() {
		this.borrowed = false;
	}
	public TapChi(boolean borrowed, int tgmuon, String maTL, String tenTL, String tacGia) {
		super(maTL, tenTL, tacGia);
		this.borrowed = borrowed;
		this.tgmuon = tgmuon;
	}
	@Override
	public void giaHan(int tgmuon) {
		// TODO Auto-generated method stub
		if (!borrowed)
			System.out.println("Gia han that bai, Tap Chi chua duoc muon");
		else {
			System.out.println("Gia han Tap Chi thanh cong");
			this.tgmuon = tgmuon;
		}
	}

	@Override
	public void muon(int t) {
		// TODO Auto-generated method stub
		if (borrowed)
			System.out.println("Tap Chi da bi muon");
		else {
			System.out.println("Muon Tap Chi thanh cong");
			borrowed = true;
			tgmuon = t;
		}
	}

	@Override
	public void tra() {
		// TODO Auto-generated method stub
		if (borrowed) {
			System.out.println("Tra Tap Chi thanh cong");
			borrowed = false;
			tgmuon = 0;
		}
		else
			System.out.println("Tap Chi chua duoc muon");
	}

	@Override
	public void kiemTraTrangThai() {
		// TODO Auto-generated method stub
		if (borrowed) {
			System.out.println("Tap Chi [maTL=" + maTL + ", tenTL=" + tenTL + ", tacGia=" + tacGia + "]"+" da duoc muon, thoi gian con: " + tgmuon + " ngay");			
		}
		else
			System.out.println("Tap Chi chua duoc muon");
	}

}
