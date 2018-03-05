/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5.Programming_Exercises;

/**
 *
 * @author Karen Velasco
 */
import ejerciciosTodos.DigitalCamera;
    import java.util.Scanner;

public class E7 {
    //variables de instancia
    //constructores
    public static void main(String[] args){
        String brand;
        Integer mp;
        Scanner input = new Scanner(System.in);
        System.out.println("Camera 1");
        System.out.print("Input the brand: ");
        brand = input.nextLine();
        System.out.print("Input the mp: ");
        mp = input.nextInt();
        DigitalCamera dc1 = new DigitalCamera(brand, mp);
        
        input.nextLine();
        
        System.out.println("Camera 2");
        System.out.print("Input the brand: ");
        brand = input.nextLine();
        System.out.print("Input the mp: ");
        mp = input.nextInt();
        DigitalCamera dc2 = new DigitalCamera(brand, mp);
        
        input.nextLine();
        
        System.out.println("Camera 3");
        System.out.print("Input the brand: ");
        brand = input.nextLine();
        System.out.print("Input the mp: ");
        mp = input.nextInt();
        DigitalCamera dc3 = new DigitalCamera(brand, mp);
        
        input.nextLine();
        
        System.out.println("Camera 4");
        System.out.print("Input the brand: ");
        brand = input.nextLine();
        System.out.print("Input the mp: ");
        mp = input.nextInt();
        DigitalCamera dc4 = new DigitalCamera(brand, mp);        
        
        System.out.println("\n**************************************************\n");
        dc1.digitalCameraDetails();
        System.out.println("\n**************************************************\n");
        dc2.digitalCameraDetails();
        System.out.println("\n**************************************************\n");
        dc3.digitalCameraDetails();
        System.out.println("\n**************************************************\n");
        dc4.digitalCameraDetails();
    }
}
