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
public class Category {
    private String categoryID;
    private String categoryName;
    private String typeID;
    private String typeName;
    
    public Category() {
    }

    public Category(String categoryID, String categoryName,String typeID, String typeName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.typeID= typeID;
        this.typeName = typeName;
    }
    public Category(String categoryID,String categoryName, String typeName) {
        this.typeName = typeName;
        this.categoryName = categoryName;
        this.categoryID = categoryID;
    }
    
    public Category(String categoryName, String typeName) {
        this.typeName = typeName;
        this.categoryName = categoryName;
    }
 
    public String getCategoryID() {
        return categoryID;
    }
 
    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }
 
    public String getCategoryName() {
        return categoryName;
    }
 
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }
    
    

    public String getTypeName() { 
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    
    
}
