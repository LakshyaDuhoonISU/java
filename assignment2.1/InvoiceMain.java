// Q4

class InvoiceItem {
    private String id, desc;
    private int qty;
    private double unitPrice;

    InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return qty * unitPrice;
    }

    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}

public class InvoiceMain {
    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("1", "Item 1", 2, 100.0);
        System.out.println(i1);
        System.out.println("Total: " + i1.getTotal());
        i1.setQty(3);
        i1.setUnitPrice(200.0);
        System.out.println(i1);
        System.out.println("Total: " + i1.getTotal());
    }
}
