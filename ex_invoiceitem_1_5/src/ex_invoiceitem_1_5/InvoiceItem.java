package ex_invoiceitem_1_5;

public class InvoiceItem {
	private String id, desc;
	private int qty;
	private double unitPrice;

	// constructors
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	// get
	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public int getQty() {
		return qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double getTotal() {
		return unitPrice * qty;
	}

	// set
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	// toString
	public String toString() {
		return "InvoiceItem[id = " + id + ", desc = " + desc + ", qty = " + qty + ", unitPrice = " + unitPrice;
	}
}