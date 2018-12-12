/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author N
 */
public class BillInfo {
    private String billID;
    private String productID;
    private String customerID;
    private int quantity;
    

    public BillInfo() {
    }

    public BillInfo(String billID, String productID, String customerID, int quantity) {
        this.billID = billID;
        this.productID = productID;
        this.customerID = customerID;
        this.quantity = quantity;
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
