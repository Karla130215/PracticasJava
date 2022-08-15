package models;

public class Purchases {

    private int id;
    private int code;
    private String product_name;
    private int purchases_amount;
    private double purchase_price;
    private double purchase_subtotal;
    private double total;
    private String created;

    public Purchases() {
    }

    public Purchases(int id, int code, String product_name, int purchases_amount, double purchase_price, double purchase_subtotal, double total, String created) {
        this.id = id;
        this.code = code;
        this.product_name = product_name;
        this.purchases_amount = purchases_amount;
        this.purchase_price = purchase_price;
        this.purchase_subtotal = purchase_subtotal;
        this.total = total;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getPurchases_amount() {
        return purchases_amount;
    }

    public void setPurchases_amount(int purchases_amount) {
        this.purchases_amount = purchases_amount;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public double getPurchase_subtotal() {
        return purchase_subtotal;
    }

    public void setPurchase_subtotal(double purchase_subtotal) {
        this.purchase_subtotal = purchase_subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
   
}
