/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.programmingExercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Karen Velasco
 */
public class E3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer[] arreglo = new Integer[20];
        //leer los datos
        System.out.println("Input 20 numbers: ");
        for(int i=0;i<20;i++){
            arreglo[i] = input.nextInt();
        }
//encontrar la media
        double suma = 0.0;
        for(int i=0;i<5;i++){
            suma+= arreglo[i];
        }
        System.out.println("Mean: "+(suma/5.0));
        Arrays.sort(arreglo);
        System.out.println("Median: "+((arreglo[9]+arreglo[10])/2.0));
    }
}
