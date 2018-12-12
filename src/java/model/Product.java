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
public class Product {
    private String productID;
    private String CategoryID;//mã loại sản phẩm
    private String CategoryName;//tên loại sản phẩm
    private String SupplierID;  // MÃ Nhà cung cấp
    private String SupplierName; // TÊN NHÀ CUNG CẤP
    private String productName;// TÊN SẢN PHẨM
    private String productImage;// HÌNH ẢNH SẢN PHẨM
    private int productPrice;// GIÁ
    private String productDescribe;//MÔ TẢ
    private String productStatus;// TÌNHTRẠNG 
    
    public Product(String SupplierName,String productCategoryName, String productName, String productImage, int productPrice, String productDescribe, String productStatus) {
        //tenLSP,tenNCC,tenSP,"",gia,ngay,mota,tinht
        this.CategoryName = productCategoryName;
        this.SupplierName = SupplierName;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productDescribe = productDescribe;
        this.productStatus = productStatus;
    }

    public Product(String productID,String productName, int productPrice, String productDescribe, String productStatus) {
        this.productID= productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescribe = productDescribe;
        this.productStatus = productStatus;
    }
    public Product() {
    }

    
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    
    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(String SupplierID) {
        this.SupplierID = SupplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getProductPrice(){
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }


    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }


    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

}
