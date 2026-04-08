package nqtien;

public class HinhTron extends HinhHoc implements CoTheDiChuyen, CoTheQuay{
	private double banKinh;

    public HinhTron(double x, double y, double banKinh) {
        super(x, y);
        this.banKinh = banKinh;
    }

    public void ve() {
        System.out.println("Vẽ hình tròn tại (" + x + "," + y + ") với bán kính " + banKinh);
    }

    @Override
    public void quay(double goc) {
        System.out.println("Hình tròn quay " + goc + " độ");
    }
    @Override
    public void diChuyen(double dx, double dy) {
        x += dx;
        y += dy;
        System.out.println("Hình tròn di chuyển đến (" + x + "," + y + ")");
    }
}