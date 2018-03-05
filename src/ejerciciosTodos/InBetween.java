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
public class InBetween {
    public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        Integer n1 = input.nextInt();
        System.out.println("Input other number: ");
        Integer n2 = input.nextInt();
        for(int i=n1;i<=n2;i++){
            System.out.println(i+"  ");
        }
    }
}
