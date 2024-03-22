/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Order {
    private int  orderID;
    private int companyID;
    private int  productID;
    private  int quantity ;
    public Order (){
        
    }

    public Order(int orderID, int companyID, int productID, int quantity) {
        this.orderID = orderID;
        this.companyID = companyID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "OrderID: " + orderID+ "\nCompanyID: " + companyID
                + "\nProductID: " + productID + "\nQuantity: " + quantity  ;

    }
}
