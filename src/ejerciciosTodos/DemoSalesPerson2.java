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
public class DemoSalesPerson2 {
 public void main(){
        SalesPerson[] arreglo = new SalesPerson[10];
        Integer value = 111;
        Double price = 25000.0;
        for(int i=0;i<10;i++){
            arreglo[i].setID(value);
            arreglo[i].setAnnualSales(price);
            value++;
            price+=5000.0;
        }
        for(int i=0;i<10;i++){
            System.out.println("Sales person "+(i+1));
            System.out.println(arreglo[i].getID());
            System.out.println(arreglo[i].getAnnualSales());
        }
    }   
}
