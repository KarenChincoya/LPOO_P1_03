/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5.Programming_Exercises;

import ejerciciosTodos.Park;

/**
 *
 * @author Karen Velasco
 */
public class E8 {
    public static void main(String[] args){
           
        Park p1 = new Park();
        Park p2 = new Park();
        Park p3 = new Park();
        
        //tienes que agreagar datos
        p1.setName("Park 1");
        p1.setSize(400);
        p1.setPicnicFacilities(true);
        p1.setTennisCourt(true);
        p1.setPlayground(true);
        p1.setSwimmingPool(true);
    
        
        p2.setName("Park 2");
        p2.setSize(375);
        p2.setPicnicFacilities(true);
        p2.setTennisCourt(false);
        p2.setPlayground(true);
        p2.setSwimmingPool(true);
        
        p3.setName("Park 3");
        p3.setSize(256);
        p3.setPicnicFacilities(true);
        p3.setTennisCourt(false);
        p3.setPlayground(false);
        p3.setSwimmingPool(true);
        
        System.out.println("Park 1: ");
        System.out.println((p1.picnicAndPlayground()) ? "Picnic and Playground":"It doesn't have both picnic and Playground");
        System.out.println((p1.allServices()) ? "All services":"It doesn't have all services");
        System.out.println("Number of facilites: "+p1.numberOfFacilities());
        
        System.out.println("Park 2: ");
        System.out.println((p2.picnicAndPlayground()) ? "Picnic and Playground":"It doesn't have both picnic and Playground");
        System.out.println((p2.allServices()) ? "All services":"It doesn't have all services");
        System.out.println("Number of facilites: "+p2.numberOfFacilities());
        
        System.out.println("Park 3: ");
        System.out.println((p3.picnicAndPlayground()) ? "Picnic and Playground":"It doesn't have both picnic and Playground");
        System.out.println((p3.allServices()) ? "All services":"It doesn't have all services");
        System.out.println("Number of facilites: "+p3.numberOfFacilities());
    }    
}
