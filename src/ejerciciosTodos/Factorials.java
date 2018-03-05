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
public class Factorials {
    public static void main(){
        Integer fact=1;
        for(int i=1;i<=10;i++){
            for(int j=i;j>0;j--){
                fact*=j;
            }
            System.out.println(i+"! = "+fact);
            fact = 1;
        }
    }
}
