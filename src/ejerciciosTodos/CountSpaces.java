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
public class CountSpaces {
    public void main(){
        String sentence = "The person who says something is impossible should not interrupt the person who is doing it."; //numero de palabras menos uno
        String delims = " ";
        String[] tokens = sentence.split(delims);
        Integer k = tokens.length -1;        
        System.out.println("Spaces: "+k);
    }
}
