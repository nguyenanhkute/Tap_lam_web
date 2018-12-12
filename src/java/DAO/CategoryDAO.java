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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author N
 */
public class CategoryDAO {
    
    public ArrayList<Category> getListCategory() throws SQLException{
        Connection connection = DBConnect.getConnecttion();
        ArrayList<Category> list = new ArrayList<>();
        String sql = "select MaLoaiSP, TenLoaiSP, TenDM from LOAISANPHAM LSP JOIN DANHMUC DM ON LSP.MaDM = DM.MaDM ";
        try {
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setCategoryID(rs.getString("MaLoaiSP"));
                category.setCategoryName(rs.getString("TenLoaiSP"));
                category.setTypeName(rs.getString("TenDM"));
                list.add(category);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public ArrayList<Category> getListTypeName() throws SQLException{
        Connection connection = DBConnect.getConnecttion();
        ArrayList<Category> list = new ArrayList<>();
        String sql = "select MaDM,TenDM from DANHMUC ";
        try {
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setTypeID(rs.getString("MaDM"));
                category.setTypeName(rs.getString("TenDM"));
                list.add(category);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public String getTypeID(String str){
        try {
            Connection connection = DBConnect.getConnecttion();
            String sqls = "select MaDM from DANHMUC WHERE TenDM="+str+"";
            PreparedStatement ps = connection.prepareCall(sqls);
            ps.setString(1,str);
             
            ResultSet st=  ps.executeQuery();
            return st.getString("MaDanhMuc");
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
    
    public boolean insertCategoryDAO(Category c)
    {
      try{
         Connection connection = DBConnect.getConnecttion();
         String sql = "EXEC lsp_Insert ?,?";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, c.getTypeName());
         ps.setString(2, c.getCategoryName());
         
         return ps.executeUpdate()==1 ; 
        } catch (SQLException e) 
        {
            return false;
        }
    }
    
    public boolean updateCategoryDAO(Category c)
    {
      try{
         Connection connection = DBConnect.getConnecttion();
         String sql = "EXEC UPDATE_LSP ?,?";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, c.getCategoryID());
         ps.setString(2, c.getCategoryName());
         
         return ps.executeUpdate()==1 ; 
        } catch (SQLException e) 
        {
            return false;
        }
    }
        public static void main(String[] args) throws SQLException
    {
        CategoryDAO sp= new CategoryDAO();
        sp.updateCategoryDAO(new Category( "LSP0002","BANH DOREMON", "Câu d?i")); 
   
    }
        
    
}

