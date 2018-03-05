/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosTodos;

import Chapter8.programmingExercises.E7;

/**
 *
 * @author Karen Velasco
 */
public class Student {
    Integer ID;
    E7[] course = new E7[5];
    public void setID(Integer ID){
        this.ID = ID;
    }
    public Integer getID(){
        return ID;
    }
    public E7 getCollegeCourse(Integer i){
        return course[i];
    }
    public void setCollegeCourse(E7 c, Integer i){
        course[i] = c;
    }
}
