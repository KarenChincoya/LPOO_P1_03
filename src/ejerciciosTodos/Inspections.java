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
public class Inspections {
    public void main(){
        Integer factory;
        Integer[] factories = new Integer[4];
        for(int i=0;i<4;i++){
            factories[i]=0;
        }
        for(int i=1;i<=52;i++){//52 weeks
            factory = 1+ (int) (Math.random()*4); //factory -1 para el arreglo
            System.out.println(factory);
            factories[factory-1]++;
        }
        //print the percentae 
        for(int i=0;i<4;i++){
            System.out.println("Factory "+(i+1)+" = "+factories[i]*(100.0/52.0)+"%");
        }
    }
}
