/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.billing.system;

/**
 *
 * @author Sunil Kumar Gupta
 */
public class Stock {

    private String id;
    private String Product_Name;
    private int available;
    private double mrp;
    
    public Stock(String id,String pname,int available, double mrp)
    {
        this.id=id;
        this.Product_Name=pname;
        this.available=available;
        this.mrp=mrp;
        
        
    }

    public String getId() {
        return id;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public int getAvailable() {
        return available;
    }

    public double getMrp() {
        return mrp;
    }
    
}    

