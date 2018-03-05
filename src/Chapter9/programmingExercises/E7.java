/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.programmingExercises;

import ejerciciosTodos.Service;

/**
 *
 * @author Karen Velasco
 */
public class E7 {
    public static void main(String[] args){
        String serviceDescription;
        Double price;
        Integer minutes;
    
        Service[] service = new Service[6];
        service[0] = new Service("Cut", 8.0, 15);
        service[1] = new Service("Shampoo", 4.0, 10);
        service[2] = new Service("Manicure", 18.0, 30);
        service[3] = new Service("Style", 48.0, 55);
        service[4] = new Service("Permanent", 18.0, 35);
        service[5] = new Service("Trim", 6.0, 5);
        //sortByprice
        for(int i =0;i<6;i++){
            for(int j=0;j<5;j++){
                if(service[i].getPrice()<service[j].getPrice()){
                    //SWAP
                    serviceDescription = service[i].getServiceDescription();
                    price = service[i].getPrice();
                    minutes = service[i].getMinutes();
                    
                    service[i].setMinutes(service[j].getMinutes());
                    service[i].setPrice(service[j].getPrice());
                    service[i].setServiceDescription(service[j].getServiceDescription());
                    
                    service[j].setMinutes(minutes);
                    service[j].setPrice(price);
                    service[j].setServiceDescription(serviceDescription);
                }
            }
        }
        for(int i =0;i<6;i++){
            System.out.println(service[i].getPrice());
        }
        
    }
}
