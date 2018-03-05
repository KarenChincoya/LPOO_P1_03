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
public class BarGraph {
    public void main(){
        Scanner input = new Scanner(System.in);
        String[] names = {"Pam", "Leo", "Kim", "Bob"};
        Integer[] cars = new Integer[4];
        for(int i=0;i<4;i++){
            System.out.println("Enter cars sold by "+names[i]);
            cars[i] = input.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.printf(names[i]+"\t");
            for(int j=0;j<cars[i];j++){
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
