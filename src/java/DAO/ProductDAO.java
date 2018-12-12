/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
/**
 *
 * @author N
 */
public class ProductDAO {
    
    public ArrayList<Product> getListProduct() throws SQLException{
        Connection connection = DBConnect.getConnecttion();
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select * from (SANPHAM SP JOIN LOAISANPHAM LSP  on SP.MaLoaiSP= LSP.MaLoaiSP)JOIN NHACUNGCAP NCC ON NCC.MaNCC= SP.MaNCC";
        try {
        PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setProductID(rs.getString("MaSP"));
                product.setCategoryName(rs.getString("TenLoaiSP"));
                product.setProductName(rs.getString("TenSP"));
                product.setSupplierName(rs.getString("TenNCC"));
                product.setProductPrice(rs.getInt("Gia"));
                product.setProductDescribe(rs.getString("MoTa"));
                product.setProductStatus(rs.getString("TinhTrang"));
                
                list.add(product);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    // LẤY DANH SÁCH LOẠI SẢN PHẨM @maNCC, @maLSP, @tenSP, @anhSP, @gia , @moTa, @tinhTrang
    public Product getProduct(String product_ID) throws SQLException{
        Connection connection = DBConnect.getConnecttion();
        Product product = new Product();
        String sql = "select TenSP,MoTa,Gia,TinhTrang from SANPHAM WHERE MaSP='"+product_ID+"'";
        try {
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                product.setProductName(rs.getString("TenSP"));
                product.setProductDescribe(rs.getString("MoTa"));
                product.setProductPrice(rs.getInt("Gia"));
                product.setProductStatus(rs.getString("TinhTrang"));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }
    // LẤY DANH SÁCH LOẠI SẢN PHẨM @maNCC, @maLSP, @tenSP, @anhSP, @gia , @moTa, @tinhTrang
    public ArrayList<Product> getListCategoryName() throws SQLException{
        Connection connection = DBConnect.getConnecttion();
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select MaLoaiSP,TenLoaiSP from LOAISANPHAM";
        try {
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setCategoryID(rs.getString("MaLoaiSP"));
                product.setCategoryName(rs.getString("TenLoaiSP"));
                list.add(product);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    //LẤY DANH SÁCH TÊN NHÀ CUNG CẤP
    public ArrayList<Product> getListSupplierName() throws SQLException{
        Connection connection = DBConnect.getConnecttion();
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select MaNCC, TenNCC FROM NHACUNGCAP";
        try {
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setSupplierID(rs.getString("MaNCC"));
                product.setSupplierName(rs.getString("TenNCC"));
                list.add(product);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    //insert product
    public boolean insertProductDAO(Product p)
    {
      try{
         Connection connection = DBConnect.getConnecttion();
         String sql = "EXEC sp_Insert ?,?,?,?,?,?,?";
	
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, p.getSupplierName());
         ps.setString(2, p.getCategoryName());
         ps.setString(3, p.getProductName());
         ps.setString(4, p.getProductImage());
         ps.setInt(5, p.getProductPrice());
         ps.setString(6, p.getProductDescribe());
         ps.setString(7, p.getProductStatus());
         
         return ps.executeUpdate()==1 ; 
        } catch (Exception e) 
        {
            return false;
        }
    }
    
    public boolean updateProductDAO(Product p)
    {
      try{
         Connection connection = DBConnect.getConnecttion();
         String sql = "EXEC UPDATE_SP ?,?,?,?,?";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, p.getProductID());
         ps.setString(2, p.getProductName());
         ps.setInt(3, p.getProductPrice());
         ps.setString(4, p.getProductDescribe());
         ps.setString(5, p.getProductStatus());
         
         return ps.executeUpdate()==1 ; 
        } catch (SQLException e) 
        {
            return false;
        }
      
    }
    
    public static void main(String[] args) throws SQLException
    {
        System.out.println(new ProductDAO().getProduct("SP00001"));
        //exec sp_Insert 'NCC0002','LSP0001','KEO DEO','',12000,'2/2/2012','','CÒN'
        //sp.insertProductDAO(new Product("N Bánh k?o Hoa Mai", "Bánh", "KEO DEO", "","12000", " ", "CÒN"));
        //ProductDAO sp1 = new ProductDAO();
    }
}
