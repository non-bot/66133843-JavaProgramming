package nqtien;

public class TamGiac extends HinhHoc implements CoTheQuay, CoTheDiChuyen{
	private double canh;

    public TamGiac(double x, double y, double canh) {
        super(x, y);
        this.canh = canh;
    }

  
    public void ve() {
        System.out.println("Vẽ hình tam giác tại (" + x + "," + y + ") với cạnh " + canh);
    }

    @Override
    public void quay(double goc) {
        System.out.println("Hình tam giác quay " + goc + " độ quanh tâm.");
    }

    @Override
    public void diChuyen(double dx, double dy) {
        x += dx;
        y += dy;
        System.out.println("Hình tam giác di chuyển đến (" + x + "," + y + ")");
    }
}