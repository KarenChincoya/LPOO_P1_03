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
public class E1 {
    public static void main(String[] args){
        Integer[] k = {1,2,3,4,5,6,7,8};
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+"  ");
        }
        for(int i=(k.length-1);i>=0;i--){
            System.out.print(k[i]+"  ");
        }
    }
}
