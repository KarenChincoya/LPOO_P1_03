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

public class E5 {
    public void main(){
        Scanner input = new Scanner(System.in);
        E4[] grabaciones = new E4[5];
        String title;
        String artist;
        Integer playingTime;
//prompt the user for the data field
        for(int i=0;i<5;i++){
            System.out.println("Record "+(i+1));
            System.out.println("Title: ");
            title = input.nextLine();
            artist = input.nextLine();
            playingTime = input.nextInt();
        }
        
    }
}
