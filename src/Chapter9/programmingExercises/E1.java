/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9.programmingExercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.*;
public class E1 {
    public static void main(String[] args){
        String[] lista =     {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        Arrays.sort(lista);
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
   
}
