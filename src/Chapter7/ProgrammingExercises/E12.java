/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7.ProgrammingExercises;

/**
 *
 * @author Karen Velasco
 */
import java.util.Scanner;
public class E12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean status = false;
        String p = ""; 
            System.out.println("Password requirements:");
            System.out.println("Lenght: 6-10");
            System.out.println("At least one letter and one digit.");
        while(status==false){
            System.out.println("Input the NEW password: ");
            p = input.next();
            char [] c = p.toCharArray();
            int letters=0, numbers=0;
            Integer aux;
            for(int i=0;i<c.length;i++){
                //debes evaluar cada elemento para ver si alguno es 
                aux = (int) c[i];
                if(aux>=48 && aux<=57)
                    numbers++;
                if((aux>=65 && aux<=90) || (aux>=97 && aux<=122))
                    letters++;
            }
            if(p.length()>=6 && p.length()<=10 && letters>0 && numbers>0)
                status = true;
        }
        status = false;
        while(status==false){
            System.out.println("Input the password: ");
            String nuevaStr = input.next();
            if(p.compareTo(nuevaStr)==0){
                System.out.println("Welcome!");
                status=true;                
            }else{
                System.out.println("The password is incorrect. ");
            }
        }
        
    }
}
