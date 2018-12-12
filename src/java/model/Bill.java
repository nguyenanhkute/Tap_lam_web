/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author N
 */
public class Bill {
    private String billID;
    private String customerID;
    
    private String address;
    
    private String status;
    private double total;
    private Date dateOder;
    

    public Bill() {
    }

    public Bill(String billID, String customerID, String address, String status, double total, Date dateOder) {
        this.billID = billID;
        this.customerID = customerID;
        this.address = address;
        this.status = status;
        this.total = total;
        this.dateOder = dateOder;
        
    }
    public Bill( String customerID, String address, String status, double total) {
        //this.billID = billID;
        this.customerID = customerID;
        this.address = address;
        this.status = status;
        this.total = total;
        //this.dateOder = dateOder;
        
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDateOder() {
        return dateOder;
    }

    public void setDateOder(Date dateOder) {
        this.dateOder = dateOder;
    }
}
