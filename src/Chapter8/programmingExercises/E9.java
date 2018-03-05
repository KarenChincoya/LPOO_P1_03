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
public class E9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer[] phoneNumbers = new Integer[20];
        String[] names = new String[20];
        int i=0;
        String aux = "";
        while(i<20 && aux!="zzz"){
            
            System.out.println("Name: ");
            aux = input.nextLine();
            if(aux!="zzz"){
                names[i]=aux;
                System.out.println("Number: ");
                i++;
            }
            input.nextLine();
        }
        System.out.println("Numbers entered: "+i);
        //print all the names
        Integer num = phoneNumbers[0];
        i = 0;
        while(num!=null){
            System.out.print(names[i]+"\t"+phoneNumbers[i]);
            i++;
        }
        //ask to the user for a name
        System.out.println("Input a name: ");
        aux = input.next();
        boolean encontrado = false;
        i = 0;
        while(encontrado==false && i<20){
            if(names[i].compareTo(aux)==0){
                System.out.println("Number: "+phoneNumbers[i]);
                encontrado = true;
            }
            i++;
        }
    }
}
