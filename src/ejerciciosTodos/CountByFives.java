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
public class CountByFives {
    public void main(){
        for(int i=5;i<=200;i+=5){
            if(i%50==0)
                System.out.println("\n");
            System.out.println(i+" ");
        }
    }
}
