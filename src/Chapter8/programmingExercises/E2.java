/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class E2 {
    //array
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Double n=0.0;
        Double[] arreglo = new Double[1000];
        int cont=0;
        while(n!=99999){
            System.out.println("Input a number: ");
            n = input.nextDouble();
            arreglo[cont] = n;
            cont++;
        }
        if(arreglo[1]==null){
            System.out.println("ERROR. You didn't type a number. ");
        }else{
            int i=0;
            Double aux = arreglo[i];
            while(aux!=null){
                aux = arreglo[i];
                System.out.println(arreglo[i]);
                i++;
            }
        }
        
    }
    
}
