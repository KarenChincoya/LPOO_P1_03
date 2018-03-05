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
import Chapter8.programmingExercises.E7;
import ejerciciosTodos.Student;
import java.util.Scanner;
public class InputGrades {
    //5 different courses, 10 students
    public void main(){
        Scanner input = new Scanner(System.in);
        Student[] alumno = new Student[10];
        Integer id;
        String idCurso;
        Integer creditHours;
        String letterGrade;
        for(int i=0;i<10;i++){ //Ciclo para ALUMNOS
            System.out.println("Student "+(i+1));
            System.out.println("Input the Student ID: ");
            id = input.nextInt();
            alumno[i].setID(id);
            //Para cada alumno 5 cursos
            System.out.println("Input the data for each course: ");
            for(int j=0;j<5;j++){//Ciclo para CURSOS
                System.out.println("Course "+(i+1));
                System.out.println("Course ID: ");
                idCurso = input.next();
                System.out.println("Credit Hours: ");
                creditHours = input.nextInt();
                do{
                 System.out.println("Letter grade: ");//a, b,c,d,e,f
                letterGrade = input.next();   
                }while(!(letterGrade=="A" || letterGrade=="B" || letterGrade=="C" ||letterGrade=="D"||letterGrade=="E"||letterGrade=="F"));
                
                E7 curso = new E7();
                
                curso.setID(idCurso);
                curso.setCreditHours(creditHours);
                curso.setLetterGrade(letterGrade);
               
                alumno[i].setCollegeCourse(curso, j);
            }
        }
    }
}
