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
public class CountByAnything {
    public void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number to count by: ");
        Integer n = input.nextInt();
        int j = 0;
        for(int i=n;i<=200;i+=5){
            if(j%10==0)
                System.out.println("\n");
            System.out.println(i+" ");
            j++;
        }
    }
}
