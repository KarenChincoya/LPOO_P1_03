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
public class EverySum {
    public void main(){
        for(int i=1;i<=50;i++){
            Integer suma=0;
            for(int j=1;j<=i;j++){
                suma+=j;
            }
            System.out.println(suma);
        }
    }
}
