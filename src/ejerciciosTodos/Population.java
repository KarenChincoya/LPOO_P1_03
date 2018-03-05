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
public class Population {
    public void main(){
        Integer years = 0;
        Double mexico = 114.0;
        Double usa = 312.0;
        System.out.println("Population");
        System.out.println("Mexico\t USA");
        while(mexico<usa){
            mexico = mexico*1.0101;
            usa = usa * 0.9985;
            System.out.println(mexico+"\t"+usa);
            years++;
        }
        System.out.println("Total years: "+years);
    }
}
