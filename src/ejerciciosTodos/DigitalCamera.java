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
public class DigitalCamera {
    String brand;
        Integer megapixels;
        Double price;
        
        //constructores 
        public DigitalCamera(String brand, Integer megapixels){
            this.brand = brand;
            if(megapixels>10)
                this.megapixels = megapixels;
            if(megapixels<=6)
                this.price = 99.0;
            else
                this.price = 129.0;
        }
        
        public void digitalCameraDetails(){ 
            System.out.println("Brand: "+brand);
            System.out.println("Resolution in megapixels: "+megapixels);
            System.out.println("Price: "+price);
            
        }
    
}
