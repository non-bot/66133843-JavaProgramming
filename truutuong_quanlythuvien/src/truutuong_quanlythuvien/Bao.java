package truutuong_quanlythuvien;

public class Bao extends TaiLieu implements CoTheMuon, CoTheGiaHan{
	private boolean borrowed;
	private int tgmuon;
	public Bao() {
		this.borrowed = false;
	}
	@Override
	public void giaHan(int tgmuon) {
		// TODO Auto-generated method stub
		if (!borrowed)
			System.out.println("Gia han that bai, Bao chua duoc muon");
		else {
			System.out.println("Gia han Bao thanh cong");
			this.tgmuon = tgmuon;
		}
	}
	public Bao(boolean borrowed, int tgmuon, String maTL, String tenTL, String tacGia) {
		super(maTL, tenTL, tacGia);
		this.borrowed = borrowed;
		this.tgmuon = tgmuon;
	}
	@Override
	public void muon(int t) {
		// TODO Auto-generated method stub
		if (borrowed)
			System.out.println("Bao da bi muon");
		else {
			System.out.println("Muon Bao thanh cong");
			borrowed = true;
			tgmuon = t;
		}
	}

	@Override
	public void tra() {
		// TODO Auto-generated method stub
		if (borrowed) {
			System.out.println("Tra Bao thanh cong");
			borrowed = false;
			tgmuon = 0;
		}
		else
			System.out.println("Bao chua duoc muon");
	}

	@Override
	public void kiemTraTrangThai() {
		// TODO Auto-generated method stub
		if (borrowed) {
			System.out.println("Bao [maTL=" + maTL + ", tenTL=" + tenTL + ", tacGia=" + tacGia + "]" + " da duoc muon, thoi gian con: " + tgmuon + " ngay");			
		}
		else
			System.out.println("Bao chua duoc muon");
	}


}
