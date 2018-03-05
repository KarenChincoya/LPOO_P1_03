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
import java.util.Scanner;
public class EvenEntryLoop {
    public void main(){
        Scanner input = new Scanner(System.in);
        Integer n=0;
        do{
            System.out.println("If you want to leave enter 999. ");
            System.out.println("Input an even number: ");
            n = input.nextInt();
            if(n%2 ==0)
                System.out.println("Good job!");
            else if(n!=999)
                    System.out.println("ERROR. Try again.");
        }while(n!=999);
    }
}
