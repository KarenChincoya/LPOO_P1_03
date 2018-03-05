/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

/**
 *
 * @author Karen Velasco
 */
public class SalesPerson {
    Integer ID;
    Double annualSales;
    public SalesPerson(){
        this.ID = 0;
        this.annualSales = 0.0;
    }
    public SalesPerson(Integer ID, Double annualSales){
        this.ID = ID;
        this.annualSales = annualSales;
    }
    public void setID(Integer ID){
        this.ID = ID;
    }
    public Integer getID(){
        return ID;
    }
    public void setAnnualSales(Double annualSales){
        this.annualSales = annualSales;
    }
    public Double getAnnualSales(){
        return annualSales;
    }
    
}
